class vichel {
     void start()
    {
        System.out.println("Your vichel Started......");
    }
}

class car extends vichel
{
    public static void main(String[] args) {
    vichel obj=new vichel();
     obj.start();
    }
     
}
