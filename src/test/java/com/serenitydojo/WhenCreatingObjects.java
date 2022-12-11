package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {
    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        Cat felix = new Cat("Felix", "Tuna" , 4); //Cat() is a constructor, it is like a special method that creates an object

        //felix.name = "Felix";
//        felix.setName("Felix");
        felix.setFavoriteFood("Tuna");

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat("Spot" , "Tuna" , 3);
//        spot.age = 3;
        System.out.println("Spot's age is: " + spot.getAge());
        // We created 2 cat objects with different attribute values

    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido" , "Bone" , 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(),"Bone");
        Assert.assertEquals(fido.getAge(),5);
    }

    @Test
    public void cat_makes_noise() {
        //Cat felix = new Cat("Felix" , "Tuna", 4);
        Cat felix = new Cat("Felix" , 4);
        Cat spot = new Cat("Spot" , "Salmon", 3);

        //Cat.CAT_NOISE = "LOUD MEOW";
        felix.makeNoise();
        felix.feed("Tuna");
        spot.feed("Salmon");
        felix.groom();
        spot.makeNoise();
        //System.out.println("Usual food = " + Cat.usualFood());
        //System.out.println("Felix's favorite food = " + felix.getFavoriteFood());
        System.out.println("Cat's like = " + usualFood());
    }


}