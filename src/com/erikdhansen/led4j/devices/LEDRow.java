/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.led4j.devices;

import java.util.HashMap;

/**
 *
 * @author ehansen
 */
public class LEDRow extends HashMap<LEDRow.INDEX, Integer> {

    static enum INDEX {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U;
    }
    
    public LEDRow() {
        // Initialize row to all off
        for(LEDRow.INDEX i : INDEX.values()) {
            this.put(i, 0);
        }
    }
    
    public void light(LEDRow.INDEX i, int brightness) {
        this.put(i, brightness);
    }
    
    public void unlight(LEDRow.INDEX i) {
        this.put(i, 0);
    }
    
    public void toggle(LEDRow.INDEX i) {
        int current = this.get(i);
        this.put(i, current &= current);
    }
    
    public boolean isLit(LEDRow.INDEX i) {
        return this.get(i) > 0;
    }
    
    public int getBrightness(LEDRow.INDEX i) {
        return this.get(i);
    }
}
