package Java100_Part3;

// 아래의 메서드 구현 코드에서 틀린 곳을 찾아 올바르게 수정하시오
// 이 문제는 자바의 메서드 구현시 기본적인 주의점을에 대해서 아는지를 묻는 문제이다.
// 클래스명.메서드명();
// static은 static을 부른다.


public class java100_method_ExamStatic1 {

/*  에러 이유 : main 메서드는 static 으로 static 메서드만 호출할 수 있다.
    public void  helloWorld() {
        System.out.println("Hello World~");
    }

 */
    public static void helloWorld() {
        System.out.println("Hello World~");
    }

    public static void main (String[] args) {

       //[1] 메서드 호출
        helloWorld();

    }

}
