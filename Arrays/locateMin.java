package Arrays;
public class locateMin {
    public static void main(String[] args) {
        int [] nums = {0,-2,5,7,9};
        System.out.println(locateMin(nums)+"");
        
        
    }
    public static int locateMin(int [] nums){
        int min = nums[0];
        int idx = 0;
        for(int i = 0; i<nums.length;i++){
            if (nums[i]<min){
                min = nums[i];
                idx = i;
        }   
        }
        return idx;
    }
}
