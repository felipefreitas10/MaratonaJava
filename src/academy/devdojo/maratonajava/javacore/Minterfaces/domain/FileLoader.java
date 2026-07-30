package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load(){
        System.out.println("Loading from a file");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking file permission");
    }
}
