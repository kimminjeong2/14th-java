package _02_control_statement;
// 반지름이 5인 원의 넓이: 78.5398...
// 가로 4, 세로 7인 직사각형의 넓이 : 28.0
// 밑변 6, 높이 3인 삼각형의 넓이: 9.0
// 원의 넓이를 계산하는 메서드 : 원의 반지름을 인수로 받는다.
// 직사각형의 넓이를 계산하는 메서드 : 가로와 세로의 길이를 인수로 받는다.
// 삼각형의 넓이를 계산하는 메서드 : 밑변과 높이를 인수로 받는다.
public class practice3 {
    public static double one(int a) {return a * a * 3.1415926535;}
    public static double one(int a, int b) {return a * b;}

    public static void main(String[] args) {
        System.out.printf("반지름이 %d인 원의 넓이 %f\n", 5, one(5));
        System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이 %.1f\n", 4, 7, one(4, 7));
        System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이 %.1f\n", 6, 3, one(6, 3)/2);
    }
}
