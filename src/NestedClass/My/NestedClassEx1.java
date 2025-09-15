package NestedClass.My;

import java.util.Random;

//예전에는 단순히 파라미터 값을 받아서 단순히 sout으로 출력하는 방식을 사용했지만
//이제는 코드를 넘겨야 할때는 코드 자체를 파라미터로 받을 수는 없으니 어떻게 할까 고민해본 코드.
//인자를 ENUM으로 입력을 받아 받은 ENUM에 따라 분기하여 코드를 실행시킴.

public class NestedClassEx1 {
    public static void hello(SelectOption option) {
        System.out.println("프로그램 시작");

        if (option == SelectOption.DICE) {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        } else if (option == SelectOption.SUM) {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(SelectOption.DICE);
        hello(SelectOption.SUM);
    }

}