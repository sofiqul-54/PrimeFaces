/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author User
 */
public class AutoCompleteController {
    private Text text;

    public List<String> complete (String input){
    List <String> result = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            result.add(input + i);
            
        }
        return result;
    }
    public Text getText() {
        if(text == null){
        text = new Text();
        }
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
    
    
}
