public class Overriding {
    public static void main(String[] args) {
        A pobj=new A();
        B cobj=new B();
        A ref;
        //pobj.show();//base class reference
        //cobj.show();//child class reference
        ref=cobj;
        ref.show();//dynamic method dispatch
    }
}
//overriding-dynamic polymorphism
class A
{
    void show()
    {
        System.out.println("I am in A");
    }
}

class B extends A{
    void show()
    {
        System.out.println("I am in class B");
        super.show();
    }
}

//28-01-2022
