package session;
import java.util.*;

public class pra4 {
    public static void main(String[] args) {
        String[] name ={"james","Cathy", "Kenny","Martin","Crystal"};
        int[] height = new int[name.length];
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]+"의 신장 입력 :");
            height[i] = scanner.nextInt();
            total += height[i];
        }
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]+"의 키는 "+height[i]+"입니다.");
        }
        System.out.println("신장의 합계 :"+total);
        System.out.println("평균 신장 :" +(total/name.length));
    }
}

