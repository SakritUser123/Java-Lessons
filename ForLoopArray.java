class ForLoopArray {
    public static void main(String[] args) {
        
        int[] nums = { 1, 4 , 2 , -1};
        String[] cars = new String[4];
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";// new size is 4 of cars array
        System.out.println(cars[0]);
        int sum = 0;
        for (int i = 0; i < nums.length; i ++ ){
            sum += nums[i];
        }
        System.out.println(sum);
       }
    }
