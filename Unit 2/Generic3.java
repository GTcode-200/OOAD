public class Generic3 {
    public static void main(String[] args) {
        rect <Integer> r1=new rect<Integer>(10,20,30);
    }
}

interface geninterface<T1, T2>
{
    T1 method(T2 x);
    T2 method2(T1 y);
}

class demo implements geninterface<String,Integer>
{
    String method1(Integer x)
    {return "";}

    public Integer method2(String y)
    {return 1;}
}

class rect<T>
{
    private T len;
    private T br;
    private T ht;

    rect(T a,T b,T c) //cons can be made generic
    {
        len=a;
        br=b;
        ht=c;
    }

    void disp()
    {
        System.out.println(len);
        System.out.println(br);
        System.out.println(ht);


    }
}
