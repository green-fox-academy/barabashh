package greenFoxOrg;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public void introduce() {
    System.out.println(super.getPersonIntroduction() + " who represents " + company +
        " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
