package com.example.christian.russianroulette;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by Christian on 4/25/16.
 */
public class fire implements Serializable {

    public static void main(String[] args) {

        boolean chamber1Full;
        boolean chamber1Loaded = false;
        boolean chamber2Full;
        boolean chamber2Loaded = false;
        boolean chamber3Full;
        boolean chamber3Loaded = false;
        boolean chamber4Full;
        boolean chamber4Loaded = false;
        boolean chamber5Full;
        boolean chamber5Loaded = false;
        boolean chamber6Full;
        boolean chamber6Loaded = false;

        Random whichBarrel = new Random();
        int randomBarrel = whichBarrel.nextInt(7 - 1) + 1;
        int barrel;
        switch (randomBarrel) {
            case 0:
                barrel = 1;
                break;
            case 1:
                barrel = 2;
                break;
            case 2:
                barrel = 3;
                break;
            case 3:
                barrel = 4;
                break;
            case 4:
                barrel = 5;
                break;
            case 5:
                barrel = 6;
                break;
            default:
                barrel = 6;
        }

        if (barrel == 1) {chamber1Loaded = true;}

            //chamber2Loaded = false; chamber3Loaded = false; chamber4Loaded = false; chamber5Loaded = false; chamber6Loaded = false;

        if (barrel == 2) {chamber2Loaded = true;}

        if (barrel == 3) {chamber3Loaded = true;}

        if (barrel == 4) {chamber4Loaded = true;}

        if (barrel == 5) {chamber5Loaded = true;}

        if (barrel == 6) {chamber6Loaded = true;}
    }
}
