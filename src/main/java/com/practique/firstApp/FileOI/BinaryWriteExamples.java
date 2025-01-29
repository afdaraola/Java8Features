package com.practique.firstApp.FileOI;

import java.io.*;

public class BinaryWriteExamples {
    public static void main(String[] args) {

        File srcFile = new File("C:\\Users\\daram\\OneDrive\\Documents\\Java\\Src.txt");
        File dstnFile = new File("C:\\Users\\daram\\OneDrive\\Documents\\Java\\Dstn.txt");

        try(var in = new FileInputStream(srcFile);
            var out = new FileOutputStream(dstnFile)){
            int b;
            while ((b= in.read())!=-1){
                     out.write(b);
            }

            System.out.println("----Completed____");
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
}
