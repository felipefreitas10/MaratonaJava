package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        //else if (mais de duas condições)

        int age = 20;
        String condicao;

        if (age < 12) {
            condicao = "Criança";
        }else if (age > 12 && age < 18) {
            condicao = "Adolescente";
        }else if (age > 18 && age < 60) {
            condicao = "Adulta";
        }else {
            condicao = "Idosa";
        }

        System.out.println("A pessoa é "+ condicao);

    }
}
