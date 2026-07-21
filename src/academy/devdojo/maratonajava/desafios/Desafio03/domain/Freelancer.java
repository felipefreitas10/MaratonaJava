package academy.devdojo.maratonajava.desafios.Desafio03.domain;

public class Freelancer {
    private String name;
    private String specialty;
    private Project[] projetcs;

    //A freelancer can have or can't have projects
    public Freelancer(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    //method to verif if the freelancer have this project
    public boolean hasProject(Project project){
        if(this.projetcs == null){
            return false;
        }
        for(Project proj : this.projetcs){
            if(proj == project){
                return true;
            }
        }
        return false;
    }

    //add project to a freelancer -> redimensionamento de array
    public void addProject(Project project){
        if(this.hasProject(project)){
            return;
        }
        if(this.projetcs == null){
            Project[] projects = {project};
            this.projetcs = projects;
            return;
        }
        //create a new project's array
        Project[] projects = new Project[this.projetcs.length + 1]; //it will have the size of old array + 1
        System.arraycopy(this.projetcs,0,projects,0,this.projetcs.length); //copying the old array for the new
        for(int i = 0; i < projects.length; i++){ //add the new project's freelancer in the last position of new aray
            if(projects[i] == null){
                projects[i] = project;
            }
        }

        project.addFreelancer(this); //add this project for the freelancer

        //uptading the reference for the new array
        this.projetcs = projects;
    }


    //Print the information about the freelancer
    public void informationFreelancer(){
        System.out.println("#### FREELANCER ####");
        System.out.println("Name: " + this.name);
        System.out.println("Specialty " + this.specialty);
        System.out.println("Projects: ");
        for(Project project : this.projetcs){
            System.out.println(project.getTitle());
        }
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Project[] getProjetcs() {
        return projetcs;
    }

    public void setProjetcs(Project[] projetcs) {
        this.projetcs = projetcs;
    }
}
