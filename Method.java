class Method {
    static void MyMethod(String fname, int age){
        System.out.println(fname +  "just got executed! " + age );
    }
    public static void main(String[] args) {
        MyMethod("John ", 5);
        MyMethod("Bob ", 5);
    }
}
