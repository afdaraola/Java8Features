package com.practique.firstApp.Test;

public class practiqueSwitch {
    public static void main(String[] args) {

   String test=  Switch(2);
        System.out.println(test);
    }

    public static String Switch(int monthly){


        String result;
        switch (monthly) {
            case 1:
                result= "January";
                break;
            case 2:
                result="February";
                break;
            case 3:
                result="March";
                break;
            case 4:
                result="April";
                break;
            case 5:
                result="May";
                break;
            default:
                result="Unknown";

        }
        return result;
    }
}
