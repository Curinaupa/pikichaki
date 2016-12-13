package com.brainacad.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Huamani V.R on 03.12.2016.
 */
public class MyTranslator {
    private Map<String, String> dictionary = new HashMap();

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);

    }
    public String addNewWord(String en){
        return dictionary.get(en);
    }
}
