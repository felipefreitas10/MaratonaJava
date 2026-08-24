package academy.devdojo.maratonajava.javacore.Oexception.excep.test;

import academy.devdojo.maratonajava.javacore.Oexception.excep.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner sc = new Scanner(System.in);
        String userName = "Goku";
        String password = "ssj";
        System.out.println("Informe o usuário");
        String userDigitado = sc.nextLine();
        System.out.println("Informe a senha");
        String passwordDigitado = sc.nextLine();

        if(!userDigitado.equals(userName) || !passwordDigitado.equals(password)){
            throw new LoginInvalidoException(); //lanço a exceção para quem for usá-la tratar
        }

        System.out.println("Logado com sucesso");
    }
}
