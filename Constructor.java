public class Constructor {
    int x;
    public Main() //Consturctor name must match class name should not be a void method
    {
        x = 5;
    }
   
    public static void main(String[] args)
    {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
