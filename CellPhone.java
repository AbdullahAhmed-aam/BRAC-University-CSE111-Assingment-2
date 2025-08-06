public class CellPhone{
  public String model = "unknown";
  public int num = 0;
  public String[] contact = new String[3];
  
  public void printDetails(){
    System.out.println("Phone Model "+model);
    System.out.println("Contacts Stored "+num);
    if (num==0){
      return;
    }
      for (int i=0; i<num; i++){
      System.out.println(contact[i]);
    }
  }
  public void storeContact(String x){
    if(num<3){ 
      System.out.println("Contact Stored");
      contact[num]=x;
      num++;}
    else{
      System.out.println("Memory full. New contact can't be stored.");
    }
  }
}