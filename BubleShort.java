
import java.util.Random;
public class BubleShort {
    public static void main(String[] args){

        int[] say=new int[8];
        Random random=new Random();
        for (int i = 0; i < say.length; i++) {
            say[i]=random.nextInt(0,100);
        }
        int n=say.length;

        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(say[j]>say[j+1]){
                    int cur = say[j];
                    say[j]=say[j+1];
                    say[j+1]=cur;
                }
            }
           for (int j : say) {
            System.out.println(j);
        }
        System.out.println("\n////////////////////");
        }
      
  

    }
}
