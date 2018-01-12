package forjavastart;
/*this class shows the work of the continue and break statements in a loop;*/
public class ForJavaStart {

    public static void main(String[] args) {
        int n = 10; // variable declaration;
        for (int i = 0; i <= n; i++) {
            if (i == 3) {
                continue; // passes the iteration under the condition i = 3;
            } else {
                if (i == 7) {
                    break;// completely stops the cycle on i = 7;
                }
                System.out.println(i); // output of variable i;
            }
        }

    }
}
