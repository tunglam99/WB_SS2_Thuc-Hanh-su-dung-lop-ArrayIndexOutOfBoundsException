package com.company;

import java.util.Random;
import java.util.Scanner;

class ArrayExample {

    public static void main(String[] args) {
	// write your code here
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so cua phan tu bat ky");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua pha tu co chi so " +x+" la " +array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("chi so vuot qua gioi han cua mang");
        }

    }
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach cac phan tu cua mang: ");
        for (int i = 0; i<100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]+ " ");
        }
        return arr;
    }
}
