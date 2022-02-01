public class Super_usage {
    public static void main(String[] args) {
        B cobj = new B(11,12);
        cobj.show();
        C obj=new C();

        A obja = new A();
        obja.shows();
        B objb = new B();
        objb.shows();
        C objc = new C();
        objc.shows();//own show fn is called

        //overridden methods-same fn signature in derived class. Functionality can be overridden
    }
}

class A
{
    int i;
    A()
    {
        System.out.println("Class A const");
    }

    void shows()
    {
        System.out.println("Show of class A");
    }
}

class B extends A{
    int i;//hides inherited i

    B(int a,int b)
    {
        super.i=a;
        i=b;
    }

    void show()
    {
        System.out.println("inherited i="+super.i);
        System.out.println("own i = "+i);
    }

    void shows()
    {
        System.out.println("Show of class B");
    }

    B()
    {
        System.out.println("Class B const");
    }
}

class C extends B{
    C()//All 3 ctt will be called. this order A,B,C supermost first
    {
        System.out.println("Class C const");
    }

    void shows()
    {
        System.out.println("Show of class C");
        super.shows();//recursion without super
    }
}
//27-01-2022