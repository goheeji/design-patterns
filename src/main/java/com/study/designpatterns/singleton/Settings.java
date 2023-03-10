package com.study.designpatterns.singleton;

public class Settings {

    private static Settings instance;

    // 1. 인스턴스를 오직 한개만 생성
    private Settings(){}

    // 2. 전역적으로 제공
    // 하지만 멀티스레드 환경에서는 안전하지 않다.
    public static Settings getInstance(){
        if(instance == null){
            instance = new Settings();
        }
        return instance;
    }

}
