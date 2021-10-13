import java.util.ArrayList;

class Main {  
  public static void main(String[] args) {    Student student1 = new Student();    student1.setName("Arnold Spielberg");    student1.setGPA(4.0);    
  student1.setMajor("Electrical Engineering");

  Student student2 = new Student();
  student2.setName("Ashley Reed");
  student2.setGPA(4.3);
  student2.setMajor("Information Systems");

  student1.print();
  student2.print();

  double sum;
  sum = 0; 

 // System.out.println(sum);
  ArrayList<Double> gpas = new ArrayList<Double>();
  gpas.add(student1.getGPA());
  gpas.add(student2.getGPA());

  //System.out.println(gpas);

  for(double i : gpas) {
    sum += i;
  }

  double average = sum / gpas.size();

  System.out.println("The average GPA is " + average);
}}