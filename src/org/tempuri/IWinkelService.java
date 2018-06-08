/**
 * IWinkelService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IWinkelService extends java.rmi.Remote {
    public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException;
    public void register(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WinkelServiceLibrary.User logIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WinkelServiceLibrary.Item[] getItems() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WinkelServiceLibrary.User buyItem(org.datacontract.schemas._2004._07.WinkelServiceLibrary.Purchase p, org.datacontract.schemas._2004._07.WinkelServiceLibrary.User u) throws java.rmi.RemoteException;
}
