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
public class Dreamlink21x7 {
    
    DeviceDescriptor dd = DeviceDescriptor.descriptor(0x1d34, 0x0013, "Dream Link", "USB LED Message Board v1.0", 0x1, 1);    
    LEDConfiguration21x7 led = new LEDConfiguration21x7();
    
    public Dreamlink21x7() {
        
    }
    
    public DeviceDescriptor getDescriptor() {
        return dd;
    }
    
    public LEDConfiguration21x7 getLEDConfig() {
        return led;
    }
    
    @Override
    public String toString() {
        return led.toString();
    }
}
