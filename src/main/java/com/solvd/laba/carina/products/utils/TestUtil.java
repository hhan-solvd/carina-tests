package com.solvd.laba.carina.products.utils;

import com.zebrunner.carina.core.IAbstractTest;

import java.util.Random;
import java.util.UUID;

public class TestUtil implements IAbstractTest {

    public static String generateEmail() {
        return "test-" + UUID.randomUUID() + "@hotmail.com";
    }

    public static String generateNumber() {
        int number = new Random().nextInt(8) + 1;
        return String.valueOf(number);
    }

}
