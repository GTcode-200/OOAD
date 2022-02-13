import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        try{
            Studentinfo si=new Studentinfo("tarun", 100,"56789");
            FileOutputStream fos=new FileOutputStream("student.txt");//file ptr.If not existing create else update contents
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
        }
    }


class Studentinfo implements Serializable
{
    String name;
    int rid;
    static String contact;

    Studentinfo(String n,int r,String c)
    {
        this.name=n;
        this.rid=r;
        this.contact=c;
    }
}

//10-02-2022
//.txt format is not proper