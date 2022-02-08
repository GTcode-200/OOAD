public class ObjectClassDemo {
    public static void main(String[] args) {
        rect r = new rect();
        rect r1 = new rect();
        rect r2=r1;
        
       // rect r3=r.clone();-----creates complete new copy.This is not working try later

        System.out.println(r);//rect@28a418fc--r.toString() is implicit
        System.out.println("Hash code is="+r.hashCode());//681842940
        System.out.println("Equals="+r.equals(r1));//false(compares memory locs but not contents of obj)
        System.out.println("Equals="+r2.equals(r1));//true
        System.out.println("getclass="+r.getClass().getName());//rect
        System.out.println("Equals="+r.getClass());//class rect
        System.out.println("ToString="+r.toString());//rect@28a418fc
        System.out.println("is instance of="+(r instanceof rect));//true. instanceof is operator
        System.out.println("Object class-"+r instanceof Object);//true
        //rect r3=(rect)((rect)r).clone();
        System.out.println(r1==r2);//true


    }
}

class rect
{
    int l,b;
}
