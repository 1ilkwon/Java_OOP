package Java100_Part3;

// 메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 구현하시오.
// 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미
// a 값이 같은 결과가 나오도록 코드를 수정하시오
// 단, 클래스와 Wrapper, 객체 생성에 대한 개념이 필요하므로 관련 공부를 하고 보는 것이 이해하는데 도움이 된다.

class TestNumber {
    int num;
    TestNumber(int num) {
        this.num = num;
    }

}

public class java100_method_Exam007 {
    public static void sum (TestNumber a) {
        System.out.println(a); // a의 주소값
        System.out.println(a.num); // a의 num을 출력 = 100
        a.num += 400;
        System.out.println(a.num); // a의 num을 출력 = 500

    }

    public static void main (String[] args) {

        //[1] 객체 변수 선언 (a에는 주소값만 리턴받아 저장)
        TestNumber a = new TestNumber(100);
        sum(a);
        System.out.println(a); // a의 주소값
        System.out.println(a.num); // a의 num을 출력 = 500

    }

}
