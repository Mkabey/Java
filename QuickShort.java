
import java.util.Random;

public class QuickShort {
    public static void main(String[] args) {
          int[] say=new int[8];
        Random random=new Random();
        for (int i = 0; i < say.length; i++) {
            say[i]=random.nextInt(0,100);
        }
        for (int i : say) {
            System.out.print(i+"\t");
        }

        System.out.print("\n");
        quickShort(say, 0, say.length-1);

        for (int i : say) {
            System.out.print(i+"\t");
        }
    }
    static int par(int[] arr,int p,int q){

        int pivot=arr[q] , i=p-1;

        for (int j = p; j < q; j++) {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp2=arr[i];
        arr[i]=arr[q];
        arr[q]=temp2;
        return i;
    }

    private static void quickShort(int[] say, int p, int q) {
        if(p>=q) return;

        int pivot = par(say, p, q);
        quickShort(say, p, pivot-1);
        quickShort(say, pivot+1, q);
    }
}
