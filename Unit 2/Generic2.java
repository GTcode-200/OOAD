public class Generic2 {
    
    static <T> void gendisp(T ele)//generic method
    {
        System.out.println(ele);
        System.out.println(ele.getClass());

    }

    public static void main(String[] args) {
        gendisp(10);
        gendisp(23.55);
        gendisp("Hello");

        demo d=new demo();
        gendisp(d);
    }
}

class demo
{
    int x;
    public String toString()
    {
        return "val of x="+this.x;
    }
}