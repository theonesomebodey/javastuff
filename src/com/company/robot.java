package com.company;

public class robot {
    void speak(String text) {
        System.out.println(text);
    }
    void name(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        robot r = new robot();
        r.name("bruh");
        r.speak("bruh pt2");
    }
}
