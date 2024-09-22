package com.freeman;

public class freeManNonStatic {
    public String company(String firstName, String surName){
        return (firstName + surName);

    }

    public static void main(String[] args) {
        freeManNonStatic fullName = new freeManNonStatic();
        System.out.println(fullName.company("Freedom ", "Agwaigbo"));

    }
}
