package twoDArrays;
/**
 * Kiana Tjon / 2-27-26 / Practice 2
 */
public class practiceTwo{
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,2,2,3},{3,3,3,4}};
        int sum;
        int bigSum = 0;
        //task one
        for(int row = 0; row<arr.length; row++){
            sum = 0;
            for(int col = 0; col<arr[row].length; col++){
                sum+= arr[row][col];
            }
            System.out.println("The sum of row "+(row+1)+" is "+sum);
            bigSum += sum;
        }
        System.out.println("The average of all rows is "+(double)bigSum/(arr.length));
        //task two
        bigSum = 0;
        for(int[] row: arr){
            sum = 0;
            for(int num: row){
                sum += num;
            }
            System.out.println("The sum:"+sum);
            bigSum += sum;
        }
        System.out.println("The average of all rows is "+(double)bigSum/(arr.length));
    }
}