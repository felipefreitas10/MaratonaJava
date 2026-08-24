package academy.devdojo.maratonajava.javacore.Oexception.excep.domain;

public class Leitor2 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando do Leitor1");
    }
}
