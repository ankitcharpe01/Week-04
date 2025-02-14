package com.exceptionhandling.nestedtrycatchblocks;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        System.out.print("Enter a divisor : ");
        int divisor=sc.nextInt();
        System.out.println("Enter an index : ");
        int index=sc.nextInt();
        int division;
        try{
            int value=array[index];
            try {
                division=value/divisor;
                System.out.println(value+"/"+division+"="+division);
            }catch (ArithmeticException ex){
                System.err.println("Cannot divide by zero!");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println("Invalid array index!");
        }
    }
}
