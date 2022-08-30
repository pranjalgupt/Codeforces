import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            String s=sc.next();
            if(s.length()<=10)
                System.out.println(s);
            else {
                int l = s.length() - 2;
                System.out.println("" + s.charAt(0) + l + s.charAt(s.length() - 1));
            }
            n--;
        }
    }
}
