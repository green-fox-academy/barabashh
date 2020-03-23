package greenFoxOrg;

public class Person {

  String name;
  int age;
  String gender;
  protected String getPersonIntroduction(){
    return "Hi, I'm " + this.name + ", a " + this.age + " year old " + gender;
  }

  public void introduce() {
    System.out.println(getPersonIntroduction() + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment.");
  }

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

}
