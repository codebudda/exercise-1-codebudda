package com.serenitydojo.exercise4;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public boolean isFed() {
        return isFed;
    }
    public String makeNoise() {
        //return "Woof";
        return DOG_NOISE;
    }
    public void feed() {
        this.isFed = true;
    }

}

