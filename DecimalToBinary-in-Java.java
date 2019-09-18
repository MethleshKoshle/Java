import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in decimal: ");
        int n = input.nextInt();
        int count = 0, tmp=n;
        while(tmp!=0){
            tmp /= 2;
            count++;
        }
        if(count == 0)
            count = 1;
        System.out.println("Number of bits: " + count);
        int[] bin = new int[count];
        bin[0] = 0;
        for(int i=0; i<count; i++){
            bin[i] = n%2;
            n /= 2;
        }
        for(int i=count-1; i>-1; i--)
            System.out.print(bin[i]);
        System.out.println("");
    }
}
