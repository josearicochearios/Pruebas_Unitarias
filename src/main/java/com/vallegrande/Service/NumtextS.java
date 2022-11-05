package com.vallegrande.Service;

import com.google.gson.*;
import java.io.*;
import java.net.*;

public class NumtextS {

    public static String getLetter(int number) throws Exception{
        String result = null;
        String API_URL = "https://nal.azurewebsites.net/api/NAL?num=";
        try {
            URL url = new URL(API_URL + number);
            URLConnection request = url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            if (root.isJsonObject()) {
                JsonObject rootobj = root.getAsJsonObject();
                result = rootobj.get("letras").getAsString();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }


}
