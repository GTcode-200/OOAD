public class Generic4 {
    
}

interface myinterface
{
    void print();
}

interface geninterface<T,U>
{
    U calcarea(T a,T b);
    T disparea();
}

class demo implements myinterface{
    public void print()
    {
        //imple of print
    }
}

class demo1 implements geninterface <String,Integer>
{
    public Integer calcarea(String s,String p)
    {
        //code
    }
    public String disparea()
    {

    }
}

class demo2 implements geninterface<Doouble,Rect>
{

}

//incomplete code
//10/2/2022