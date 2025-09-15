package NestedClass.My;

//간단한 지역 클래스를 구현한 코드입니다.

public class NestedClassEx4 {

    public void myMethod() {

        class LocalClass {
            private void hello() {
                System.out.println("hello java!");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }

    public static void main(String[] args) {
        NestedClassEx4 nestedClassEx4 = new NestedClassEx4();
        nestedClassEx4.myMethod();
    }
}
