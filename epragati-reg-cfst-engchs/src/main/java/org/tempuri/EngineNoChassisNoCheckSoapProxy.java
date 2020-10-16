package org.tempuri;

public class EngineNoChassisNoCheckSoapProxy implements org.tempuri.EngineNoChassisNoCheckSoap {
  private String _endpoint = null;
  private org.tempuri.EngineNoChassisNoCheckSoap engineNoChassisNoCheckSoap = null;
  
  public EngineNoChassisNoCheckSoapProxy() {
    _initEngineNoChassisNoCheckSoapProxy();
  }
  
  public EngineNoChassisNoCheckSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEngineNoChassisNoCheckSoapProxy();
  }
  
  private void _initEngineNoChassisNoCheckSoapProxy() {
    try {
      engineNoChassisNoCheckSoap = (new org.tempuri.EngineNoChassisNoCheckLocator()).getEngineNoChassisNoCheckSoap();
      if (engineNoChassisNoCheckSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)engineNoChassisNoCheckSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)engineNoChassisNoCheckSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (engineNoChassisNoCheckSoap != null)
      ((javax.xml.rpc.Stub)engineNoChassisNoCheckSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.EngineNoChassisNoCheckSoap getEngineNoChassisNoCheckSoap() {
    if (engineNoChassisNoCheckSoap == null)
      _initEngineNoChassisNoCheckSoapProxy();
    return engineNoChassisNoCheckSoap;
  }
  
  public java.lang.String checkEngineNoChassisNoOTSI(java.lang.String engineNo, java.lang.String chassisNo) throws java.rmi.RemoteException{
    if (engineNoChassisNoCheckSoap == null)
      _initEngineNoChassisNoCheckSoapProxy();
    return engineNoChassisNoCheckSoap.checkEngineNoChassisNoOTSI(engineNo, chassisNo);
  }
  
  
}