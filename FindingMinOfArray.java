class FindingMinOfArray {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int min = ages[0];
        for (int age : ages){
            if (age < min){
                min = age;
            }
            
        }
        System.out.println("min is " + min);
       }
    }
