package me.jurec;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateTheAnswer());
    }

    public static int calculateTheAnswer() {
        return multiply(add(4, 2), 7);
    }

    private static int add(int a, int b) {
        return a+b;
    }

    //todo: Implement method and remove this line
    private static int multiply(int a, int b) {
        return 0;
    }
}
