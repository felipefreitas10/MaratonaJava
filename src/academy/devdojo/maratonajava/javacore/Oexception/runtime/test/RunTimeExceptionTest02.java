package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args){
        try {
            divisao(1,0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("Tratando uma possível exceção na main para o fluxo do código continuar...");
    }

    //uma pequena documentação do nosso metodo
    /**
     *
     * @param a
     * @param b não pode ser zero!!
     * @throws ArithmeticException lança essa exceção
     * @return
     */

    public static double divisao(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Argumento ilegal, não existe divisão por zero");
        }
        return a/b;
    }







    //É POSSÍVEL MAS NÃO É ACONSELHADO FAZER ISSO
//    public static double divisao(double a, double b){
//        try{
//            return a/b;
//        }catch(ArithmeticException e){
//            e.printStackTrace(); //a rota da stack
//        }
//
//        return 0;
//    }
}
