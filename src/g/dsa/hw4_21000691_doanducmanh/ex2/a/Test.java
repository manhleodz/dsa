package g.dsa.hw4_21000691_doanducmanh.ex2.a;

import g.dsa.hw4_21000691_doanducmanh.ex2.StackInterface;
import g.dsa.hw4_21000691_doanducmanh.ex2.a.ArrayStack;

public class Test {

    public static void main(String[] args) {
        StackInterface<Integer> S = new ArrayStack<>();
        S.push(5);
        S.push(3);

        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
    }
}
