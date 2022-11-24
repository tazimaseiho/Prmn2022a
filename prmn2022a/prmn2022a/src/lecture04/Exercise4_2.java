package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM a = new ATM();
        if (a.existsAccount("藤井智子", "12345")) {
            System.out.println("名前:" + a.getName("藤井智子") + "　口座番号" + a.getNumber("12345") + "は存在します。");
        }else {
            System.out.println("名前:" + a.getName("藤井智子") + "　口座番号" + a.getNumber("12345") + "は存在しません。");
        }
        a.registerAccount("藤井智子","12345");
        if (a.existsAccount("藤井智子", "12345")) {
            System.out.println("名前:" + a.getName("藤井智子") + "　口座番号" + a.getNumber("12345") + "は存在します。");
        }else {
            System.out.println("名前:" + a.getName("藤井智子") + "　口座番号" + a.getNumber("12345") + "は存在しません。");
        }
        a.deposit("12345",1000);
        a.withdraw("12345",2000);
        a.withdraw("12345",500);
    }
}
