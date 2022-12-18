package Java100_Part3;

// 메서드로 인자 전달시 정수 100을 보냈을 때의 아래 코드의 결과를 말해보시오.
// 이 문제는 자바의 기본형 타입과 참조형 타입의 다양한 메서드 호출 발식에 대해서 아는지 묻는 문제이다.


public class java100_method_Exam005 {

    // [1] Call by value : 값에 의한 호출
    // 메서드로 인자값을 넘길때 해당 값을 복사하여 넘기는 방식
    // 따라서 sum() 메서드 내부에서는 복사된 값으로 처리를 한다.
    // 주소를 넘길 경우 500이 두번 출력된다.
    public void sum(int a){
        a += 400;
        System.out.println(a);
    }
    public static void main (String[] args) {
        java100_method_Exam005 jes = new java100_method_Exam005();
        
        // 변수 선언 및 메서드 호출
        int a =100;
        jes.sum(a);
        
        // 출력
        System.out.println(a);


    }

}
