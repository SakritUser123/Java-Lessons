class NarrowingCasting{
    public static void main(String[] args) {
        double dec = 9.78;
        int num = (int) dec; // narrowing casting drops decimals
        System.out.println(dec); // Outputs 9.78
        System.out.println(num); 
        
        
    }
}
