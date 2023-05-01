package session02;

public class MethodEx {
    int a, b;
    int add() {
        return a + b;
    }
    static int add(int a, int b) {
        return a + b;
    }
}
class MethodExTest {
    public static void main(String[] args) {
        System.out.println(MethodEx.add(10, 20));
        MethodEx test = new MethodEx();
        test.a = 30;
        test.b = 40;
        System.out.println(test.add());
    }
}
/*
    int sum(int num1, int num2) {  // num1, num2 는 매개변수
        int add = num1 + num2;
        return add;
    }

    public static void main(String[] args) {
        MethodEx sample = new MethodEx();
        int c = sample.sum(3, 4);  // 3, 4는 인수

        System.out.println(c);
    }
    public void voidMethod(){
        // 구현
    }
    public int intMethod(){
        // 구현
        return 10;
    }
    public String stringMethod(){
        return "String";
    }
*/