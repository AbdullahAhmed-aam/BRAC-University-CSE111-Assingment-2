//Task1
public class UniversityTester{
  public static void main(String[] args){
    
    University uni = new University();
    University uni1 = new University();
    
    System.out.println(uni);
    System.out.println(uni1);
    System.out.println(uni.name);
    System.out.println(uni1.name);
    System.out.println(uni.country);
    System.out.println(uni1.country);
    
    //location of objects are not the same
    
    uni.name="Imperial College London";
    uni.country="England";
    uni1.name="BRAC University";
    uni1.country="Bangladesh";
    
    System.out.println(uni);
    System.out.println(uni1);
    System.out.println(uni.name);
    System.out.println(uni1.name);
    System.out.println(uni.country);
    System.out.println(uni1.country);
  }
}

