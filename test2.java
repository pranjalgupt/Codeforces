import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=2 ||a % 2 == 0){
            System.out.println("Yes");
        }
        else{
        System.out.print("No"); 
        }
    }    
}
