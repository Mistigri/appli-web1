/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface BanqueService extends java.rmi.Remote {
    public java.lang.String test() throws java.rmi.RemoteException;
    public double conversionEuroToDL(double montant) throws java.rmi.RemoteException;
    public service.Compte getCompte(java.lang.Long code) throws java.rmi.RemoteException;
    public service.Compte[] getComptes() throws java.rmi.RemoteException;
}
