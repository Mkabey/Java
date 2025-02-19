
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class JavaEx {
 public static void main(String[] args){
    Queue <Integer> a1=new LinkedList<>();
    Queue <Integer> a2=new LinkedList<>();
    Scanner scn=new Scanner(System.in);


   for (int i = 0; i < 3; i++) {
    System.out.print("sayı : ");
    
        a1.add(scn.nextInt());
        Queue <Integer> s=a1;


        while(!a1.isEmpty()){
            int c =  s.remove();
            if(s.isEmpty()){
              a2.add(c);
            }
          }
   }

   System.out.println(a2);


   

 }
}
