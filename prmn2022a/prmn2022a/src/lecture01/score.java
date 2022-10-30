package lecture01;


public class score {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        int max = score[0];
        int min = score[0];
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90) {
                System.out.println(i + "番 " + score[i] + "点 " + "秀");
            }else if (score[i] >= 80) {
                System.out.println(i + "番 " + score[i] + "点 " + "優");
            } else if (score[i] >= 70) {
                System.out.println(i + "番 " + score[i] + "点 " + "良");
            } else if (score[i] >= 60) {
                System.out.println(i + "番 " + score[i] + "点 " + "可");
            } else {
                System.out.println(i + "番 " + score[i] + "点 " + "不可");
            }
        }
        for (int i : score)
            if (i > max) {
                max = i;
            }
        for (int i : score) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : score) {
            sum = sum + i;
        }
        float average = (float)sum/score.length;
        System.out.println("最高点:" + max + "点");
        System.out.println("最低点:" + min + "点");
        System.out.println("平均点:" + average + "点");
    }
}
