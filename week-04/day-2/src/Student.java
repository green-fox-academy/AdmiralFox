public class Student extends Person {

    public String previousOrganization;
    public int skippedDays;



    public void getGoal() {
        System.out.println("Be a junior software developer");
    }
    public void introduce() {
        System.out.println("Hi, I`am" +
                this.name +",a " +
                this.age + "year old " +
                this.gender + "from" +
                this.previousOrganization + " who skipped" +
                this.skippedDays + " days from the course already." );
    }

//    public int skipDays(numberOfDays) {
//
//    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }
}
