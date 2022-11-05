package com.vallegrande;

import com.vallegrande.Service.NumtextS;

public class NumberToText {

    static NumtextS numtextS = new NumtextS();

    public String numLetter(int a) throws Exception {
        String result = numtextS.getLetter(a);
        return result;
    }

    public String greeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new NumberToText().greeting());
    }

}
