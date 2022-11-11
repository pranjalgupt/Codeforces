import java.util.Scanner;
public class Two_Group{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int val = sc.nextInt();
            long vals[] = new long[val];
            long sum = 0;
            for(int i=0;i< val;i++) {
                vals[i] = sc.nextLong();
                sum = sum +vals[i];
            }
                System.out.println(Math.abs(sum));
        }
        
    }
}