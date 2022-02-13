//check WhyGenerics.java

public class Generic {
    public static void main(String[] args) {
        //box b1=new box();
        box <String>b1 = new box<String>();
        String s="OOADJ";
        b1.put(s);
        //String s1=(String)b1.get();
        String s1=b1.get(); //no type casting
        System.out.println(s1);

        int x=100;
        //box<int> b2=new box<int>();--this wont work. Generic type only works for references.use corresponding wrapper class
        box<Integer> b2=new box<Integer>();
        b2.put(x);
        int y=b2.get();
        System.out.println(y);

        String s2=(String)b1.get();
    }                              
}


class box<T> //any alphabet
{
    private T o;
    public void put(T o)
    {
        this.o=o;
    }
    public T get()
    {
        return this.o;
    }
}
