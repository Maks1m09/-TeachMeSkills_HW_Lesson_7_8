package com.teachmeskills.homework_7_8.vector.vectorInterf;

import com.teachmeskills.homework_7_8.vector.vectorAbstract.VectorAbstract;

public interface Vector {
    double vectorLength ();
    VectorAbstract scalarProduct (VectorAbstract v);
    VectorAbstract sumVector (VectorAbstract v);
    VectorAbstract vectorDifference (VectorAbstract v);
}
