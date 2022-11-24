package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.existsAccount("藤井智子","12345");
        a.registerAccount("藤井智子","12345");
        a.existsAccount("藤井智子","12345");
        a.deposit("12345",1000);
        a.withdraw("12345",2000);
        a.withdraw("12345",500);
    }
}
