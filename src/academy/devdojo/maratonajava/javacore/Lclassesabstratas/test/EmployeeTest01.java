package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Developer;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager maneger01 = new Manager("Toya", 7500);
        Developer developer01 = new Developer("Felipe", 12000);

        System.out.println(maneger01);
        System.out.println(developer01);

        maneger01.impirmir();
    }
}
