public class Overloading 
{
    public static void main(String[] args) {

        Sample s = new Sample();
        s.add();
        s.add(10);
        s.add(10,20);
        s.add(10.2,20.2);
        s.add(10,20.2);
        s.add(10.2,20);

        //implementing polymorphism via overloading
        //overloading is not possible with same function prototype but diff return type.it throws an error(already defined)
    }
}

class Sample
{
    int x;

    void add()
    {
        System.out.println("No arg method");
        System.out.println("Value="+0);
    }

    void add(int x)
    {
        System.out.println("One int arg method");
        System.out.println("Value="+x);
    }

    void add(int x,int y)
    {
        System.out.println("2 int arg method");
        System.out.println("Value="+(x+y));
    }

    void add(double x,double y)
    {
        System.out.println("2 double arg method");
        System.out.println("Value="+(x+y));
    }

    void add(int x,double y)
    {
        System.out.println("one int one double arg method");
        System.out.println("Value="+(x+y));
    }

    void add(double x,int y)
    {
        System.out.println("one double one int arg method");
        System.out.println("Value="+(x+y));
    }
}

//22-01-2022