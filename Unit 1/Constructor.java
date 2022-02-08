class rect
{
    int l;//instance variable
    int b;

    rect(int x,int y)
    {
        l=x;
        b=y;

        /*
        if the parameters were l and b
        l=l;
        b=b;//values would have been 0 as they would be treated as local vars
        this.l=l;
        this.b=b;//-to resolve ambiguity.this is reference variable

        */

        //constructors can be used as start up code
        //can be used to initialize data members
    }// If this is private obj cant be created so cons should always be public. compile err if we create obj if constructor is private

    rect()
    {
        //this(10,20)-parameterized cons will be called.
    }//If there are no parameterized constructors then this is called by default when object is created without parameters.
     //But if any parameterized constructor is present then this has to be given explicitly else compile error

    //here rect is overloaded
    //destructer can't be overloaded.(but No concept of destructer in java)


    void display()
    {
        System.out.println("Display function");
    }
}

public class Constructor
{
    public static void main(String[] args) {
        
        rect r=new rect();
        rect r1=new rect(100,200);//we get compile error if we do this without creatin' constructor
        System.out.println("r.l="+r.l+"r.b="+r.b);// 0 0
        System.out.println("r1.l="+r1.l+"r1.b="+r1.b);// 100 200

        r.display();
        //r.rect();->This causes error cuz cons cant be called explicitly.Can be called only while creating obj

    }    
}

//21-01-2022