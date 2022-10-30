package lecture01;

public class array {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            array[i] = i + 1;
        }
        for (int i : array) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
