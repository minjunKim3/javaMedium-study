package NestedClass.My;

//간단한 내부 중첩 클래스를 만드는 코드입니다.

public class NestedClassEx3 {

    public class InnerClass {
        public void hello() {
            System.out.println("hello java");
        }
    }


    public static void main(String[] args) {
        NestedClassEx3 nestedClassEx3 = new NestedClassEx3();
        InnerClass innerClass = nestedClassEx3.new InnerClass();
        innerClass.hello();
    }
}
