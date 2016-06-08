/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.led4j.dreamlink;

/**
 *
 * @author ehansen
 */
public class Dreamlink21x7 {
    
    public final static int VENDOR_ID  = 0x1d34;
    public final static int PRODUCT_ID = 0x0013;
    public final static String MANUF_STRING = "Dream Link";
    public final static String PRODUCT_STRING = "USB LED Message Board v1.0";
    public final static int VERSION = 0x1;
    public final static int SERIAL_NUM = 1;
    
    LEDConfiguration21x7 led = new LEDConfiguration21x7();
    
    public Dreamlink21x7() {
        
    }
    
    public LEDConfiguration21x7 getLEDConfig() {
        return led;
    }
    
    @Override
    public String toString() {
        return led.toString();
    }
}
