package com.solvd.laba.carina.products.utils;

import java.util.Random;
import java.util.UUID;

public class RandomGeneratorUtils {

    public static String generateEmail() {
        return "test-" + UUID.randomUUID() + "@hotmail.com";
    }

    public static String generateNumber(int limit) {
        int number = new Random().nextInt(limit) + 1;
        return String.valueOf(number);
    }

}
