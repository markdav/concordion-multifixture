package com.borders.concordion.sample;

/**
 * Dumb example of a class that does stuff which
 * we want to test.
 *
 * Remember we are using concordion here, so let's think integration test..
 * imagine that the method is a potentially costly one that hits external resources,
 * dbs, etc.
 *
 * Hard to beat the old string manipulation!!
 *
 * @author markdav
 * Date: 24/11/13
 * Time: 13:51
 */
public class ClassUnderTest {

    /**
     * Reverse a string
     * @param stringToReverse input
     * @return reversed input
     */
    public String reverseString(String stringToReverse){
        return new StringBuilder(stringToReverse).reverse().toString();
    }

}
