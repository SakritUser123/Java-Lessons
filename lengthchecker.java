class length_check{
    public static void main(String[]args){
        
        String[] books = {"blue","red","yellow"};
        if (books.length < 2){
            System.out.println("Empty");
            
            
        }  else if (books.length==2){
            System.out.println("Average Size");
        }
            
            else if (books.length > 2){
                System.out.println("Full");
            }
            
        }
    
}
