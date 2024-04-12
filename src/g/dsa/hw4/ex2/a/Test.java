package g.dsa.hw4.ex2.a;

import g.dsa.hw4.ex2.StackInterface;

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
