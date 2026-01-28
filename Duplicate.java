public class Duplicate {
    public static void main(String[] args) {
        String [] classes = {"world history","gym","precalc","ela","band","cs","chem","chem","french"};
        System.out.println(containsDuplicate(classes));

        
    }

    public static boolean containsDuplicate(String[] arr){
        int index = 0;
        int check = 0;
        while(index < arr.length){
            check = 0;
            while(check<arr.length){
                if(arr[index].equals(arr[check]) && index!= check){
                    return true;
                }
                check++;
            }
            index++;
        }
        return false;
    }
}
