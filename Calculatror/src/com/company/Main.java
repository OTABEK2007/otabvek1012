package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("calculator");


        int num1 = scanner.nextInt();
        scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num2 = scanner.nextInt();
        int res = 0;


        switch (str){
            case "+"->{
                res = num1+num2;
                System.out.println(num1+" + "+num2+" = "+res);



            }
            case "-"->{
                res = num1-num2;
                System.out.println(num1+" - "+num2+" = "+res);

            }
            case "*"-> {
                res = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + res);

            }
            case "/"->{
                res = num1/num2;
                System.out.println(num1+" / "+num2+" = "+res);

            }


        }



    }
}
