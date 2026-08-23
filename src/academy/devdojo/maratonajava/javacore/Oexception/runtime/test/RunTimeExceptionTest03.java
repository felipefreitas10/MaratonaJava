package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args){
        abrirConexao2();
    }


    private static void abrirConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException("Erro na conexão");
        }catch(Exception e){
            e.printStackTrace();
        }finally { //A cláusula finally indica que esse bloco de código será executado indepentemente se houver exceção ou não
            System.out.println("Fechanco recurso liberado pelo SO");
        }
    }

    //podemos ter retorno
    private static String abrirConexao2(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo"); //antes de retorna o try é fechado e o bloco finally é executado depois volta para o try e retorna a string
            return "conexão estabelecida com sucesso";
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }

        return null;
    }

    //podemos ter apenas o try e o finally (try não pode estar sozinho)

    private static void abrirConexao3(){
        try{
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }finally {
            System.out.println("Fechando conexão");
        }
    }
}
