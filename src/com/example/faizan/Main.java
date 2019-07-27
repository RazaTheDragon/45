package com.example.faizan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any decimal number:");
        n = s.nextInt();
        for (int i=0;i<=7;i++) {
            a = n % 2;
            if(a == 0){System.out.print(0);}
            if(a == 1)
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println(x);

    }
}
       /* Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        int x = z*2;
        for (int i=0;i<=8;i++){
            x = z/2;
            z = x%2;
              if (z==1){
            System.out.print("1");
        }else if (z==0) {
            System.out.print("0");
            }
        }
    }*/

