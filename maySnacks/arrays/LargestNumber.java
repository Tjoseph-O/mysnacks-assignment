package maySnacks.arrays;

import java.util.Scanner;

public class LargestNumber {


    public static void main(String[] args) {
       int[] listOfNumbers = {10,20,30,40,50,60};
        System.out.println(largestNumberMonitor(listOfNumbers));
    }

    public static int largestNumberMonitor(int[] arrayNumbers){

        int maxNumber = arrayNumbers[0];

        for (int index = 0; index < arrayNumbers.length; index++) {
            if (arrayNumbers[index] > maxNumber)maxNumber = arrayNumbers[index]; {


            }
        }
        return maxNumber;
    }

    }

