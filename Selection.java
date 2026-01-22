public class Selection {
    public static void main(String[] args) {
        String [] classes = {"world history","gym","precalc","ela","band","cs","chem","chem","french"};

        for (int i = 1; i < classes.length; i++){//start at 1 and do i-1 
            System.out.println(classes[i-1]+" "+classes[i]);
        }

    }
}
