package com.techventus.parsetabledownloader;

import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Created by josephmalone on 2017-01-21.
 */
public class Main {

    private static final String BASE_DIR = "/Users/josephmalone/";
    private static final String BACKUP_DIR_NAME = "parse_backup_dir";

    public static void main(String... args) {
        System.out.println("start");
        try {
            String s = readFile(BASE_DIR+"receipt.json");
            System.out.println(s);

            Gson g = new Gson();
            ResultsWrapper wrap = g.fromJson(s, ResultsWrapper.class);
            System.out.println("output: " + wrap.getResults().get(0).toString());

            makeDir(BASE_DIR+BACKUP_DIR_NAME);

            for(ParseStruct ps:wrap.getResults()) {

                URL website = new URL(ps.getFileReference().getUrl());
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(BASE_DIR+BACKUP_DIR_NAME+"/"+ps.getFilename());
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
                System.out.println("downloaded "+ps.getFilename());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    private static File makeDir(String filePath) {


    File theDir = new File(filePath);

// if the directory does not exist, create it
if(!theDir.exists())

    {
        System.out.println("creating directory: " + filePath);
        boolean result = false;

        try {
            theDir.mkdir();
            result = true;
        } catch (SecurityException se) {
            //handle it
        }
        if (result) {
            System.out.println("DIR created");
        }
    }
    return theDir;
}


    private static String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }
}
