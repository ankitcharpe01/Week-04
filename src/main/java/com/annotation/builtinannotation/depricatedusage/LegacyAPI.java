package com.annotation.builtinannotation.depricatedusage;
public class LegacyAPI {
    @Deprecated
    public static void oldFeature(){
        System.out.println("This is an old Feature");
    }
    public static void newFeature(){
        System.out.println("New Feature......");
    }

    public static void main(String[] args) {
        oldFeature();
        newFeature();
    }
}
