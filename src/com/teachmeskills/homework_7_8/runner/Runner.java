package com.teachmeskills.homework_7_8.runner;

import com.teachmeskills.homework_7_8.vector.differentVectors.VectorXY;
import com.teachmeskills.homework_7_8.vector.vectorInterf.Vector;

public class Runner {
    public static void main(String[] args) {
        VectorXY vectorXY = new VectorXY(5, 10);
        VectorXY vectorXY1= new VectorXY(10, 5);
        System.out.println(vectorXY.equals(vectorXY1));
        System.out.println(vectorXY.vectorLength());
    }
}
