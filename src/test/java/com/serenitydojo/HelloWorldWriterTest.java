package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {
        //Integer age = 42;
        final int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        long startsInTheGalaxy = 10000000000L;
        double weight = 15.5;
        System.out.println("age = " + ageNextYear);
    }

    @Test
    public void workingWithStrings() {
        String firstName = "Sarah-Jane  ";
//        String upperCasefirstName = firstName.toUpperCase();
        String upperCasefirstName = firstName.replace("Sarah" , "Mary");
        System.out.println(upperCasefirstName.length());
        System.out.println(firstName.trim());
    }
}
