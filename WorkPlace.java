import java.util.*;

public class WorkPlace {

  
  public static Scanner kbr = new Scanner(System.in);

  public static void main(String[] args) {
    Employee e1 = new Employee();
    Employee e2 = new Employee(15.0, 3, "Carey");
    e2.raiseSalary(5.0);
    e2.aboutThisEmployee();
    Doctor e3 = new Doctor(150.0, 3, "Sam", "Pediatrician");
    e3.aboutThisDoctor();
  }
}
