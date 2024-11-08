class xyz
{
void input ()
{
    System.out.println("enter your name");
}
}
class A extends xyz
{
    void show ()
    {
        System.out.println("my mnmame is ankit");
    }
    }
    class B extends A{
    void disp ()
{
    System.out.println("my name is ankush");
} 
    }
class demo{
public static void main(String[] args) {
    A r=new A();
    B r1=new B();
    r.input(); r.show();
    r1.input(); r1.disp();
    
}
    }
    
    
  
