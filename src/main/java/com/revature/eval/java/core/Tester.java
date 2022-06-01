package com.revature.eval.java.core;

import com.revature.eval.java.core.EvaluationService.SpeedConverter;

public class Tester {

    public static void main(String[] args) {
        double kms = 5;
        System.out.println(SpeedConverter.toMilesPerHour(kms));
    }

}
