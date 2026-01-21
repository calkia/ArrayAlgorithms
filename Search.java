public class Search {
    public static void main(String[] args) {
        String [] names = {"Jack","Uri","Kiana","Kellin","Remi"};
        for(String name: names){
            if(name.substring(0,1).equalsIgnoreCase("k")){
                System.out.println(name);
            }
        }
    }
}
