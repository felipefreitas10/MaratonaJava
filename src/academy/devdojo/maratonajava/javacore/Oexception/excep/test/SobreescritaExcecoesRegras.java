package academy.devdojo.maratonajava.javacore.Oexception.excep.test;

import academy.devdojo.maratonajava.javacore.Oexception.excep.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.excep.domain.LoginInvalidoException;

public class SobreescritaExcecoesRegras {
    public static void main(String[] args){
        Funcionario func = new Funcionario();

        try {
            func.salvar();
        } catch (LoginInvalidoException | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
