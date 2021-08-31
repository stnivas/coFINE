import java.util.ArrayList;
public class Employees{

 private String name;
 private String  id;
 private String address;
 private Employee employee;

	public  Employees(){
	  	System.out.println("Default Constructor called");
	 }
	 
	 
   public Employees(String name){
	       
	  	System.out.println(name);
	 }
	 
	 
	public  Employees(int number){
	   System.out.println(number); 	 
   }
   
   
   public Employees(ArrayList<String>list){
	   System.out.println(list); 	 
   }	
   
  public Employees(Employee employee) {
  this.employee=employee;
  System.out.println(this.employee);
} 
 public void setName(String name){
  this.name=name;
  }
  
  public String getName(){
  return name;
  }
  public  void setId(String id){
  this.id=id;
  }
  public String getId(){
  return id;
  }
  public  void setAddress(String address){
  this.address=address;
  }
  public String getAddress(){
  return address;
  }
}  
 
