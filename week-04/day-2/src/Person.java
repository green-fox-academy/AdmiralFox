public class Person {

    public String name;
    public int age;
    public  String gender;

    public void introduce() {
        System.out.println("Hi, I`am" + this.name +",a " + this.age + "year old " + this.gender);
    }
    public  void getGal() {
        System.out.println("My goal is: Live for the moment");
    }

    public Person() {
        this.name = "Default";
    }

    public Person(String name, int age, String gender) {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

}
