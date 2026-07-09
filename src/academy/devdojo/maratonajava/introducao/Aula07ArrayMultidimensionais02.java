package academy.devdojo.maratonajava.introducao;

public class Aula07ArrayMultidimensionais02 {
    public static void main(String[] args){
        //inicialização de arrays multidimensionais
        //é importante resaltar que você precisa inicializar ao menos o array de referência

        int[][] arrayInt01 = new int[3][]; //aqui você só indicou que o array de referência possui três posições

        for(int i = 0; i<3; i++){
            System.out.println(arrayInt01[i]);
        }

        //todos os valores do array base são nulos pois eles não estão apontando para ninguem

        //vamos inicializálos
        arrayInt01[0] = new int[2]; //a primeira posição aponta para um array de duas posções
        arrayInt01[1] = new int[3]; //a segunda posição faz referência a um array de 3 posições
        arrayInt01[2] = new int[6]; //a terceira posição faz referência a um arrau de 6 posições

        //observe que no Java não precisamos ter um "matriz" certinha cada linha pode ter colunas diferentes

        //para inprimir um array assim só com o foreach

        for(int[] arrayBase : arrayInt01){
            System.out.println("\n------------");
            for(int num : arrayBase){
                System.out.print(num + " ");
            }
        }

        //outras formas de iniciálizar
        int[] vetor = new int[]{1,2,3,4,5};

        int[][] arrayInt02 = new int[3][];

        arrayInt02[0] = vetor;
        arrayInt02[1] = new int[]{6, 7, 8}; //já defenimos o vetor ao qual a posição 1 do vetor de referência aponta
        arrayInt02[2] = new int[]{9, 10, 11, 12, 13, 14};

        System.out.println("------------------------------------");

        for(int[] arrayBase : arrayInt02){
            System.out.println("\n--------------");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }




    }



}
