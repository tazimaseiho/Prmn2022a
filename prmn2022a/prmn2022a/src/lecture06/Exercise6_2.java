package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args){
        try {
            Random random = new Random();
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list.add(random.nextInt(6) + 1);
            }
            System.out.println("さいころを5つ振りました。");
            System.out.print("何番目の値を確認しますか?");
            int index = input.nextInt();
            System.out.println(list.get(index));
        }catch (IndexOutOfBoundsException e1){
         System.out.println("ArrayListの範囲外アクセスを確認しました。");
        }catch (InputMismatchException e2){
            System.out.println("整数以外の値が入力されました。");
        }
        System.out.println("プログラムを終了します。");
    }
}