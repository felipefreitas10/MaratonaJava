package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCodicionais06 {
    public static void main(String[] args){
        //utilizando switch
        //imprima se o dia é útil ou é fim de semana
        byte dia = 4;
        String resultado;

        switch (dia){
            case 1:
                resultado = "Fim de semana";
                break;
            case 2:
                resultado = "Dia útil";
                break;
            case 3:
                resultado = "Dia útil";
                break;
            case 4:
                resultado = "Dia útil";
                break;
            case 5:
                resultado = "Dia útil";
                break;
            case 6:
                resultado = "Dia útil";
                break;
            case 7:
                resultado = "Final de semana";
                break;
            default:
                resultado = "entrada inválida";
                break;
        }

        System.out.println(resultado);
    }
}
