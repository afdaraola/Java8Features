package com.practique.firstApp.Inheritance2;

public class Test {
     static String str = "Keep it";
    public static void main(String[] args) {
        Super obj = new Sub();
        Sub obj1 = new Sub();
        Super obj3 = new Super();
      //  Sub obj4 = new Super();
        System.out.println(obj3.num+=2);
        System.out.println(obj1.num+=2);
        System.out.println(obj.num+=2);

        //encapsulation

      //  String str = str + "going"; // failed to compile == variable not initialize
        System.out.println(str);

        char grade = 'F';
        System.out.println(grade);
    }
}
