package beginner.example;

import java.util.Arrays;

public class Calculating {
//    public static int[] calculator(int[] arr){
//        int[] numArr = java.util.Arrays.copyOf(arr, arr.length);
//
////        return result;
//    }

    public static void main(String[] args) {

        // 2 + 3 * 4 / 2  - 실행 결과인 10을 출력하라
        // indent 들여쓰기 1번만
        // method의 길이가 10라인을 넘지 않도록
        // method는 한가지 일만
        // else 를 사용하지 않도록
        // 사칙연산 사이에는 빈공백 무조건
        // 나눗셈의 경우 정수로 떨어져야 한다.

        String str = "2 + 3 * 4 / 2";
        str = str.replace(" + ", "").replace(" * ", "").replace(" / ", "");
        System.out.println(Arrays.toString(str.toCharArray()));

//        int[] result = math(calculator);

        str = str.replace(" + ", "").replace(" * ", "").replace(" / ", "");
        System.out.println(Arrays.toString(str.toCharArray()));

        String num = Arrays.toString(str.toCharArray());

        char[] ch = str.toCharArray();
        System.out.println(ch);

        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }

//        for(int i=0; i<4; i++){
//            System.out.println(str[i]);
//        }


//
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//
//            System.out.println(arr[1] + arr[2]);
//        }



        System.out.println();
    }
}
