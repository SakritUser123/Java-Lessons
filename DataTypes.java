class DataTypes {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name);
        int num = 6;
        System.out.println(num);
        int spec;
        spec = 8;
        System.out.println(spec * num);
        num = 8; // num is now 8 overwrote the previous value.
        System.out.println(num);
        final int cons = 9; // cannot overwrite value
        System.out.println(cons);
        float dec = 0.99f; // f needs to be at end for floats.
        System.out.println(dec);
        char letter = 'D';
        System.out.println(letter);
        boolean Bool = true;
        System.out.println(Bool);
       
    }
}
