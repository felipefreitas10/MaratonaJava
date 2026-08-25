package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo de espera p/ String = " + (fim - inicio) + "ms");


        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo de espera StringBuilder = " + (fim - inicio) + "ms");


        inicio = System.currentTimeMillis();
        concateStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo de espera StringBuffer = " + (fim - inicio) + "ms");
    }

    private static void concatString(int tam){
        String texto = "";
        for (int i = 0; i < tam; i++){
            texto += i; // "", "0", "01", "012"... -> vai criar uma nova String no pool de string a cada iteração
        }
    }

    //Soluções -> StringBuilder e StringBuffer (p/ múltiplas threards)
    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }

    private static void concateStringBuffer(int tam){
        StringBuffer sbuffer = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            sbuffer.append(i);
        }
    }
}
