package Arrays;
public class Criteria {
    public static void main(String[] args) {
        String [] names = {"Jack","Uri","Kiana","Kellin","Remi"};
        int sum = 0;
        for(String name: names){
            if(name.length() == 4){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
