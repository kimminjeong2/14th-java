package _02_control_statement;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("나이를 입력하세요.");
//        int age = scanner.nextInt();
//
//        if (age >= 1 && age <= 7) {
//            System.out.println("유아");
//        } else if (age >= 8 && age <= 13) {
//            System.out.println("초등학생");
//        } else if (age >= 14 && age <= 16) {
//            System.out.println("중학생");
//        } else if (age >= 17 && age <= 19) {
//            System.out.println("고등학생");
//        } else if (age >= 20) {
//            System.out.println("성인");
//        } else {
//            System.out.println("유효하지 않은 나이입니다.");
//        }

//“이름을 입력하세요.” 라는 문구를 출력하고 사용자로부터 이름을 입력 받기
//홍길동이 입력되면 "남자", 성춘향이 입력되면 "여자"
//그 외의 내용이 입력되면 "모르겠어요."를 출력
//        System.out.println("이름을 입력하세요.");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        if (name.equals("홍길동")) {
//            System.out.println("남자");
//        } else if (name.equals("성춘향")) {
//            System.out.println("여자");
//        } else {
//            System.out.println("모르겠어요.");
//        }

//사용자로부터 세 개의 정수를 입력받아, 그 수들의 "최대값", "최소값", "합계와 평균"을 구해보자.
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 세개를 입력하세요 : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);

    }
    }
