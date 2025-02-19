
import java.util.Hashtable;
import java.util.Scanner;

public class JavaHashTable {
    public static void main(String[] args){

        Hashtable<Integer,Node> List=new Hashtable<>();

       


        Scanner scn=new Scanner(System.in);

        System.out.println("Değer Sayısı:");
        int x=scn.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Değer Girin:");
            List.put(i, new Node(scn.nextInt()));
        }




        for (int i = 0; i < x; i++) {
            System.out.println("Değer "+i+" : "+List.get(i).data);
        }

    }



}
