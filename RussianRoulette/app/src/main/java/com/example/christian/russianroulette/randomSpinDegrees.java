package com.example.christian.russianroulette;

import java.util.Random;

/**
 * Created by Christian on 4/25/16.
 */
public class randomSpinDegrees extends MainActivity {

   // Random randomSpin = new Random();
    //int randomDegrees = randomSpin.nextInt(7 - 1) + 1;

    public static void main(String[] args){

        Random randomSpin = new Random();
        int randomDegrees = randomSpin.nextInt(7 - 1) + 1;
        Integer degrees;
        switch (randomDegrees) {
            case 0: degrees = 60;
                break;
            case 1: degrees = 120;
                break;
            case 2: degrees = 180;
                break;
            case 3: degrees = 240;
                break;
            case 4: degrees = 300;
                break;
            case 5: degrees = 360;
                break;
            default: degrees = 0;
        }
        System.out.println(degrees);
    }

    }
