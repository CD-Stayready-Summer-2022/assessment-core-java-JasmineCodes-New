package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        int sum = 0; //initialize sum
        int i;
        for (i = 0; i < intArray.length; i++) { //iterate through all elements, add to sum
            sum += intArray[i];
        }
        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        int result = 1;
        for(int i = 0; i < intArray.length; i++) { // loop through array length
            result = result * intArray[i]; // multiply
        }
        return result;
    }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray){
        int length = intArray.length;
        int sum = 0;
        for(int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        double average = sum / length;
        return average;
    }
}
