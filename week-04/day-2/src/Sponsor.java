public class Sponsor extends Person{

    public String company;
    public int hiredStudents;

    public void introduce() {
        System.out.println("Hi, I'm " +
                this.name + ", a " +
                this.age + " year old " +
                this.gender + " who represents " +
                this.company + " and hired " +
                this.hiredStudents + " students so far.");
    }
    public void hire() {
        hiredStudents++;
    }
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.hiredStudents = 0;
    }
}

