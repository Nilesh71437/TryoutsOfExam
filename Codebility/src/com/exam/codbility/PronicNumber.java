package com.exam.codbility;

import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int k = (int) Math.sqrt(num);
        if(k*(k+1)==num)
        {
            System.out.println("Pronic Number");
        }
        System.out.println("Not a Pronic Number");

    }

}
