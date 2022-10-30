package lecture01;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int age = scanner.nextInt();
      if(age < 0 ){
          System.out.println("error");
      }
      else if(age < 20){
          System.out.println("I am " + age + " years old so I cannot drink liquor.");
      }
      else{
          System.out.println("I am " + age + " years old so I can drink liquor.");
      }
    }
}
