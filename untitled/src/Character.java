import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character:");
        String a = scanner.nextLine();
        String str = a ;
        char[] ch = str.toCharArray();
        for(char c : ch){
            int temp = (int)c;
            int temp_integer = 64;
            if(temp<=90 & temp>=65) {
                final int i = temp - temp_integer;
                System.out.println(a + " has an index of " + i);
            }
        }
    } }