package greenFoxOrg;

public class Mentor extends Person {
  String level;

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println(super.getPersonIntroduction() + " " + level + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    this.level = "intermediate";
  }
}
