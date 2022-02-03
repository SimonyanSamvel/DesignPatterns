package creational.singletonDesignPattern;

public class EagerSilgleton {

    private static final EagerSilgleton instance = new EagerSilgleton();

    private EagerSilgleton() {

    }

    public static EagerSilgleton getInstance() {
        return instance;
    }
}
