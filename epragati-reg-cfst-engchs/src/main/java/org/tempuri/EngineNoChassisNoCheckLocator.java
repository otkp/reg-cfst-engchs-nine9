/**
 * EngineNoChassisNoCheckLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EngineNoChassisNoCheckLocator extends org.apache.axis.client.Service implements org.tempuri.EngineNoChassisNoCheck {

    public EngineNoChassisNoCheckLocator() {
    }


    public EngineNoChassisNoCheckLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EngineNoChassisNoCheckLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EngineNoChassisNoCheckSoap
    private java.lang.String EngineNoChassisNoCheckSoap_address = "http://202.65.142.140/OTSIECCHECK/EngineNoChassisNoCheck.asmx";

    public java.lang.String getEngineNoChassisNoCheckSoapAddress() {
        return EngineNoChassisNoCheckSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EngineNoChassisNoCheckSoapWSDDServiceName = "EngineNoChassisNoCheckSoap";

    public java.lang.String getEngineNoChassisNoCheckSoapWSDDServiceName() {
        return EngineNoChassisNoCheckSoapWSDDServiceName;
    }

    public void setEngineNoChassisNoCheckSoapWSDDServiceName(java.lang.String name) {
        EngineNoChassisNoCheckSoapWSDDServiceName = name;
    }

    public org.tempuri.EngineNoChassisNoCheckSoap getEngineNoChassisNoCheckSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EngineNoChassisNoCheckSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEngineNoChassisNoCheckSoap(endpoint);
    }

    public org.tempuri.EngineNoChassisNoCheckSoap getEngineNoChassisNoCheckSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.EngineNoChassisNoCheckSoapStub _stub = new org.tempuri.EngineNoChassisNoCheckSoapStub(portAddress, this);
            _stub.setPortName(getEngineNoChassisNoCheckSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEngineNoChassisNoCheckSoapEndpointAddress(java.lang.String address) {
        EngineNoChassisNoCheckSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.EngineNoChassisNoCheckSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.EngineNoChassisNoCheckSoapStub _stub = new org.tempuri.EngineNoChassisNoCheckSoapStub(new java.net.URL(EngineNoChassisNoCheckSoap_address), this);
                _stub.setPortName(getEngineNoChassisNoCheckSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EngineNoChassisNoCheckSoap".equals(inputPortName)) {
            return getEngineNoChassisNoCheckSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "EngineNoChassisNoCheck");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "EngineNoChassisNoCheckSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EngineNoChassisNoCheckSoap".equals(portName)) {
            setEngineNoChassisNoCheckSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
