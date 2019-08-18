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

        //taking space for future elements of array
        int[]newArray = new int[5];
        String[]newStringArray=new String[5];

        newArray[0]= 3;
        newArray[1]=5;
        newArray[2]=7;
        newArray[3]=8;
        newArray[4]=89;

        for (int a=0;a<newArray.length;a++){
            System.out.println(newArray[a]);
        }
        newStringArray[0]= "Billy";
        newStringArray[1]="Anna";
        newStringArray[2]="Natalia";
        newStringArray[3]="Sonya";
        newStringArray[4]="Olga";

        for (int b=0;b<newStringArray.length;b++){
            System.out.println(newStringArray[b]);
        }
    }
}
