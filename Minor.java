class Minor {
    static void MyMethod(int age){
        if (age > 18){
            System.out.println("Not Minor");
        }
        else if(age < 18){
            System.out.println("Minor");
            
        }
        
        else{
            System.out.println("You are 18.");
        }
            
    }
    public static void main (String[] args){
        MyMethod(17);
        
    }
}
