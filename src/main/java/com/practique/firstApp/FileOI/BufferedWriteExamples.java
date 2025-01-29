package com.practique.firstApp.FileOI;

import java.io.*;

public class BufferedWriteExamples {
    public static void main(String[] args) {

        File srcFile = new File("C:\\Users\\daram\\OneDrive\\Documents\\Java\\Src.txt");
        File dstnFile = new File("C:\\Users\\daram\\OneDrive\\Documents\\Java\\Dstn.txt");

        try(var Reader = new BufferedReader(new FileReader (srcFile));
            var Writer = new BufferedWriter(new FileWriter(dstnFile))){

            String line;
            while ((line= Reader.readLine())!=null){
                Writer.write(line);
                Writer.newLine();
            }

        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
