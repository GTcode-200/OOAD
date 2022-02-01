public class Findarea {
    public static void main(String[] args) {
        //shape s = new shape(0,0);//objects cant be instantiated for abstract classes
        rect r = new rect(2,3);
        triangle t = new triangle(3,4);
        System.out.println(r);//rect@1f32e575-hashcode is printed if tostring is not overridden

        //s.calcarea();
        r.calcarea();
        t.calcarea();
        
    }
}
//Abstract methods have no body
//Abstract class can also have concrete methods
//Ctt and static methods cant be made abstract
abstract class shape //if atleast one abstract method declare class abstract
{
    int d1;
    int d2;


shape(int a,int b)
{
    d1=a;
    d2=b;
}

/*void calcarea()
{
System.out.println("Cannot be defined");
}*///no use so make this abstract

abstract void calcarea();



}

class rect extends shape
{
    rect(int a,int b)
    {
        super(a,b);
    }

    void calcarea()
    {
        System.out.println("Area of rectangle= "+(d1*d2));
    }

    //override toString
}

class triangle extends shape
{
    triangle(int a,int b)
    {
        super(a,b);
    }

    void calcarea()
    {
        System.out.println("Area of triangle = "+(0.5*d1*d2));
    }
}

//31-01-2022