package com.teachmeskills.homework_7_8.vector.differentVectors;

import com.teachmeskills.homework_7_8.vector.vectorAbstract.VectorAbstract;
import com.teachmeskills.homework_7_8.vector.vectorInterf.Vector;

public class VectorXY extends VectorAbstract implements Vector {

    public VectorXY(int x, int y) {
        super(x, y);
    }

    @Override
    public double vectorLength() {
        double vectorLength = Math.sqrt(Math.pow(getX(), 2) +Math.pow(getY(), 2));
        return vectorLength;
    }

    @Override
    public VectorAbstract scalarProduct(VectorAbstract v) {
      return   new VectorXY (getX()*v.getX(), getY()*v.getY());
    }

    @Override
    public VectorAbstract sumVector(VectorAbstract v) {
        return new VectorXY(getX()+v.getX(), getY() +v.getY());
    }

    @Override
    public VectorAbstract vectorDifference(VectorAbstract v) {
        return new VectorXY(getX() - v.getX(), getY() - v.getY());
    }
}
