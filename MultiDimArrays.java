class MultiDimArrays {
    public static void main(String[] args) {
        int[][] multidim = {{2,5,4},{8,1,4}};
        multidim[1][2] = 6;
        System.out.println(multidim[1][2]);
        System.out.println("Rows: " + multidim.length);
        System.out.println("Cols in row 0: " + multidim[0].length);
        System.out.println("Cols in row 1: " + multidim[1].length);
        for (int row = 0; row < multidim.length; row++){
            for(int col = 0; col < multidim[row].length;col++){
                System.out.println("Row " +row + " col " + col);
            }
        }
        for (int[] row : multidim){
            for (int num : row){
                System.out.println(num);
            }
        }
    }
}
