import java.util.Random;

public class MergeSort {
    public static void main(String[] args){
        int[] say=new int[8];
        Random random=new Random();
        for (int i = 0; i < say.length; i++) {
            say[i]=random.nextInt(0,100);
        }
        int n=say.length;

        for (int i : say) {
            System.out.print(" "+i);
        }

        System.out.println("\n");
        Merge(say, 0, n);

        for (int i : say) {
            System.out.print(" "+i);
        }
    }

    static int[] Merge(int[] a ,int p,int q){
        if(q-p<=1) return a;
        int split= (p+q)/2;
        Merge(a, p, split);
        Merge(a, split, q);

        int[] c = new int[split-p];

        for (int ii = 0; ii < split-p; ii++) {
            c[ii]=a[ii+p];
        }
        int i=p,m1=0,m2=split;
        while(i<m2&&m2<q){
            if(c[m1]<a[m2]){
                a[i++]=c[m1++];

            }
            else{
                a[i++]=a[m2++];
            }
            while (i<m2) {
                a[i++]=c[m1++];
            }
        }

        return a;

    }
}
