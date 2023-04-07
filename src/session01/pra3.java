package session01;

public class pra3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1~100까지의 합 : " + sum);
    }
}
/**
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.printf("1~%d까지의 합 : %d", i - 1, sum);
    }
 **/