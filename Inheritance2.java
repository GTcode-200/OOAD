public class Inheritance2 {
    public static void main(String[] args) {
        Boxweight obj=new Boxweight(10,20,30,23);
        Boxweight zobj=new Boxweight();
        System.out.println(zobj.volume());
        Boxweight oobj=new Boxweight(obj);
        System.out.println(oobj.volume());


        double vol;
        vol=obj.volume();
        System.out.println(obj.volume());
    }
    
}

class Box
{
    double width;
    double height;
    double depth;

    Box()
    {
        width=0;
        height=0;
        depth=0;
    }

    Box(double w,double h,double d)
    {
        width=w;
        depth=d;
        height=h;
    }

    Box(Box ob)//copy constructor. it is getting obj of type Boxweight.
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

    double volume()
    {
        return width*height*depth;
    }
}

class Boxweight extends Box{
    double weight;

    Boxweight()
    {
        super();
        weight = 0;
    }

    Boxweight(double w,double h,double d,double m)
    { //width=w;-error because super should be the first stmt
       /* width=w;
        height=h;
        depth=d;*/
        super(w,h,d);//this stmt replaces above 3. const matching this parameters will be called.Considers immediate super class
        weight=m;
    }

    Boxweight(Boxweight b)
    {
        super(b);//copy cons
        weight=b.weight;
    }
}
//31-01-2022