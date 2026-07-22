package academy.devdojo.maratonajava.desafios.Associations.Challenge03.test;

import academy.devdojo.maratonajava.desafios.Associations.Challenge03.domain.Freelancer;
import academy.devdojo.maratonajava.desafios.Associations.Challenge03.domain.Project;

public class Test01 {
    public static void main(String[] args) {
        Freelancer freelancer01 = new Freelancer("Felipe", "Back-end");
        Freelancer freelancer02 = new Freelancer("Emerson", "Front-end");
        Freelancer freelancer03 = new Freelancer("Micael", "Full stack");

        Project project01 = new Project("Create a system for a school", 2000);
        Project project02 = new Project("Create a system for a doctor", 10000);
        Project project03 = new Project("Create a system for a veterinarian", 3400);

        project01.addFreelancer(freelancer01);
        project01.addFreelancer(freelancer02);
        project01.addFreelancer(freelancer03);

        project02.addFreelancer(freelancer01);
        project02.addFreelancer(freelancer02);

        project03.addFreelancer(freelancer01);
        project03.addFreelancer(freelancer03);

        project01.informationProjet();
        project02.informationProjet();
        project03.informationProjet();



















    }
}
