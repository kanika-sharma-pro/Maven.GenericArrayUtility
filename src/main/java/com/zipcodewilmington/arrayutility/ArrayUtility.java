package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {

    private T[] inputArray;

    //constructor for initializing, and storing array
    public ArrayUtility(T[] input) {
        this.inputArray = input;
    }

//public Integer getNumberOfOccurrences (T valueToEvaluate){
    //    return getNumberOfOccurrences(this.array, valueToEvaluate);


    private T[] concatenate(T[] arrayToMerge) {
        T[] result = Arrays.copyOf(this.inputArray, this.inputArray.length + arrayToMerge.length);
        System.arraycopy(arrayToMerge, 0, result, this.inputArray.length, arrayToMerge.length);
        return null;

    }


    private Integer getNumberOfOccurrences(T[] array, T valueToEvaluate) {

        Integer count = 0;
        //count the total occurrences of stored array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }


    private Integer getNumberOfOccurrences(T valueToEvaluate) {
        return getNumberOfOccurrences(this.inputArray, valueToEvaluate);
    }
}
public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
    T[] result = concatenate(arrayToMerge);
    return countDuplicatesInMerge(result, valueToEvaluate);
}

//public T countDuplicatesInMerge(Integer[] arrayToMerge, T valueToEvaluate) {
//    }
//
//    public Integer countDuplicatesInMerge(Long[] arrayToMerge, T valueToEvaluate) {
//    }
//
//    public Integer countDuplicatesInMerge(String[] arrayToMerge, T valueToEvaluate) {
//    }
//
//    public Integer countDuplicatesInMerge(T arrayToMerge, T valueToEvaluate) {
//    }
// public T countDuplicatesInMerge(Integer[] arrayToMerge, T valueToEvaluate) {
//            Integer count = 0;
//            //count the total occurrences of stored array
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] != null && array[i].equals(valueToEvaluate)) {
//                    count++;
//                }
//            }
//            //count occurrence in array to merge
//            for (int j = 0; j <arrayToMerge.length; j++) {
//                if (array[j] != null && array[j].equals(valueToEvaluate)){
//                    count++;
//                }
//            }
//        }
//        return count;