/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.led4j.devices;

import java.util.ArrayList;

/**
 *
 * @author ehansen
 */
public class LEDConfiguration21x7 {
    ArrayList<LEDRow> rows = new ArrayList<>();
    
    public LEDConfiguration21x7() {
        for(int i=0; i < 7; i++) {
            rows.add(new LEDRow());
        }
    }
    
    public ArrayList<LEDRow> getRows() {
        return rows;
    }
    
    public LEDRow getRow(int index) {
        return rows.get(index);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Column ").append(" A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U ").append("\n");
        for(int i=0; i < 7; i++) {
            sb.append("Row " + i + "  ");
            for(LEDRow.INDEX n : LEDRow.INDEX.values()) {
                sb.append(" ").append( String.valueOf(rows.get(i).get(n))).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
