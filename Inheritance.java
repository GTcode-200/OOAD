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
        cobj.showij();//same o/p
    }
}

class A
{
    int i,j;//if they are made private then it can't be accessed in child class

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