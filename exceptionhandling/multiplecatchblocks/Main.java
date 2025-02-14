package com.exceptionhandling.multiplecatchblocks;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of array:");
            int size = sc.nextInt();
            int[] array = new int[size];
            int[] nullArray = null;
            System.out.println("Enter Array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Enter index you want to access:");
            int index = sc.nextInt();

            HandleMultipleCatchBlocks.handleMultipleCatch(array, nullArray, index);
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized");
        }catch (InputMismatchException e){
            System.out.println("Input statement is not valid "+e.getMessage());
        }finally {
            sc.close();
        }
    }
}
