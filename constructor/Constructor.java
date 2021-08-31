import java.util.ArrayList;
public class Employees{

 public String name;
 public  int age;
 /* private int age;
  private int id;
  private long phoneNumber;
  private String address;
   */

	public Constructor(){
	  	System.out.println("Default Constructor called");
	 }
	 
	 
   public Constructor(String name){
	       
	  	System.out.println(name);
	 }
	 
	 
	public Constructor(int number){
	   System.out.println(number); 	 
   }
   
   
   public Constructor(ArrayList<String>list){
	   System.out.println(list); 	 
   }	
   
   
   public Constructor(String empName, int empAge) {
   		System.out.println(empName); 
   		System.out.println(empAge); 
   }
   
   public String toString() {
		return "Constructor object with name " + names;
	}
   
   
   
   
  /*
     public Constructor(String name, int age, int id, long phoneNumber, String address){
   Constructor object=new Constructor();
  
   		this.name=name;
   		this.age=age;
   		this.id=id;
   		this.phoneNumber=phoneNumber;
   		this.address=address;
   	 System.out.println(object);	
   		
   }
  public void setName(String name){
   this.name=name;
  }
  
  public String getName(){
   return name;
  }
  
  public void  setAge(int age){
   this.age=age;
  }
  
  public int getAge(){
   return age;
  }  
    
  public void setId(int id){
    this.id=id;
    }
  
  public int getId(){
   return id;
  }  
    
  
  public void setPhoneNumber(int phoneNumber){
   this.phoneNumber=phoneNumber;
   }
  
  public long getPhoneNumber(){
   return phoneNumber;
  }  
  
  
  public void setAddress (String Address){
   this.address=address;
   }
  
  public String getAddress(){
   return address
  }  */
    
} 
 
 
