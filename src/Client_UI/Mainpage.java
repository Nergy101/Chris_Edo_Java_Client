package Client_UI;

import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.datacontract.schemas._2004._07.WinkelServiceLibrary.Item;
import org.datacontract.schemas._2004._07.WinkelServiceLibrary.Purchase;
import org.datacontract.schemas._2004._07.WinkelServiceLibrary.User;
import org.tempuri.IWinkelServiceProxy;
import org.tempuri.WinkelService;
import org.tempuri.WinkelServiceLocator;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//WinkelService;
 
public class Mainpage extends Application {
    IWinkelServiceProxy winkelService = new IWinkelServiceProxy();
	Stage window;
	Scene scene1, scene2, scene3;
    User loggedInUser = new User();
    Item selectedItem = new Item();
    ObservableList<Item> items = FXCollections.observableArrayList();
    ObservableList<Purchase> purchaseHistory = FXCollections.observableArrayList();  
    
    public void refreshInventory() throws RemoteException{
    	items.clear();
    	ArrayList<Item> CItems = new ArrayList<Item>(Arrays.asList(winkelService.getItems()));
        
    	
        for (Item i : CItems){
        	if(i.getStock() > 0){
            items.add(i);
            System.out.println(i.toString());
        	}
        }
    }
    
    public void refreshHistory(){

    if (!(loggedInUser.getUsername() == null)){
        ArrayList<Purchase> CHist = new ArrayList<Purchase>(Arrays.asList(loggedInUser.getPurchases()));
        System.out.println(loggedInUser.getPurchases());
    	System.out.println("refresh called");
    	purchaseHistory.clear();
    	int i = 0;
        for (Purchase p : CHist){
        	i++;
        	System.out.println(i +" items in user-history");
        	purchaseHistory.add(p);
        	}
        
        }else{
        	System.out.println("Nobody has logged in");
        }
    }
    
    boolean tryParseInt(String value) {  
        try {  
            Integer.parseInt(value);  
            return true;  
         } catch (NumberFormatException e) {  
            return false;  
         }  
   }
	
    public static void main(String[] args) {
        launch(args);
    }
    
    public String Reverse(String s)
    {
        char[] charArray = s.toCharArray();
        String result = "";
        for (int i = charArray.length-1; i >= 0 ; i--){
            //System.out.print(charArray[i]);
            result+=charArray[i];
        }
        return (result);
    }
    
