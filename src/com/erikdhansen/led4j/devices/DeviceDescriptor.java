/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.led4j.devices;

/**
 *
 * @author ehansen
 */
public class DeviceDescriptor {
    
    int VENDOR_ID  = 0x0;
    int PRODUCT_ID = 0x0;
    String MANUF_STRING = "";
    String PRODUCT_STRING = "";
    int VERSION = 0x0;
    int SERIAL_NUM = 0;
    
    
    public static DeviceDescriptor descriptor (int vendorId, 
                                                int productId, 
                                                String manufString, 
                                                String prodString, 
                                                int version, 
                                                int serialNum) {
        DeviceDescriptor dd = new DeviceDescriptor();
            dd.VENDOR_ID = vendorId;
            dd.PRODUCT_ID = productId;
            dd.MANUF_STRING = manufString;
            dd.PRODUCT_STRING = prodString;
            dd.VERSION = version;
            dd.SERIAL_NUM = serialNum;
         return dd;
    }
}
