public class Interfaces2 implements write,read
{
    public void disp()
    {
        System.out.println("Implementation of disp");
    }
    public static void main(String[] args) {
        write r=new Interfaces2();
        Interfaces2 d = new Interfaces2();
        r.disp();
        System.out.println("Value of r="+r.c);
        //r.c++;-error cuz itz static and final
        d.disp();
        System.out.println("Value of r="+d.c);
    }
}

interface write{
    void disp();
    //int c;
    int c=10;

    //In recent versions default methods are supported

    default void New()
    {
        System.out.println("default");
    }
}

interface read
{
    void disp();
}

//03-02-2022