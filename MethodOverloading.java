class MethodOverloading {
   
        static int plusMethod( int x , int y)
        {
           return x + y;
        }
       
        static double plusMethod(double x , double y)
        {
            return x + y;
        }
       
        public static void main(String[] args){
            int myNum1 = plusMethod(5,8);
            double myNum2 = plusMethod(0.5,3.2);
            System.out.println(myNum1);
            System.out.println(myNum2);
        }
       
    }
