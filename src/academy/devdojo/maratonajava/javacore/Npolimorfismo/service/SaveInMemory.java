package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repository.Repository;

public class SaveInMemory implements Repository {
    @Override
    public void salve(){
        System.out.println("Saving in momory...");
    }
}
