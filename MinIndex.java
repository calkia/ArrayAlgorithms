public class MinIndex {
    public static void main(String[] args) {
        int [] nums = {0,-2,5,7,9};
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i<nums.length;i++){
            if (nums[i]<min){
                min = nums[i];
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
