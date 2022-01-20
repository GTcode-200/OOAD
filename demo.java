class rect
{
    int l;//default access sp-access level within package
    int b;
    private int a;//this is made private because it's value should not be given outside this class for any object

    void calcarea()
    {
        a=l*b;//can be accessed within this class so no err
        System.out.println("Area="+a);
    }
}

public class demo 
{
    public static void main(String[] args) {
        System.out.println("Good morning");
        rect r=new rect();
        rect r1=new rect();

        r.l=10;
        r.b=20;
        //r.a=34;--->this throws error coz a is private
        r1.l=100;
        r1.b=200;
        r1.calcarea();
    }    
}
