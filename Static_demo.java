public class Static_demo {
public static void main(String[] args) {
    demo d= new demo();
   // demo d1= new demo();

    d.a=10;
    d.b=20;
    d.roi=7;//value can also be changed this way.This value will be reflected to all the objects
    System.out.println(d.a+" "+d.b+" "+demo.roi);
    d.display();
    //demo.display();-compile error.-->cannot be referenced from static context(if the method was non static)
    demo.display();
    //display()-error(this can be done only for methods within the same class)

    
}
static
    {
        System.out.print("testing");
    }//This block is executed before main()

}

class demo{
    int a,b;//instance variables
    static int roi=5;

    static void display()
    {
        System.out.println("This is static method");
        roi++;
        demo obj=new demo();
        System.out.println("Using non static var by creating obj "+obj.a);
        //System.out.println(a);--error-->cant make static reference to non static fields.
        //basically static method cant access non static var
        //If we want to access non static var then an obj should be instantiated
        //a++;-error-->non static var can't be changed in static func
       //disp();-error--->Cannot make a static reference to the non-static method disp() from the type demo
       //It cant call non static methods.
    }

    void disp()
    {
        System.out.println("This is non static method");
        roi++;
        a++;
        display();//no error
    }

    static
    {//can intit static DMs
        System.out.println("This is static block");
    }//this block is executed as soon as the object is created but only once(only whn first obj is created)

}

//25-01-2022