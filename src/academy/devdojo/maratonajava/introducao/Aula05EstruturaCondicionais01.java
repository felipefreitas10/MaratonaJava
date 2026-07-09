package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        if (verdadeiro){
            System.out.println("Dentro do if!");
        }

        int age = 20;

        if (age > 18) {
            System.out.println("Está autorizado a comprar bebida");
        }

        int age2 = 15;
        boolean isAutorizadoComprar = age2 > 18;

        if (!isAutorizadoComprar) {
            System.out.println("Não está autorizado a comprar");
        }

        boolean c = false;
        if (c = true){
            System.out.println("Dentro de algo que não deve ser feito!");
        }


        //else
        float salario = 2800.5f;
        if (salario > 3000) {
            System.out.println("Pode comprar um playstation 5");
        }else {
            System.out.println("Não pode comprar um playstations 5!");
        }

    }
}
