
package TaskMaster;



public class task {
    
    
     static String name;
    static String descrip;
    
    public task(){
        name = "";
        descrip = "";
}
    
    public task(String n, String d){
        name = n; 
        descrip = d;
    }
    
    public String getDescription(){
        return descrip;
    }
    
    public String getName(){
        return name;
    }
    
    public void setDescription(String d){
        descrip = d;
    }
    
    public void setName(String n){
        name = n;
    }
    
    @Override
    public String toString(){
       return "Name: " + name + "\nDescription: " + descrip + "\n=======\n";
    }
    
    public boolean validate() {
        if(name == null || descrip == null || name.equals("") || descrip.equals(""))
            return false;
        else
            return true;
    }
    
}
