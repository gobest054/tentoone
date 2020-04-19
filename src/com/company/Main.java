package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr_int = new int[10];
        for(int i=0;i<10;i++)
        {
            arr_int[i]=in.nextInt();
        }
        for (int i=9;i>=0;i--)
        {
            System.out.print(arr_int[i]+" ");
        }
    }
}
