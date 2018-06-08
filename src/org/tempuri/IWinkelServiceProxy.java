package org.tempuri;

public class IWinkelServiceProxy implements org.tempuri.IWinkelService {
  private String _endpoint = null;
  private org.tempuri.IWinkelService iWinkelService = null;
  
  public IWinkelServiceProxy() {
    _initIWinkelServiceProxy();
  }
  
  public IWinkelServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIWinkelServiceProxy();
  }
  
  private void _initIWinkelServiceProxy() {
    try {
      iWinkelService = (new org.tempuri.WinkelServiceLocator()).getBasicHttpBinding_IWinkelService();
      if (iWinkelService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iWinkelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iWinkelService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iWinkelService != null)
      ((javax.xml.rpc.Stub)iWinkelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IWinkelService getIWinkelService() {
    if (iWinkelService == null)
      _initIWinkelServiceProxy();
    return iWinkelService;
  }
  
  public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException{
    if (iWinkelService == null)
      _initIWinkelServiceProxy();
    return iWinkelService.getData(value);
  }
  
  public void register(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (iWinkelService == null)
      _initIWinkelServiceProxy();
    iWinkelService.register(username, password);
  }
  
  public org.datacontract.schemas._2004._07.WinkelServiceLibrary.User logIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (iWinkelService == null)
      _initIWinkelServiceProxy();
    return iWinkelService.logIn(username, password);
  }
  
  public org.datacontract.schemas._2004._07.WinkelServiceLibrary.Item[] getItems() throws java.rmi.RemoteException{
    if (iWinkelService == null)
      _initIWinkelServiceProxy();
    return iWinkelService.getItems();
  }
  
  public org.datacontract.schemas._2004._07.WinkelServiceLibrary.User buyItem(org.datacontract.schemas._2004._07.WinkelServiceLibrary.Purchase p, org.datacontract.schemas._2004._07.WinkelServiceLibrary.User u) throws java.rmi.RemoteException{
    if (iWinkelService == null)
      _initIWinkelServiceProxy();
    return iWinkelService.buyItem(p, u);
  }
  
  
}