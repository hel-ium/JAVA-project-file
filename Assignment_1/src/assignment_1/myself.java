
package assignment_1;

public class myself {
    String name="Nishat";
    int age=20;
    int Roll=29;
    
    public myself()
    {
        System.out.println("Name= "+name+", Age= "+age+", Roll= "+Roll);
    }
    public myself(String name,int age,int Roll)
    {
        this.name=name;
        this.age=age;
        this.Roll=Roll;
        System.out.println("Name= "+name+", Age= "+age+", Roll= "+Roll);
    }
    public myself(myself others)
    {
        this.name=others.name;
        this.age=others.age;
        this.Roll=others.Roll;
        System.out.println("Name= "+name+", Age= "+age+", Roll= "+Roll);
    }
    
}
