import java.util.*;

public class Employee {

    private double salary;
    private int seniority;
    private String name;

  public Employee(){
    salary = 0.0;
    seniority = 0;
    name = "";
    
  }

    public Employee(double isalary, int iseniority, String iname){
    salary = isalary;
    seniority = iseniority;
    name = iname;
    
  }


  public void aboutThisEmployee(){
    System.out.println(name + " has a salary of " + salary + " dollars, and has " + seniority + " years of seniority.");
    
  }

  public void raiseSalary(double amount){
    salary += amount;
  }


  
}
  
