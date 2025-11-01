class Shape {
    String color;
    String type;
    }

class Triangle extends Shape {
  public  void printInfo(String color){
      System.out.println(this.color);
  }
}

public class Main {
    public  static void main(String[] args){
     Triangle t1 = new Triangle();
             t1.color = "Red";
             t1.printInfo(t1.color);

    }
}




