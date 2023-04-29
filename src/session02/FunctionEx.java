package session02;

public class FunctionEx {
       public static int add(int num1, int num2){
           int add = num1 + num2;
           return add;
       }
       public static void main(String[] args){
           int result = add(5,11);
           System.out.println("result 값 = " + result);
           System.out.println(add(10,10));
       }
}
