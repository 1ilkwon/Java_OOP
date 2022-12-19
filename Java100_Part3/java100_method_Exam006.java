package Java100_Part3;

// 메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오.
// 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미
// a 값이 같은 결과가 나오도록 코드를 수정하시오

public class java100_method_Exam006 {

    // [1] Call by reference : 주소에 의한 호출
    // 메서드로 인자값을 넘길때 해당 값을 복사하여 넘기는 방식
    // 따라서 sum() 메서드 내부에서는 복사된 값으로 처리를 한다.
    // 주소를 넘길 경우 500이 두번 출력된다.
    public static void sum(Integer a){
        a += 400;
        System.out.println(a); // 참조(주소)값 출력
    }
    public static void main (String[] args) {
        Integer a = new Integer(100);
        
        // 변수 선언 및 메서드 호출
        // Wrapper 클래스의 Integer 클래스타입으로 변수 a를 선언하고,
        // new로 객체를 생성하여 해당 주소 값을 메서드로 보낸다.
        sum(a);
        
        // 출력
        System.out.println(a);


    }

}
