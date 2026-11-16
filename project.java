package codingal.SecondSetOfClasses.classTwentySix;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.print("Enter how big the array will be: ");
        int n = scn.nextInt();

        int[] arr = new int[n];   
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scn.nextInt(); 
        }

        maxArr(arr, 0, 0, 0, 0);
        scn.close();
    }
    static void maxArr(int[] arr, int idx, int max, int min, int mintwo){
        if (idx == arr.length){System.out.println("The max is: " + max + "\nThe second min is: " + mintwo); return;}

        if (max < arr[idx]){
            max = arr[idx];
        }
        if (mintwo > arr[idx] ) {
            mintwo = arr[idx];
        }
        if (min > mintwo || min == 0){
            min = arr[idx];
        }

        maxArr(arr, idx + 1, max, min, mintwo);
    }
    
}
