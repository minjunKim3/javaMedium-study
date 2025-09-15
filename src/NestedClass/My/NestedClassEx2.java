package NestedClass.My;

//간단한 정적 중첩 클래스를 만드는 코드입니다.
public class NestedClassEx2 {

    public class OuterClass1 {

        static class NestedClass {
            public void hello() {
                System.out.println("hello java!");
            }
        }

    }

    public static void main(String[] args) {
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
