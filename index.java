
import java.util.ArrayList; 
  
 class Index
{ 
    public static void main(String[] args) 
    { 
  
        // creating an Empty Integer ArrayList 
        ArrayList<Integer> arr = new ArrayList<Integer>(4); 
  
        // using add() to initialize values 
        // [10, 20, 30, 40] 
        arr.add(10); 
        arr.add(20); 
        arr.add(30); 
        arr.add(40); 
  
        
        int element = arr.get(2); 
  
        System.out.println("2 " + element); 
    } 
} 
