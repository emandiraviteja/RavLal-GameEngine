package com.ravlal.ravlal_gameengine.util.math;

import java.util.Random;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class RandomUtils {

    public static final Random RANDOM = new Random();

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    private RandomUtils() {
    }
    //========================================================


    //--------------------------------------------------------
    // Static methods
    //--------------------------------------------------------
    public static int nextSign() {
        return RANDOM.nextBoolean() ? 1 : -1;
    }

    public static boolean nextBoolean() {
        return RANDOM.nextBoolean();
    }

    public static float nextFloat(float bound) {
        return nextFloat(0, bound);
    }

    public static float nextFloat(float min, float max) {
        if (min == max) {
            return min;
        }

        if (min > max) {
            throw new IllegalArgumentException("Min value is larger than max value!");
        }

        return min + RANDOM.nextFloat() * (max - min);
    }

    public static double nextDouble(double bound) {
        return nextDouble(0, bound);
    }

    public static double nextDouble(double min, double max) {
        if (min == max) {
            return min;
        }

        if (min > max) {
            throw new IllegalArgumentException("Min value is larger than max value!");
        }

        return min + RANDOM.nextDouble() * (max - min);
    }

    public static int nextInt(int bound) {
        return nextInt(0, bound);
    }

    public static int nextInt(int min, int max) {
        if (min == max) {
            return min;
        }

        if (min > max) {
            throw new IllegalArgumentException("Min value is larger than max value!");
        }

        return min + RANDOM.nextInt(max - min);
    }
    //========================================================

}
