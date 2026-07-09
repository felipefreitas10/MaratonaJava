package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula07Array04 {
    public static void main(String[] args) {
        //Existem outras formas de declarar um array
        int[] numeros01 = new int[3];
        int[] numeros02 = {1,2,3,4,5}; //segunda forma
        System.out.println(numeros02.length); //o tamanho será definido pela quantidade de intens declarados

        int[] numeros03 = new int[]{5,4,3,2,1}; //terceira forma

        System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros02[i]);
        }


        System.out.println("---------------------");

        //existe um for mais simplificado ao qual chamamos de foreache
        for(int num:numeros03){
            System.out.println(num);
        }

        //essa forma não se trabalha com indice ela sempre começa do primeiro e vai pulando para o proximo
        //por isso é importante declarar o tipo de dado do array, pois cada tipo tem um tamanho diferente, e isso influência diretamente no salto da próxima iteração
    }





}
