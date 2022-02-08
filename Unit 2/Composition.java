public class Composition {
    public static void main(String[] args) {
        line l1=new line(10,20,30,40);
        l1.print();//x=10,y=20  x=30,y=40
    }
}

class  line  //if we extend we get only 1 point but we need 2 points
{
    point p1;
    point p2;

    line(int x,int y,int a,int b)
    {
        p1=new point(x,y);
        p2=new point(a,b);
    }
    void print()
    {
        p1.disp();
        p2.disp();
    }
}

class point
{
    int x;
    int y;
    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    void disp()
    {
        System.out.println("x= "+x+" y="+y);
    }
}
