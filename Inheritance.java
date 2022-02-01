public class Inheritance
{
    public static void main(String[] args) 
    {
        
    
        A pobj=new A();
        B cobj=new B();

        pobj.i=10;
        pobj.j=20;
        //pobj.k=100;-this gives error
        System.out.println("Parent obj info");
        pobj.showij();

        cobj.i=10;
        cobj.j=20;
        cobj.k=30;

        System.out.println("Child obj info");
        cobj.showk();
        cobj.sum();
        cobj.showij();//same o/p as pobj.showij()

        System.out.println(A.p);//100
        System.out.println(B.p);//100
        B.p=200;//value changed in parent also
        System.out.println("value of A after b.p=200 "+A.p);//200

    }
}

class A
{
    int i,j;//if they are made private then it can't be accessed in child class
    static int p=100;
    void showij()
    {
        System.out.println("i an j="+i+" "+j);
    }
}

class B extends A
{   
    int k;
    void showk()
    {   showij();//works without any error
        System.out.println("k="+k);
    }

    void sum()
    {
        System.out.println(i+j+k);
    }
}

class C extends B//Multi level inheritance..if extends A it is heirarchical inheritance
{
    int x;
    void display()
    {   System.out.println("Child class");
        System.out.println("i="+i+"j="+j+"k="+k+"x="+x);
    }
}

//27-01-2022