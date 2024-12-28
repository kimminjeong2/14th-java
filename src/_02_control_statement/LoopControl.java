package _02_control_statement;

import java.util.Scanner;

public class LoopControl {
    public static void main(String[] args) {
        // 기본 for 문
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // while 문
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // do - while 문
        // - 적어도 한 번은 수행되는 반복문
        System.out.println("=================");
        int j =1;
        do {
            System.out.println(j);
            j++;
        } while (j < 0);

        // for ~ each 문
        System.out.println("=================");
        String[] array = {"A", "B", "C"};
        for (String a : array) {
            System.out.println("a = " + a);
        }

//        실습

//        System.out.println("숫자를 입력하세요");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i + " ");
//        }
    }
}
