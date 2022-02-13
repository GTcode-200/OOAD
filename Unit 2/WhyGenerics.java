public class WhyGenerics {
    public static void main(String[] args) {
        box b1=new box();
        String s="OOADJ";
        b1.put(s);
        String s1=(String)b1.get();//without (String) it gives error
        System.out.println(s1);

        int x=100;
        b1.put(x);
        int y=(int)b1.get();
        System.out.println(y);

        String s2=(String)b1.get();//Run time exception-java.lang.Integer cannot be cast to class java.lang.String
    }                              //Not checked during compile time
}

/*
no type safety-check in compile time itself so use generic programming
so generics were itroduced.
through generics we can create classes,methods and interfaces
type safety can be resolved
few algorithms work irrespective of type. ex-stack 
*/

class box //contain obj of any type
{
    private Object o;
    public void put(Object o)
    {
        this.o=o;
    }
    public Object get()
    {
        return this.o;
    }
}
