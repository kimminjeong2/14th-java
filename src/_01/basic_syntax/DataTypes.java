package _01.basic_syntax;

// 자료형
// - Primitive Type (기본형)
// - Boolean Type
// - Numeric Type
//      - Integral Type (short, int, long)
//      - Floating Point Type (float, double_
// -Character Type (char)
// - Reference Type (참조형)
// - Class Type
// - Interface Type
// - Array Type
// ...

//  - Primitive Type (기본형)
// - 사용되기 전에 선언되어야함
// os 에 따라 자료형 길이 변하지 않음
// - "비객체" 타입 -> null값을 가질 수 없음

// Reference Type (참조형)
// - java,lang, Object 상속받음
// - 기본형이 아니면 다 참조형

public class DataType {
    public static void main(String[] args) {
        // 기본형
        System.out.println("====== Primitive Type ======");

        // 정수형 변수 선언
        int x = 10;
        long y = 10000000000000L; // long 타입은 뒤에 "L"이나 "l" 붙여야함
        short z = 3267;
        byte b = 127;

        // 실수형 변수 선언
        float a = 3.14f; // float 타입은 뒤에 "f" or "F"
        double c = 2.7128;

    }
}

public class DataTypes {
}
