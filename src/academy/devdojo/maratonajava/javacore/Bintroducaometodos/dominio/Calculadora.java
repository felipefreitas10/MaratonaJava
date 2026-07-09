package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    //métodos são os comportamentos de uma classe
    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtrairDoisNumeros(){ //metodo sem retorno porém com uma saída
        System.out.println(20-5);
    }

    //podemos passar parâmetros para o nosso 'metodos'
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }

    //métodos com retornos -> são metódos que executam algo e te devolvem o resultado desta ação
    public double dividirDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return  num1/num2;
    }

    public double dividirDoisNumeros02(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        }else{
            return 0;
        }
    }

    //é possível usar o return em métodos void, ele funcionará como um break
    public void imprimirDivisaoDoisNumeros(double num1, double num2){
        if(num2 != 0){
            System.out.println(num1/num2);
            return;
        }

        System.out.println("Divisão por zero é impossível caabeção!!");
    }

    //como estamos passando var. primitivas não iremos alterar os valores dos argumentos, pois o que entra no escopo do metodo sao apenas copias
    public void alterandoDoisNumeros(int num1, int num2){
        num1 = 23;
        num2 = 7;

        System.out.println("Dentro de alterandoDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros){ //passando array como parâmetro
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }

    //o varargs tem que se ser o último parâmetro
    public void somaVarArgs(int... nums){ //permite que você passe vários numeros de uma vez, o compilador vai entender como um único array
        int soma = 0;
        for(int num : nums){
            soma += num;
        }

        System.out.println(soma);
    }



}
