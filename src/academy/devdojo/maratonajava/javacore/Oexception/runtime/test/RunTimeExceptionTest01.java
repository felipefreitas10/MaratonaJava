package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked -> Não compila
        //Unchecked -> Compila. Erros humanos (lógica)
        Object object = null; //só criamos a variável de referência, o objeto em si ainda não existe.
        int[] nums = {1, 2};

        System.out.println(3/0); //ArithmeticException

        System.out.println(nums[2]); //ArrayOuofBoundsException -> passou do limite do array

        System.out.println(object.toString()); //NullPoiterException -> o objeto não existe
    }
}
