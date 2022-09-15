import java.util.Scanner;
 
public class test5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            String str3=str1.replace('B', 'G');
            String str=str2.replace('B', 'G');
            
            for (int j = 0; j < num; j++) {
                if(str3.charAt(j)==str.charAt(j)){
                    count ++;
                }
            }
            if(count ==num){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            count=0;
        }
    }
}

