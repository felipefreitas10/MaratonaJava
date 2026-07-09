package academy.devdojo.maratonajava.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Felipe";
        nomes[1] = "Carla";
        nomes[2] = "Ana";

        //é aconselhado usar o método length pois podemos alterar o tamanho do vetor e esquecer de alterar as quantidades de iterações no for

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[3]; //a variável aponta para outra referência de memória -> perdemos a antiga referência

        for (int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }



    }
}
