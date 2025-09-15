package NestedClass.Ref;

import java.util.Random;

// 우수 풀이 코드와 비교한다면 먼저 Process라는 인터페이스를 만들고
// 정적 중첩 클래스를 Dice, Sum을 만들어줍니다. 그리고 각각의 코드를 분기해서
// 실행시키고 싶다면 Process 인자로 넘겨주어 다형성 및 오버라이드를 통해서 가능해집니다.

public class NestedClassEx1_Ref {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

}

