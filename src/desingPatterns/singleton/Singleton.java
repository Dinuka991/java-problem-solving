package desingPatterns.singleton;

public class Singleton {

    private static  Singleton instance;

    private Singleton(){}


    public static  Singleton getSingleton(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("get show message");
    }




}
