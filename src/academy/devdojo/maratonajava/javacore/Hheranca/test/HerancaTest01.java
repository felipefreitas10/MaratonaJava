package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Address;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Person;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Employee;

public class HerancaTest01 {
    public static void main(String[] args){
        Address address01 = new Address("Street of Victory", "12034-873");
        Person person01 = new Person("Antônio");

        person01.setCpf("617982982-32");
        person01.setName("Carlos");
        person01.setAddress(address01);

        person01.printObject();

        Employee employee01 = new Employee("Felipe", 3000);

        employee01.setAddress(address01);
        employee01.setCpf("123456789-23");
        employee01.setSalary(2000); //this attribute is the only that belongs exclusively the class Employee that's way called specialization

        System.out.println("--------------------------------------");

        employee01.printObject(); //this Class also inherit this method from class Person, but it won't print salary
        employee01.report();

        Employee employee02 = new Employee("Carlinhos", "12345678-90", 30000, address01);

        System.out.println("--------------------------------------");

        employee02.printObject();



    }
}
