package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypePay;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client01 = new Client("Felipe", TypeClient.PESSOA_FISICA, Client.Day.MONDAY, TypePay.DEBITO);
        Client client02 = new Client("Ana", TypeClient.PESSOA_JURISDICA, Client.Day.SATURDAY, TypePay.CREDITO);



        System.out.println(client01);
        System.out.println(client02);

        System.out.println(TypePay.CREDITO.discount(100));
        System.out.println(TypePay.DEBITO.discount(100));


        System.out.println(TypeClient.clientTypeByNameReport("Pessoa Jurídica"));

    }
}
