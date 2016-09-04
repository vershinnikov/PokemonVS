package com.ivv.igor.pokemonvs;


import java.io.*;

/**
 * Created by Igor on 04-Sep-16.
 */
public class PokData {

    public void createData() {
        File file=new File("JSVals.js");
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close();
        }
        catch (IOException e) {
        }

    }
}