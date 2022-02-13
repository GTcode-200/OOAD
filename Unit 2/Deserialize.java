import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialize {
    public static void main(String[] args) {
        Studentinfo si=null;

        try{
            FileInputStream fis=new FileInputStream("student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            si=(Studentinfo)ois.readObject();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(si.name);
        System.out.println(si.rid);
        System.out.println(si.contact);//null coz static.confidential


    }
    
}

class Studentinfo implements Serializable  //serializable-marker interface
{
    String name;
    transient int rid; //confidential .this wont be stored. default value(0) is stored
    static String contact;

    Studentinfo(String n,int r,String c)
    {
        this.name=n;
        this.rid=r;
        this.contact=c;
    }
}


//10/2/22


//if we make some changes in .txt file we get stream corrupted error in run time