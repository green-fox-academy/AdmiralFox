public class Student extends Person {

    public String previousOrganization;
    public int skippedDays;



    public void getGoal() {
        System.out.println("Be a junior software developer");
    }
    public void introduce() {
        System.out.println("Hi, I`am " +
                this.name +",a " +
                this.age + " year old " +
                this.gender + "from" +
                this.previousOrganization + " who skipped " +
                this.skippedDays + " days from the course already." );
    }


    public void skipDays(int number) {
        skippedDays += number;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }


    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.skippedDays = 0;
    }
}
