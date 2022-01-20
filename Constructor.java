class rect
{
    int l;
    int b;

    rect(int x,int y)
    {
        l=x;
        b=y;

        //constructors can be used as start up code
        //can be used to initialize data members
    }

    rect()
    {
        
    }//If there are no parameterized constructors then this is called by default when object is created without parameters.
     //But if any parameterized constructor is present then this has to be given explicitly else compile error
}

public class Constructor
{
    public static void main(String[] args) {
        
        rect r=new rect();
        rect r1=new rect(100,200);
        System.out.println("r.l="+r.l+"r.b="+r.b);// 0 0
        System.out.println("r1.l="+r1.l+"r1.b="+r1.b);// 100 200

    }    
}
