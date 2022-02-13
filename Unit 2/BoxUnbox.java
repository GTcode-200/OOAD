public class BoxUnbox {
    public static void main(String[] args) {
        int a=10;//primitive type
        Integer b = new Integer(20);//reference type

        //Integer-wrapper class for primitive int type
        //boxing-primitive->corresponding reference type

        Integer c=30;//c=new Integer(30)---boxing

        //unboxing-reference type->corresponding primitive

        int d=c;//unboxing

        System.out.println(c);//toString is already overridden in Integer class
        System.out.println(d);
    }
}

//use Xlint to compile  . Integer() is depreciated in newer version