package com.teachmeskills.homework_7_8.vector.vectorAbstract;

import java.util.Objects;

public abstract class VectorAbstract {
    private int x;
    private int y;
    private int z;

    public VectorAbstract() {
    }

    public VectorAbstract(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public VectorAbstract(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public static VectorAbstract[] array(int N) {
        VectorAbstract[] ar = new VectorAbstract[N];
        return ar;
    }

    @Override
    public String toString() {
        return "VectorAbstract{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VectorAbstract that = (VectorAbstract) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
