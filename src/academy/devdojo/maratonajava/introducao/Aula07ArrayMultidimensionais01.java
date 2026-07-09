package academy.devdojo.maratonajava.introducao;

public class Aula07ArrayMultidimensionais01 {
    public static void main(String[] args){
        //arrays multidimensionais -> array de array
        //o array de referência contém o endereço de outros arrays

        //declaração

        int[][] dias = new int[3][3];

        //temos um array de referência com três posições e cada posição dele obtém um endereço de um array de três posições

        //printando o array de referência
        for (int i = 0; i < dias.length; i++) { //dias.length fornece o tamanho do array de referência
            System.out.println(dias[i]);
        }

        //inicializando as os arrays que estão sendo apontados pelos arrays de referência

        //para o "primeiro vetor"
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        //para o "segundo vetor"
        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        //para o "terceiro vetor"
        dias[2][0] = 31;
        dias[2][1] = 31;
        dias[2][2] = 30;

        //printando todas as posições dos vetores a partir de um laçõ aninhado
        for(int i = 0; i < dias.length; i++){ //dias.length retorna o tamanho do vetor de referência
            for (int j = 0; j < dias[i].length; j++) {   //dias[i].length retorna o tamanho do vetor que está sendo apontado
                System.out.println(dias[i][j]);
            }
        }

        //é possível também utilizar o forreach com arrays muldidimensionais

        System.out.println("-------------------------");

        for(int[] arrayBase: dias){ //arrayBase faz referência ao array de referência
            for (int num: arrayBase){ //num faz referência aos vetores que o arrayBase aponta
                System.out.println(num);
            }
        }



    }


}
