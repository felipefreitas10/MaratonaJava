package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        //Tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L; //um long é um int
        float floatP = 10F;
        double doubleP = 10D;
        boolean booleanP = true;
        char charP = 'A';

        //Wrappers -> classes especiais que envolvem dados primitivos, transformando-as em objetos
        Byte byteW = 1;
        Short short1 = 1;
        Integer intW = 1;
        Long longW = 10L; //um Long não pode fazer referência para um inteiro, já que Interger não é um Long (Interger não extends Long, regra do plolimorfismo )
        Float floatW = 10F;
        Double doubleW = 10D; //Uma variável de referência do tipo Double que faz referência para um objeto com o valor double 10
        Boolean booleanW = true;
        Character charW = 'A'; //autoboxing -> transforma o tipo primitivo em wrapper (o própio java faz isso)

        int i = intW; //unboxing -> transforma o tipo wrapper em tipo primitivo (o próprio java faz isso)
        Integer i2 = Integer.parseInt("3"); //transforma texto em número

        Boolean verdadeiro = Boolean.parseBoolean("TruE");

        System.out.println(i2);
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLowerCase('B'));
        System.out.println(Character.isLowerCase('b'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
