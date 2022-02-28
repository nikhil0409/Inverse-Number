import java.util.Scanner;

public class inverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;int s, x=0;
        while(n!=0){
            int d = n%10;
            p++;
            s = p*(int)Math.pow(10, d-1);
            x = x + s;
            n = n/10;
        }System.out.println(x);
    }
}
