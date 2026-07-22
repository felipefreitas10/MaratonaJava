package academy.devdojo.maratonajava.desafios.Associations.Challenge01.test;

import academy.devdojo.maratonajava.desafios.Associations.Challenge01.domain.Delivery;
import academy.devdojo.maratonajava.desafios.Associations.Challenge01.domain.Driver;
import academy.devdojo.maratonajava.desafios.Associations.Challenge01.domain.Way;


public class Test01 {
    public static void main(String[] args){
        Driver driver01 = new Driver("Paulo", "He delivered 100 order last month");
        Delivery delivery01 = new Delivery("L7898282LKS", "Victoria Street, number fifteen", 1.5);
        Delivery delivery02 = new Delivery("L7898HAH2UE", "Baker Street, two hundred eighty-six", 16.89);
        Delivery delivery03 = new Delivery("L78AJAKELMA", "Paulista Avenue, number nineteen", 5.6);
        Delivery delivery04 = new Delivery("L78SNNEJJ19", "Frances Avenue, number fifteen", 30);
        Delivery delivery05 = new Delivery("L78SJ289U45", "Nearthelanders Street,thirty-seven", 25.32);


        Way way01 = new Way("17L7-0234", 60.5, driver01, delivery01, delivery02, delivery03, delivery04, delivery05);


        way01.record();






    }
}
