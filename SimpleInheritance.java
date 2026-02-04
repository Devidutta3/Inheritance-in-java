//simple Inheritance nothing but which contain only one super class and only one sub class is called simple Inheritance
/*Syntax:  class super
{
    ___
    ____
    ____
}
    class sub ectends super
    {
    
    }

/* */
 
 class SimpleInheritance {
    int roll;
    String name;
    int marks;
    void input()
    {
        System.out.println("Enter roll name & marks:");
    }
    
}

class devi extends SimpleInheritance
{
       void disp()
       {
          roll=1;
          name="Devi";
          marks=89;
          System.out.println(roll+" "+name+" "+marks);
       }

       public static void main(String[] args) {
        devi obj=new devi();
        obj.input();
        obj.disp();
       }
}
