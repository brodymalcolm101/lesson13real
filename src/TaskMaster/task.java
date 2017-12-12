
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
        String str = "";
       str += "Name: " + name;
       str += "\n Description: " + descrip;
       return str;
    }
    
}
