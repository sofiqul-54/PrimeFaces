/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Text {
    private String txt1;

      public List<String> complete (String input){
    List <String> result = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            result.add(input + i);
            
        }
        return result;
    }
    
    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }
    
    
}
