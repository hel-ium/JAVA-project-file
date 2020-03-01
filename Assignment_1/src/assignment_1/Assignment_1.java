
package assignment_1;

public class Assignment_1 {

    public static void main(String[] args) {
       
        System.out.println("Person 1: ");
        myself me=new myself();
        
        
        System.out.println("Person 2: ");
        myself me2=new myself("Al jaber",15,18);
        
        me.name="Foujiya";
        me.age=12;
        me.Roll=11;
        
        System.out.println("Person 3 : ");
        myself me3=new myself(me);
    }
    
}
