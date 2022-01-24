public class PassRef {
    public static void main(String[] args) {
        Test t=new Test(5);
        System.out.println(t.x);//5

        change(t);

        System.out.println(t.x);//10

    }
        public static void change(Test a)//static because this function has to be called without obj
        { //a=new Test()-if this stmt is added then no chnges reflected 
            a.x=10;
        }
    
    
}

class Test
{
    int x;
    Test(int i)
    {
        x=i;
    }
    Test()
    {
        x=0;
    }
}
//24-01-2022