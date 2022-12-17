package Java100_Part3;

// 반환값이 있고 받는 인자값이 있는 메서드를 구현하시오.
// 메서드는 ("korea")입력시 대문자로 출력되도록 구현한다.
// 이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.


public class java100_method_Exam004 {

    public static String capitalMethod(String str){
        String ret = str.toUpperCase();
        return ret;
    }

    public static void main (String[] args) {

        // 반환값 o , 인자값 o
        // 반환값이 있다는 것은 메서드 호출에 따른 리턴되는 값이 있다는 것이므로 호출 시 리턴값을 받는 변수를 정의한다.

        // 문자열 변수 선언
        String res;
        res = capitalMethod("korea");

        // 출력
        System.out.println("입력한 소문자의 대문자는 "+res);


    }

}
