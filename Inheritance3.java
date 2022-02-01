public class Inheritance3 {
    public static void main(String[] args) {
        A obj = new A();;
        B cobj = new B();
        obj.i=10;
        cobj.i=11;
        cobj.i=12;
        System.out.println(obj.i+" "+cobj.i+" "+cobj.j);
        
        obj=cobj;//baseclass variable can refer derived class obj.This can only refer to i.unaware of j
        //obj.j;-error
    }

}

class A
{
    int i;
}

class B extends A
{
    int j;
}
//28-01-2022