import java.util.ArrayList;
/**
 * Kiana Tjon
 * 2/9/2026
 * Remove Me
 */
public class RemoveMe {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(0);
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        nums.add(6);
        nums.add(7);
        nums.add(3);
        nums.add(9);
        nums.add(3);
        System.out.println("Remove 3's: "+removeMe(nums));
    }
    public static ArrayList<Integer> removeMe(ArrayList<Integer> arr){
        for(int i = arr.size()-1; i>= 0; i--){
            if(arr.get(i) == 3){
                arr.remove(i);
            }
        }
        return arr;
    }
}
