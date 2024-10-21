/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package martin_bubblesort;

/**
 *
 * @author MARTIN.R
 */
import java.util.*;

public class Martin_bubbleSort {

    public static void bubbleSort(int[] arr) {
        //Creating a method that sorts the array 
        
        //This variable checks the array lenghtg
        int n = arr.length;
        //This loop iterates through the values of the array 
        for (int i = 0; i < n - 1; i++) {
            //this loop iterates through the values before i
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {14, 33, 15, 82, 32, 11, 90};
        
        bubbleSort(arr);

        System.out.println("Sorted array:");

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        //Declaring variables that determine if the loop continuosly runs
        boolean isvalid = false;

        String choice = "yes";
        
        //I use a while loop that runs aslong as the user says they want to try again and
        //the value they entered isn't valid
        while (choice.equalsIgnoreCase("yes") && !isvalid) {
            
            //In the loop i ask them to inpit their number
            System.out.println("Enter a number that you want to search for in the array:");

            int search = sc.nextInt();
            
            //The loop iterates through the array checking every value 
            for (int i = 0; i < arr.length; i++) {

                //If the user enters a number that exists in the array it'll be valid 
                //and the program will return the index
                if (search == arr[i]) {
                    isvalid = true;
                    System.out.println("Number found at index " + Arrays.binarySearch(arr, search));
                }
            }
            //if it isn't valid the program will ask the user if they want to try again
            if (!isvalid) {
                System.out.println("Number not found search again? (yes/no)");
                choice = sc.next();

            }

        }

    }
}
