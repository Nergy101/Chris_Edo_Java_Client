/**
 * Purchase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.WinkelServiceLibrary;

public class Purchase  implements java.io.Serializable {
    private java.lang.Short amount;

    private java.lang.Integer id;

    private org.datacontract.schemas._2004._07.WinkelServiceLibrary.Item item;

    private java.lang.String itemName;

    private java.lang.String userUsername;

    public Purchase() {
    }

    public Purchase(
           java.lang.Short amount,
           java.lang.Integer id,
           org.datacontract.schemas._2004._07.WinkelServiceLibrary.Item item,
           java.lang.String itemName,
           java.lang.String userUsername) {
           this.amount = amount;
           this.id = id;
           this.item = item;
           this.itemName = itemName;
           this.userUsername = userUsername;
    }
    
    public String toString(){
    	return("Item bought: "+itemName+" \nAmount bought: "+amount+", Price: "+item.getPrice()+" \nTotal Price: "+item.getPrice() * amount);
    	
    }


    /**
     * Gets the amount value for this Purchase.
     * 
     * @return amount
     */
    public java.lang.Short getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Purchase.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Short amount) {
        this.amount = amount;
    }


    /**
     * Gets the id value for this Purchase.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Purchase.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the item value for this Purchase.
     * 
     * @return item
     */
    public org.datacontract.schemas._2004._07.WinkelServiceLibrary.Item getItem() {
        return item;
    }


    /**
     * Sets the item value for this Purchase.
     * 
     * @param item
     */
    public void setItem(org.datacontract.schemas._2004._07.WinkelServiceLibrary.Item item) {
        this.item = item;
    }


    /**
     * Gets the itemName value for this Purchase.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this Purchase.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the userUsername value for this Purchase.
     * 
     * @return userUsername
     */
    public java.lang.String getUserUsername() {
        return userUsername;
    }


    /**
     * Sets the userUsername value for this Purchase.
     * 
     * @param userUsername
     */
    public void setUserUsername(java.lang.String userUsername) {
        this.userUsername = userUsername;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Purchase)) return false;
        Purchase other = (Purchase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.userUsername==null && other.getUserUsername()==null) || 
             (this.userUsername!=null &&
              this.userUsername.equals(other.getUserUsername())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getUserUsername() != null) {
            _hashCode += getUserUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Purchase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Purchase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "ItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "UserUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
