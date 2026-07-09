package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        //Operador Ternário
        // variavel = condição ? "Valor1" : "Valor caso a condição não for atingida"

        double salario = 3000;
        String resultado = salario > 2000 ? "Consigo doar para o DevDojo" : "Não consigo doar";

        System.out.println(resultado);

        //Só é recomendado utilizar o operador ternário quando temos apenas um if e um else
        //Porém seria possível utilizá-lo em casos com "else if"

        int age = 20;
        String result;

        result = age < 18 ? "criança" : age > 18 && age < 60 ? "Adulta" : "Idoso"; //NÃO É RECOMENDADO FAZER ISSO!!

        System.out.println(result);
    }
}
