package com.exceptionhandling.multiplecatchblocks;

public class HandleMultipleCatchBlocks {
    public static void handleMultipleCatch(int[] array, int[] nullArray, int index) {

        try {
            if (array == null) {
                throw new NullPointerException("Array is not initialized");
            }
            if (index < 0 || index > array.length - 1) {
                throw new ArrayIndexOutOfBoundsException("Invalid index!");
            } else {
                int result = array[index];
                System.out.println("Value at index " + index + " is: " + result);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception is Caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

