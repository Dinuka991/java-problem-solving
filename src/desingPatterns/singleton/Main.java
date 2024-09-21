package desingPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.showMessage();
    }
}
