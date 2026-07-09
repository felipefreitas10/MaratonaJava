//package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;
//
//import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
//
//public class FuncionarioTest01 {
//    public static void main(String[] args){
//        Funcionario funci = new Funcionario();
//        funci.setNome("Felipe");
//        funci.setIdade(21);
//        funci.setSalarios( new double[]{3000, 8000, 10000});
//
//
//        System.out.println("Dados do primeiro Funcionário");
//        System.out.println(funci.getNome());
//        System.out.println(funci.getIdade());
//        System.out.println(funci.getSalarios()[0]);
//        System.out.println(funci.getSalarios()[1]);
//        System.out.println(funci.getSalarios()[2]);
//
//
//        System.out.println("Média do primiero Funcionário");
//        funci.mediaSalarios(); //a média só deixa de ser 0 se chamarmos o metodo
//        System.out.println(funci.getMedia());
//
//       // funci.setMedia(21); -> devemos limitar o acesso a esse atributo, ou seja, não podemos ter um metodo set para ele
//
//        System.out.println(funci.getMedia());
//
//
//
//
//    }
//}
