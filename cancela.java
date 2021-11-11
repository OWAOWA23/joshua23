import java.util.Scanner;

public class cancela 
{
    public static void main(String args[]) throws Exception 
    {
        Scanner key = new Scanner(System.in);
    
        System.out.print("Enter number: ");
        int num1 = Integer.parseInt(key.nextLine());
        
        while (num1-- > 0) {
            String[] tokens = key.nextLine().split(" ");
            int num = Integer.parseInt(tokens[1]);
            System.out.print(tokens[0] + " " + (num * (num + 1) / 2 + num) + "\n");
        }

       
    }
}
