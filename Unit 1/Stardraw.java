public class Stardraw {
    static void drawStar(int n)
    {
        if(n==1)
        {
            System.out.println("*");
        }
        else
        {
            System.out.print("*");
            drawStar(n-1);
        }
    }

    public static void main(String[] args) {
        drawStar(5);//if we dont specify static this throws error or fn should be called by creating obj
        drawStar(4);
        drawStar(3);
        drawStar(2);
        drawStar(1);

    }
}
