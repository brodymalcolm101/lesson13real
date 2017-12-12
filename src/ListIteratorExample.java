
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

    static ArrayList<String> al = new ArrayList();
    static ListIterator li = al.listIterator();
    static int pos=0;
    
    public static void main(String[] args) {
        al.add("a");
        al.add("b");
        al.add("c");
        li = al.listIterator();
        showList();
        //move 1
        System.out.println("1 - move over item " + li.next());
        pos++;
        showList();
        //2
         System.out.println("2 - move over item " + li.next());
        pos++;
        showList();
        //3
         System.out.println("3 - removing last item travelled over: b" ) ;
         li.remove();
        pos--;
        showList();
       // 4 
        System.out.println("4 - Adding b back to left of iterator");
        li.add("b");
        pos++;
        showList();
        // 5
         System.out.println("5 - move over item " + li.next());
        pos++;
        showList();
       // 6 
        System.out.println("6 - move back over item " + li.previous());
        pos--;
        showList();
        //move 7 
        System.out.println("7 - removing last item travelled over: b" ) ;
         li.remove();
        showList();
        // 8
         System.out.println("8 - move back over item " + li.previous());
        pos--;
        showList();
        // 9
        System.out.println("9 - set the last item travelled over to e");
        li.set("e");
        showList();
        // 10 & 11
        System.out.println("11 - Adding c and b back into the left of interator");
        li.add("b");
        pos++;
        li.add("c");
        pos++;
        showList();
        // 12 
        
        System.out.println("12 - trying to remove, but will cause error");
        System.out.println("must do a previous or next first");
        try{ 
        li.remove();
        } catch (Exception e){
            System.out.println("The following error occured");
            System.out.println(e);
        }
        //code lives on down here
        showList();
        
         // 13 
         System.out.println(" 13 - Moving next past " + li.next());
         pos++;
         showList();
         
         //14 
         System.out.println(" 13 - trying to Move next past end of the list");
         try{
             li.next();
         }  catch (Exception e){
             System.out.println(e);
         }
         showList();
         //15 
         System.out.println("travelling to the front of the list");
         while(li.hasPrevious()){
             System.out.println(li.previous());
             pos --;
         }
         showList();
         // 16 BONUS
         System.out.println("removing last thing it saw");
         li.remove();
         showList();
         
    }
    
    public static void showList(){
        for (int i = 0; i < al.size(); i++) {
            if (i == pos)
                System.out.print("*");
            System.out.print(al.get(i));
          
               
            
            if(pos == al.size()) System.out.print("*");
        }   
        
             System.out.println("");
       
    } 
    }
    

