package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.SaveInDatabase;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new SaveInDatabase();

        repository.salve();
    }
}
