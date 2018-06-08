/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.WinkelServiceLibrary;

public class Item  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Double price;

    private org.datacontract.schemas._2004._07.WinkelServiceLibrary.Purchase[] purchases;

    private java.lang.Short stock;

    public Item() {
    }

    public Item(
           java.lang.String name,
           java.lang.Double price,
           org.datacontract.schemas._2004._07.WinkelServiceLibrary.Purchase[] purchases,
           java.lang.Short stock) {
           this.name = name;
           this.price = price;
           this.purchases = purchases;
           this.stock = stock;
    }


    public String toString(){
    	return(name+", price: "+price+", #inStock: "+stock);
    }
    
    
    /**
     * Gets the name value for this Item.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Item.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the price value for this Item.
     * 
     * @return price
     */
    public java.lang.Double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Item.
     * 
     * @param price
     */
    public void setPrice(java.lang.Double price) {
        this.price = price;
    }


    /**
     * Gets the purchases value for this Item.
     * 
     * @return purchases
     */
    public org.datacontract.schemas._2004._07.WinkelServiceLibrary.Purchase[] getPurchases() {
        return purchases;
    }


    /**
     * Sets the purchases value for this Item.
     * 
     * @param purchases
     */
    public void setPurchases(org.datacontract.schemas._2004._07.WinkelServiceLibrary.Purchase[] purchases) {
        this.purchases = purchases;
    }


    /**
     * Gets the stock value for this Item.
     * 
     * @return stock
     */
    public java.lang.Short getStock() {
        return stock;
    }


    /**
     * Sets the stock value for this Item.
     * 
     * @param stock
     */
    public void setStock(java.lang.Short stock) {
        this.stock = stock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.purchases==null && other.getPurchases()==null) || 
             (this.purchases!=null &&
              java.util.Arrays.equals(this.purchases, other.getPurchases()))) &&
            ((this.stock==null && other.getStock()==null) || 
             (this.stock!=null &&
              this.stock.equals(other.getStock())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPurchases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStock() != null) {
            _hashCode += getStock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Purchases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Purchase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Purchase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WinkelServiceLibrary", "Stock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
