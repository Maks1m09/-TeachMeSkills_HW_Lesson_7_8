package com.teachmeskills.homework_7_8.vector.differentVectors;

import com.teachmeskills.homework_7_8.vector.vectorAbstract.VectorAbstract;
import com.teachmeskills.homework_7_8.vector.vectorInterf.Vector;

public class VectorXYZ extends VectorAbstract implements Vector {

    public VectorXYZ(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public double vectorLength() {
        double vectorLength = Math.sqrt(Math.pow(getX(), 2) +Math.pow(getY(), 2)+Math.pow(getZ(), 2));
        return vectorLength;
    }

    @Override
    public VectorAbstract scalarProduct(VectorAbstract v) {
        return  new VectorXYZ (getX()*v.getX(), getY()*v.getY(), getZ()*v.getZ());
    }

    @Override
    public VectorAbstract sumVector(VectorAbstract v) {
        return new VectorXYZ(getX()+v.getX(), getY() +v.getY(), getZ()+v.getZ());
    }

    @Override
    public VectorAbstract vectorDifference(VectorAbstract v) {
        return new VectorXYZ(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ());
    }
}
