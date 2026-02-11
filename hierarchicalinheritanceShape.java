import java.util.Scanner;

class hierarchicalinheritanceShape
{
    Scanner sc=new Scanner(System.in);
  void areaofrec()
  {
     System.out.println("Enter Length of Rectangle:");
        int l=sc.nextInt();
        System.out.println("Enter Breadth of Rectangle:");
        int b=sc.nextInt();
        System.out.println("Area of Rectangle is:"+l*b);
  }

  void areaofcirc()
  {
    System.out.println("Enter Radius of Circle:");
    int r=sc.nextInt();
    final double pi=3.141;
    System.out.println("Area of Circle is:"+pi*r*r);
  }
}
class rectangle extends hierarchicalinheritanceShape
{
    public static void main(String[] args) {
        rectangle obj=new rectangle();
        obj.areaofrec();
    }
}class circle extends hierarchicalinheritanceShape
{
    public static void main(String[] args) {
        circle obj=new circle();
        obj.areaofcirc();
    }
}
 
    
