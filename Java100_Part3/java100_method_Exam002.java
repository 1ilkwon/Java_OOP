package Java100_Part3;

// 반환값이 없고 받는 인자값이 2개 있는 덧셈 메서드를 구현하시오.
// 이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.


public class java100_method_Exam002 {

    public static void AddMethod(int x,int y){
        //단순 출력
        System.out.printf("단순출력 : a = %d, b = %d\n", x,y);

        //연산 출력
        int res = x + y;
        System.out.println("두 수를 더한 값 : " + res);
    }

    public static void main (String[] args) {

        // 반환값 x , 인자값 2개
        // 받는 인자값이 있다 = 호출부에서 파라미터 값을 넘긴다는 뜻.
        int a = 100;
        int b = 200;
        AddMethod(a,b);
    }

}
