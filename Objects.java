public class Objects {
    int x = 3; // If x in final we cannot ovveride the value of x
    int y =4;
    public static void  main(String[] args)
    {
        Main myObj =  new Main();// not affected becuase these are diffrent objects
        Main myObj2 = new Main();
       
        myObj2.x = 50;
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
       
    }
   
}
