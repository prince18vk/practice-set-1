//import java.util.Scanner;
public class Java1 {
    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
        int x=123;
        int y=0;

        while (x>0){
            int count=x%10;
            y=y*10+count;
            x=x/10;

        }
        System.out.println(y);


    }
}
