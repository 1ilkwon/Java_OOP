package Java100_Part3;

// static 선언이 안되어 있는 메서드를 사용하는 방법에 대해서 코드로 구현해보시오
// 이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 아는지 묻는 문제이다.
// 클래스와 객체에 대한 선행 학습이 필요하므로 이에대한 학습 후 본 문제를 다시 풀어보는 것이 좋다.
// 클래스명.메서드명();
// 객체를 생성하여 접근

public class java100_method_ExamStatic2 {
    public void helloWorld() {
        System.out.println("Hello World~");
    }

    public static void main (String[] args) {

       //[1] 메서드 호출
       // helloWorld(); // 메인메서드는 static 메서드만 호출할 수 있기 때문에 에러

        //[2] 객체 생성 후 메서드 호출
        java100_method_ExamStatic2 jes = new java100_method_ExamStatic2();
        jes.helloWorld();

    }

}
