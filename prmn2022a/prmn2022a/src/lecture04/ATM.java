package lecture04;

import java.util.ArrayList;

public class ATM {
    ArrayList<Account> accountList = new ArrayList<>();

    public void registerAccount(String name, String number) {
        accountList.add(new Account(name, number));
        System.out.println(name + "　さんのアカウントを口座番号:" + number + "で登録しました。");
    }

    public boolean existsAccount(String name, String number) {
        int i;
        for (i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).name.equals(name) && accountList.get(i).number.equals(number)) {
                System.out.println("名前:" + name + "　口座番号" + number + "は存在します。");
                return true;
            }
        }
        System.out.println("名前:" + name + "　口座番号" + number + "は存在しません。");
        return false;
    }

    public void deposit(String number, long money) {
        int i;
        for (i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).number.equals(number)) {
                accountList.get(i).balance = accountList.get(i).balance + money;
                System.out.println("口座番号:" + number + "に" + money + "円入金しました。");
            }
        }
    }

    public long withdraw(String number, long money) {
        int i;
        for (i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).number.equals(number)) {
                if (accountList.get(i).balance < money) {
                    System.out.println("口座番号:" + number + "から" + money + "円引き出せませんでした。" + "残高:" + accountList.get(i).balance + "円です。");
                    return 0;
                }
                    accountList.get(i).balance = accountList.get(i).balance - money;
                    System.out.println("口座番号:" + number + "から" + money + "円引き出しました。" + "残高:" + accountList.get(i).balance + "円です。");
                }
            }
        return 0;
        }
    }

