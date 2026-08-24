package academy.devdojo.maratonajava.javacore.Oexception.excep.domain;

public class LoginInvalidoException extends Exception{ //checkedException

    public LoginInvalidoException() {
        super("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
