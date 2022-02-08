public class Interfaces1 {
    public static void main(String[] args) {
        kit k = new kit();
        pen p = new pen();
        pencil p1 = new pencil();
        k.dosomething(p1);
    }
}

interface  writeableobj //all methods are abstract.No place for concrete methods
{
    void write();//public and abstract
    int var=6; //by default static and final.class scope
}

interface readableobj
{
    void read();
}

class demo
{
    //some defn
}

class pen extends demo implements writeableobj,readableobj  //multiple inheritance can be done this way
{
    public void write() //public is compulsary for interfaces
    {
        System.out.println("I am pen");
    }

    public void read()//it is must to implement else error
    {
        System.out.println("You are reading");
    }
}

class pencil extends demo implements writeableobj
{
    public void write()
    {
        System.out.println("I am pencil");
    }
}

class kit
{
    void dosomething(writeableobj obj)
    {
        obj.write();
    }
}