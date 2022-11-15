package lecture03;

import java.util.Scanner;
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("１つ目の整数を入力してください:");
        String a = input.next();
        System.out.print("2つ目の整数を入力してください:");
        String b = input.next();

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);

        System.out.print(a + "+" + b + "=" + (c+d));
    }
}
