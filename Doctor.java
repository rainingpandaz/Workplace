import java.util.*;

public class Doctor extends Employee {

    private String speciality;

  public Doctor(){
    super();
    speciality = "";
  }

  public Doctor(double isalary, int iyears, String iname, String ispeciality){
    super(isalary, iyears, iname);
    speciality = ispeciality;
  }

  public void aboutThisDoctor(){
    super.aboutThisEmployee();
    System.out.print("They have a speciality of " + speciality + ".");
  }
  
}
  
