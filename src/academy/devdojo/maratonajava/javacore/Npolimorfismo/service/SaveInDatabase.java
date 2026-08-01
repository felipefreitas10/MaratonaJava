package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repository.Repository;

public class SaveInDatabase implements Repository {
    @Override
    public void salve(){
        System.out.println("Saving in Database...");
    }
}
