package creational.singletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(DoubleCheckedSingleton.getInstance().toString());
        System.out.println(DoubleCheckedSingleton.getInstance().toString());
        System.out.println(DoubleCheckedSingleton.getInstance().toString());
    }
}
