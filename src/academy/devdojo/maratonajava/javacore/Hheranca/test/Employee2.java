package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Person;

public class Employee2 extends Person {

    public Employee2(String name){
        super(name);
    }
    public void imprimi(){
        this.name = "sasá"; //How this class extends the Class Person, it will have same characterists of class Persons
        //but how this attribute has the access modifier protected, the class Employee2 has direct access to this attribute.
    }

}
