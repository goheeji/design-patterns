package com.study.designpatterns.singleton;

public class Settings {

    // 스레드 세이프하게 Static inner 클래스를 사용

    private Settings(){}

    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }

}
