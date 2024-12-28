package _03_array;

// 표준 배열
// 배열
// - 배열에 저장할 자료형 선언하고, 배열이름과 크기를 선언해야함
// = 배열의 원소는 모두 같은 타입
// - 처음 선언한 배열 크기 변경 불가능 (단, ArrayList 컬렉션의 경우, 동적으로 크기 조절 가능)

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 변수 선언
        // - 두 가지 방법이 있으나 관례적으로 첫 번째 방법 사용
        // 1. 타입[] 변수;
        // 2. 타입 변수[];
        int[] arr1;
        int arr2[];

        // - 배열 변수는 "참조 변수". 배열도 객체이므로 힙(heap) 영역에 생성되고, 배열 변수는 힙 영역의 배열 주소를 저장
        // 따라서 참조할 배열이 없다면 null 로 초기화 가능
        // -> 배열 변수가 null 값을 가진 상태에서 변수[인덱스] 로 값을 읽거나 저장하게 되면 NullPointerException 발생
        String[] temp = null;
        System.out.println(temp); // null
//        System.out.println(temp[0]); // error

        // - 값 목록으로 배열 변수 선언과 배열 생성
        int[] intArray = {16,22,34,41,59};
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println("intArray : " + intArray); // 참조값 저장 ( [I@7a81197d )

        // 주의. 중괄호로 감싼 목록을 배열 변수에 대입할 때, 배열 변수 미리 선언한 수에는 값 목록을 대입 불가
        char[] charArray;
        // charArray = {'A', 'B', 'C'}; // error
        charArray = new char[]{'A', 'B', 'C'}; // 배열 변수 선언 시점과 값 목록 대입 시점이 다르다면 "new 타입[]"을 목록 앞에 붙여야 함
        System.out.println("charArray[0] : " + charArray[0]);

        // - new 연산자로 배열 선언과 배열 생성
        // - : new 연산자로 배열 처음 생성하면 배열 항목은 기본값으로 초기화 됨 (int : 0, double : 0.0,...)
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화 된 값 : " + doubleArray[1]);

        /// ///////////////////////
        // 배열 길이 : length
        // length 필드는 읽기만 가능, 값 변경 불가능
        // 배열 길이는 반복문에서 많이 사용됨
        // 배열 길이를 벗어나면? ArrayIndexOutOfBoundsException
        // System.out.println(doubleArray[doubleArray.length]);

        /// ///////////////////////
        // 배열 출력
        // - toString() : 배열 내용을 문자열로 변환하여 반환
        System.out.println("intArray : " + Arrays.toString(intArray)); // intArray : [16, 22, 34, 41, 59]
        System.out.println("charArray : " + Arrays.toString(charArray)); // charArray : [A, B, C]
    }
}
