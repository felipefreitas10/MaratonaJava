package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load(); //It is a public and abstract method

    int MAX_DATA_SIZE = 10; //we can have attributes in interfaces. They will be default public, static and final

    default void checkPermission(){ //this method is concrete
        System.out.println("Checking permission...");
    }

    //We can't override this method 'cause it is static

    static void retrieveMAX_DATA_SIZE(){ //What it is static, it belongs to the class not the object
        System.out.println(MAX_DATA_SIZE);
    }

}
