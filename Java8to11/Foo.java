package java8to11;
/*
* 람다 표현식 (Lambda Expressions)
● 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
● 코드를 줄일 수 있다.
● 메소드 매개변수, 리턴 타입, 변수로 만들어 사용할 수도 있다.
* */

/*
* 자바에서 함수형 프로그래밍
● 함수를 First class object로 사용할 수 있다.
● 순수 함수 (Pure function)
  ○ 사이드 이팩트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
  ○ 상태가 없다. (함수 밖에 있는 값을 사용하지 않는다.)
● 고차 함수 (Higher-Order Function)
  ○ 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.
● 불변성
* */


public class Foo {

    public static void main (String[] args){
        // 익명 내부 클래스 anonymous inner class

        // 자바 8버전부터 람다식으로 줄여서 표현할 수 있다.
        RunSomething runSomething = () -> System.out.println("Hello");
        runSomething.doIt();
    }
}
