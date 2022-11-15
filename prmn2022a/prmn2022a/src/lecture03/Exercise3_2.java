package lecture03;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list  = new ArrayList<>();
        System.out.print("何行分入力しますか？");
        int a = input.nextInt();
        for(int i = 1;i <= a;i++){
            System.out.print(i + "行目:");
            String b = input.next();
            list.add(b);
        }
        System.out.println("入力した文字列:");
        for(String str : list){
            System.out.println(str);
        }
        }
    }
