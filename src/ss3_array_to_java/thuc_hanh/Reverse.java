package ss3_array_to_java.thuc_hanh;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do{
            System.out.print("enter size array: ");
            size = in.nextInt();
        }while(size > 20);
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("enter array element " + (i+1) + " :");
            array[i] = in.nextInt();
        }
        System.out.println("array before reverse :");
        for(int j = 0; j < size; j++){
            System.out.print(array[j] + "\t");
        }
        for(int j = 0; j < size/2; j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        System.out.println("array after reverse is: ");
        for(int j = 0; j < size; j++){
            System.out.print(array[j] + "\t");
        }

    }
}
