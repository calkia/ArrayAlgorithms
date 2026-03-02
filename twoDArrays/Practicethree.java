package twoDArrays;

public class Practicethree {
    public static void main(String[] args) {
        String[][] arr = {{"Jack", "Jill", "Jane", "Joey"},{"Maurn", "Molly", "Mason", "Maureen"},{"Emma", "Eileen", "Elizabeth",	"Emma"}};
        print(shortenMe(arr));
        System.out.println(countDuplicates(arr));
        print(shiftMe(arr));
    }
    public static void print(String[][] arr){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static String[][] shortenMe(String[][] arr){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                arr[row][col] = arr[row][col].substring(0,3);
            }
        }
        return arr;
    }
    public static int countDuplicates(String[][] arr){
        int most = 0;
        int rightRow = -1;
        int count = 0;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                    for(int col2 = 0; col2<arr[0].length; col2++){
                        if(col != col2 && arr[row][col].equals(arr[row][col2])){
                            count++;
                        }
                    }
            }
            if (most<count){
                most = count;
                rightRow = row;
            }
        }
        return rightRow;

    }
    public static String[][] shiftMe(String[][] arr){
        String[][] newArr = new String[arr.length-1][arr[0].length-1];
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                if(row == 0 && col == 0){
                    newArr[row][col] = arr[arr.length-1][arr[0].length-1];
                }
                else{
                    if(col == arr[row].length-1){
                        newArr[row][col] = arr[row-1][0];
                    }
                    else{
                        newArr[row][col] = arr[row][col-1];
                    }
                }
            }
        }
        return newArr;

    }
}
