package com.company;

public class Main {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5};
        int[] output = findLargestProduct(input);
        System.out.println(output[0] + " " + output[1]);
    }

    public static int[] findLargestProduct(int[] input) {   //method to find the largest product of consecutive numbers in an array
        int[] output = new int[2];
        int product = 0;
        int largestProduct = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                product = input[i] * input[j]; //calculate the product of consecutive numbers
                if (product > largestProduct) { //if the product is greater than the current largest product, set the largest product to the new product
                    largestProduct = product;   //and set the indices of the largest product to the indices of the current product
                    output[0] = input[i];   
                    output[1] = input[j];
                }

            }

        }
        System.out.println(product);
        return output;
    }
}
