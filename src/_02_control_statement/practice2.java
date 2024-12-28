package _02_control_statement;

import java.util.Scanner;

public class practice2 {
       public static double add (double a, double b) {return a + b;}
       public static double min (double a, double b) {return a - b;}
       public static double mul (double a, double b) {return a / b;}
       public static double div (double a, double b) {return a * b;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 두개를 입력하세요.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("덧셈 결과: " + add(a,b));
        System.out.println("뺄셈 결과: " + min(a,b));
        System.out.println("나눗셈 결과: " + mul(a,b));
        System.out.println("곱셈 결과: " + div(a,b));

        scanner.close();
    }
}