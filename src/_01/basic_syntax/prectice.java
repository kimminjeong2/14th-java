package _01.basic_syntax;

import java.util.Scanner;

public class prectice {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 이름 입력
        System.out.println("이름을 입력하세요:");
        String name = scanner.next(); // 공백 이전까지 문자열 읽음
//        System.out.println("이름: " + name);

        // 나이 입력
        System.out.println("나이를 입력하세요:");
        int age2 = scanner.nextInt(); // 공백 이전까지 정수 읽기
//        System.out.println("나이: " + age2);

        // 나이 출력
        System.out.printf("안녕하세요! %s님 (%d세)\n", name, age2);

        // Scanner 객체 닫기
        scanner.close();
    }
}
