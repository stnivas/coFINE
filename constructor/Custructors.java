public class Custructors{


	private Custructors(){
	
      	System.out.println("private Default  Custructors called");
    }
   public static privateObj dummy(){
   
    Custructors privateObj=new Custructors();
    
    privateObj.Custructors();
    
    return privateObj;
    }	
  }  
