package academy.devdojo.maratonajava.desafios.Associations.Challenge03.domain;

public class Project {
    private String title;
    private double totalBudge;
    private Freelancer[] freelancers;

    //A project doesn't need to have freelancer in the start
    public Project(String title, double totalBudge) {
        this.title = title;
        this.totalBudge = totalBudge;
    }

    //method to verif if exist this freelancer in this project
    public boolean hasFreelancer(Freelancer freelancer){
        if(this.freelancers == null){
            return false;
        }
        for(Freelancer free : this.freelancers){
            if(free == freelancer){
                return true;
            }
        }

        return false;
    }

    //add new freelancer for the project
    public void addFreelancer(Freelancer freelancer){
        if(this.hasFreelancer(freelancer)){
            return;
        }

        if(this.freelancers == null){
            Freelancer[] freelancers = {freelancer};
            this.freelancers = freelancers;
            return;
        }

        Freelancer[] freelancers = new Freelancer[this.freelancers.length + 1];
        System.arraycopy(this.freelancers, 0, freelancers, 0, this.freelancers.length);

        freelancers[freelancers.length-1] = freelancer;

        freelancer.addProject(this);

        this.freelancers = freelancers;
    }

    //print the information abaout the project
    public void informationProjet(){
        System.out.println("#### PROJECT ####");
        System.out.println("Title: " + this.title);
        System.out.println("Total Budge " + this.totalBudge);
        System.out.println("Frelancers: " );
        for(Freelancer freelancer : this.freelancers){
            System.out.println(freelancer.getName());
        }
    }


    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTotalBudge() {
        return totalBudge;
    }

    public void setTotalBudge(double totalBudge) {
        this.totalBudge = totalBudge;
    }

    public Freelancer[] getFreelancers() {
        return freelancers;
    }

    public void setFreelancers(Freelancer[] freelancers) {
        this.freelancers = freelancers;
    }
}
