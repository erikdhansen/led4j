/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.led4j;

import com.erikdhansen.led4j.devices.Dreamlink21x7;

/**
 *
 * 
 * To trigger a manual USB rescan:
 * ((org.usb4java.javax.Services) UsbHostManager.getUsbServices()).scan();
 * 
 * @author ehansen
 */
public class Led4j {
    public Dreamlink21x7 dreamlink;
    
    public Led4j() {
        dreamlink = new Dreamlink21x7();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Led4j l = new Led4j();
        System.out.println(l.dreamlink.toString());
    }
    
}
