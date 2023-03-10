package com.study.designpatterns.singleton;

public class App {
    public static void main(String[] args){
        Settings settings = Settings.INSTANCE;
        Settings settings1 = Settings.INSTANCE;
        System.out.println(settings1 == settings);

    }
}
