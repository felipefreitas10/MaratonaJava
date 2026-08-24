package academy.devdojo.maratonajava.javacore.Oexception.excep.domain;

import java.io.FileNotFoundException;

public abstract class Pessoa {
    public abstract void salvar() throws LoginInvalidoException, FileNotFoundException;
}
