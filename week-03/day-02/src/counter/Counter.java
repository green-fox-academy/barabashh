package counter;

public class Counter {
  int field = 0;
  int initialValue = 0;
  Counter(){
  }
  Counter(int field){
    this.field = field;
    this.initialValue = field;
  }
  public void add(int number){
    field+=number;
  }
  public void add(){
    field++;
  }
  public int get(){
    return field;
  }
  public void reset(){
    this.field = this.initialValue;
  }
}
