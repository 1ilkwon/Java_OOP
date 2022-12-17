
package java8to11;

/*
* 자바에서 함수형 프로그래밍
● 함수를 First class object로 사용할 수 있다.
● 순수 함수 (Pure function)
  ○ 사이드 이팩트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
  ○ 상태가 없다. (함수 밖에 있는 값을 사용하지 않는다.)
  * 함수 밖에 값을 사용하거나 변경을 할 수 없다.
  * 참조만 하는 것은 가능. (단 final이라고 가정한다.)
● 고차 함수 (Higher-Order Function)
  ○ 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.
● 불변성
* */


public class Foo1 {

    public static void main (String[] args){
        // 익명 내부 클래스 anonymous inner class

        // 인터페이스 입력값을 맞춰준다.
        RunSomething1 runSomething1 = (number) -> {
            return number + 10;
        };
    }
}