	@Override
    public void start(Stage primaryStage){
    	window = primaryStage;


        final Text actiontarget = new Text(); 
    	
    	//scene1 sign-up 
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        grid.add(actiontarget, 1, 6);
        Text scenetitle = new Text("Sign-up");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        primaryStage.setTitle(".Net Shop!");

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        TextField RegPwBox = new TextField();
        grid.add(RegPwBox, 1, 2);
        
        Label RegUserName = new Label("User Name:");
        grid.add(RegUserName, 0, 1);

        TextField RegUserTextField = new TextField();
        grid.add(RegUserTextField, 1, 1);
        
        RegUserTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            
            RegPwBox.setText(Reverse(newValue));
        });
        
        Button signin_btn = new Button("Sign up");
        grid.add(signin_btn, 2, 3);
        signin_btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
                try {
					winkelService.register(RegUserTextField.getText(), RegPwBox.getText());
					System.out.println("signed up: "+ RegUserTextField.getText());
					window.setScene(scene2);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					actiontarget.setText("Could not register");
				}}});
                

            scene1 = new Scene(grid);
            
        //scene2 log-in
            final Text actiontarget2 = new Text();        
            GridPane grid2 = new GridPane();
            grid2.setAlignment(Pos.CENTER);
            grid2.setHgap(10);
            grid2.setVgap(10);
            grid2.setPadding(new Insets(25, 25, 25, 25));
            
            grid2.add(actiontarget2, 1, 6);
            Text scenetitle2 = new Text("Login");
            scenetitle2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            grid2.add(scenetitle2, 0, 0, 2, 1);

            Label pw2 = new Label("Password:");
            grid2.add(pw2, 0, 2);

            TextField LogPwBox2 = new TextField();
            grid2.add(LogPwBox2, 1, 2);
            
            Label LogUserName2 = new Label("User Name:");
            grid2.add(LogUserName2, 0, 1);

            TextField LogUserTextField2 = new TextField();
            grid2.add(LogUserTextField2, 1, 1);
            
        	Label saldoLabel = new Label("Nothing yet");
            
            Button login_btn = new Button("Log-in");
            login_btn.setOnAction(new EventHandler<ActionEvent>() { 
                @Override
                public void handle(ActionEvent e) {
                	
                    actiontarget2.setFill(Color.FIREBRICK);
                    actiontarget2.setText("Log-in button pressed");
                    try {
    					System.out.println("Logged in: "+ LogUserTextField2.getText());
    					System.out.println(LogPwBox2.getText() + "login before");
    					loggedInUser = winkelService.logIn(LogUserTextField2.getText(), LogPwBox2.getText());
    					System.out.println(loggedInUser.getUsername() + "login after");
                        window.setScene(scene3);
                        refreshInventory(); //shopinv
                        saldoLabel.setText(loggedInUser.getSaldo().toString());
    				} catch (RemoteException e1) {
    					// TODO Auto-generated catch block
    					System.out.println("Fout: " + e1);
    					System.out.println("https://stackoverflow.com/questions/62929/java-net-socketexception-connection-reset");
    					System.out.println("Konden het niet fixen. Compleet nieuwe user maken helpt.");
    					System.out.println("Net alsof ie niet bij mag wat buiten de huidige sessie gebeurt, maar dat ook niet consistent.");
    					actiontarget2.setText("Connectie fout opgetreden"
    							+"\nCould not Login");
    				}
                    
                    
    
                }});
            
            grid2.add(login_btn, 1, 4);
            
            scene2 = new Scene(grid2, 400, 300);
    	
    	//scene 3 shop
        System.out.println("logged in user: "+loggedInUser.getUsername());
       
        //refreshHistory();
       
        //purchaseHistory = (ObservableList<Purchase>) CHist;
        
        ListView<Item> itemList = new ListView<Item>();
        itemList.getSelectionModel().getSelectedItem();
        itemList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Item>() {
            @Override
            public void changed(ObservableValue<? extends Item> observable, Item oldValue, Item newValue) {
                System.out.println("oldValue = " 
                        + oldValue + " newValue = " + newValue);
                selectedItem = newValue;
            }
        });
        
        ListView<Purchase> purchaseList = new ListView<Purchase>();
        purchaseList.getSelectionModel().getSelectedItem();
        
        purchaseList.setItems(purchaseHistory);
        itemList.setItems(items);
        
    	Label label3 = new Label("Welcome!");

    	
        Button refreshHistory = new Button ("Refresh history");
        refreshHistory.setOnAction(e -> {
        actiontarget2.setText("Refresh history pressed");
        refreshHistory();
        });
        
        TextField amountField = new TextField();
        Label amountLabel = new Label("p.c.");
        Button buy = new Button("Buy");
        buy.setOnAction(e -> {
            actiontarget2.setText("Buy button pressed");
			try {
				System.out.println("Bij aankoop saldo: "+loggedInUser.getSaldo());
				System.out.println("Itemnaam bij aankoop: "+selectedItem.getName());
				System.out.println(selectedItem + " = hele item");
				
				if(tryParseInt(amountField.getText()) && (selectedItem.getName() != null)){
					System.out.println(amountField.getText()+" van "+selectedItem.getName());
					short pcs = (short) Integer.parseInt(amountField.getText());
					double price =  (selectedItem.getPrice() * pcs);
					
					if(pcs < (short) selectedItem.getStock() && (price < loggedInUser.getSaldo())){
					
				
					//Purchase
				Purchase p = new Purchase();
				p.setItem(selectedItem);
				p.setItemName(selectedItem.getName());
				p.setUserUsername(loggedInUser.getUsername());

				p.setAmount(pcs);
				

				System.out.println("Saldo voor aankoop: "+loggedInUser.getSaldo());
				
				winkelService.buyItem(p, loggedInUser);
				
				loggedInUser.setSaldo(loggedInUser.getSaldo() - price);
				refreshInventory(); //shopinv
				

				System.out.println("Saldo na aankoop: "+loggedInUser.getSaldo());
				
				saldoLabel.setText(loggedInUser.getSaldo().toString());
				actiontarget2.setText("Bought: "+p.getItemName()+
									  "\namount: "+pcs+
									  "\ntotal price: "+ price);
				
				//omdat er een fixed size array is werkt het niet dit direct in C# te doen, daarom wilde we dit
				//dan lokaal doen, maar zelfs dat krijgen we niet voor elkaar.
				
				//get Purchases[]
				//ArrayList<Purchase>   <--  Purchases[]
				//ArrayList += purchase
				//ArrayList --> Purchases[]
				//set Purchases[]
			
				ArrayList<Purchase> list = new ArrayList<>(Arrays.asList(loggedInUser.getPurchases())); 
				list.add(p);
				Purchase[] array = list.toArray(new Purchase[list.size()]);
				loggedInUser.setPurchases(array);
				
				refreshHistory();
					}else{
						System.out.println("Check if have enough money, or the store doesn't have enough in stock...");
						actiontarget2.setText("1: You do not have enough money \n2: The store doesn't have enough in stock...");
					}
				}else{
					System.out.println("the Amount must be numerical! And you must have a selected value.");
					actiontarget2.setText("1: The Amount must be numerical! \n2: You must have selected an item to buy.");
				}
			} catch (Exception e1) {
				System.out.println("error!");
				actiontarget2.setText("Make sure to have an item selected!\nYou can't buy nothing... Can you?");
				e1.printStackTrace();
			}
		});
        Button refreshShopInventory = new Button("Refresh shop");
        refreshShopInventory.setOnAction(e-> {
            actiontarget2.setText("Refresh shop inventory pressed");
			try {
				refreshInventory();
			} catch (RemoteException e1) {
				System.out.println("Could not refresh inventory");
				actiontarget2.setText("Could not Refresh shop");
				e1.printStackTrace();
			}
		});
                
        GridPane grid3 = new GridPane();
        grid3.setAlignment(Pos.CENTER);
        grid3.setHgap(10);
        grid3.setVgap(10);
        grid3.setPadding(new Insets(25, 25, 25, 25));
        
        grid3.add(actiontarget2, 4, 3);
        
        grid3.add(label3, 1, 0);
        grid3.add(saldoLabel, 2, 0);
        
        grid3.add(refreshHistory, 2, 4);
        grid3.add(refreshShopInventory, 1, 4);
        grid3.add(itemList, 1, 3);
        grid3.add(purchaseList, 2, 3);
        
        grid3.add(buy, 1, 1);
        grid3.add(amountField, 2, 1);
        grid3.add(amountLabel, 3, 1);
        
        scene3 = new Scene(grid3, 1600, 900);
        
///////////////////////////////////////////////////////////////////////////
        
        window.setScene(scene2);
        
        Stage secondStage = new Stage();
        secondStage.setScene(scene1);
        secondStage.show();
        
        primaryStage.show();
    }
}