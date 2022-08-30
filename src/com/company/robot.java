package com.company;

public class robot {
    void speak(String text) {
        System.out.println(text);
    }
    void name(String naam) {
        System.out.println(naam);
    }
    public static void main(String[] args) {
        robot r = new robot();
        r.name("bruh");
        r.speak("bruh pt2");
    }
}
