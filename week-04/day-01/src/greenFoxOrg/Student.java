package greenFoxOrg;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println(super.getPersonIntroduction() + " from " + previousOrganization + " who skipped "
        + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  @Override
  public Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }
}
