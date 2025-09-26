public class PubStat {
   
    static void myStaticMethod()
    {
        System.out.println("Hello world");
    }
   
    public void myPublicMethod()
    {
        System.out.println("Hello world");
    }
    public static void main(String[] args)
    {
        myStaticMethod();
        Main myObj = new Main(); // for public methods we need to create objecs for statuc methods we dont need to create objects.
        myObj.myStaticMethod();
    }
   
}
