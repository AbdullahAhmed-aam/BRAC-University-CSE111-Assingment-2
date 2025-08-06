public class Employee{
  public String name;
  public double salary = 30000.0;
  public String designation = "junior";

  public void displayInfo(){
    System.out.println("Employee Name: "+name);
    System.out.println("Employee Salary: "+salary);
    System.out.println("Employee Designation: "+designation);
  }

  public void newEmployee(String x){
    name=x;
  }

  public void calculateTax(){
    double tax=0;
    if (salary<=30000){
      System.out.println("No need to pay tax");
    }
    else if(salary>=50000){
      tax= (salary*.3);
      System.out.println(name+" Tax Amount: "+tax);
    }
    else{
      tax=(salary*.1);
      System.out.println(name+" Tax Amount: "+tax);
    }
    
  }

  public void promoteEmployee(String y){
    if(y=="senior"){
      designation = "senior";
      salary = (30000.0+25000);
      System.out.println(name+" has been promoted to "+designation);
      System.out.println("New Salary : " +salary);
    }
    else if (y=="lead"){
      designation = "lead ";
      salary = (30000.0+50000);
      System.out.println(name+" has been promoted to "+designation);
      System.out.println("New Salary : " +salary);
    }
    else if (y=="manager"){
      designation = "manager  ";
      salary = (30000.0+75000);
      System.out.println(name+" has been promoted to "+designation);
      System.out.println("New Salary : " +salary);
    }
  }
}