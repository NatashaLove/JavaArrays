package com.company;

public class JavaArrays {

    public static void main(String[] args) {
	// write your code here
        int [] myArray = {1, 2, 3, 4};
        String[] myStringArray= {"Hello", "Hi", "Good Bye"};

        System.out.println(myArray[1]);
        System.out.println(myStringArray[0]);
        System.out.println(myStringArray.length);

        //made my own for-loop - trying and running
        for (int i=0;i<myArray.length;i++){

            for (int j=0; j<myStringArray.length; j++){
                System.out.print("Item # "+myArray[i]);
                i++;
                System.out.println(" : Polite word " +myStringArray[j]);

            }
        }

    }
}
