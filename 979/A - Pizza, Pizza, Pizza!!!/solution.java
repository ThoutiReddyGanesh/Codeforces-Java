import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long slices=n+1;
 
        if(slices==1){
            System.out.println(0);
        }
        else if(slices%2==0){
            System.out.println(slices/2);
        }
        else{
            System.out.println(slices);
        }
    }
}