package twoDArrays;
/**
 * Kiana Tjon / 2-27-26 / Smallest Value
 */
public class smallestValue{
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,2,2,3},{3,3,3,4}};
        int bigSum = 0;
        for(int col = 0; col<arr[0].length; col++){
            int small = Integer.MAX_VALUE;
            for(int row = 0; row<arr.length; row++){
                if(small > arr[row][col]){
                    small = arr[row][col];
                }
            }
            bigSum += small;
        }
        System.out.println("The average is: "+(double)bigSum/arr[0].length);
    }
}