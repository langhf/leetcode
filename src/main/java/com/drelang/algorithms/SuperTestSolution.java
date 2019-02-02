package com.drelang.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SuperTestSolution {

    public Object getSolution(String solutionName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return Class.forName(solutionName).newInstance();
    }
}