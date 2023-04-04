package session01;

public class pra2 {
    public static void main(String[] args) {
        int a=169, b=4;
        char op='*';  //op의 기호에 따라서 값이 달라지도록

        int res1 = 0;
        double res2 = 0.0;

        switch(op){
            case '+' : res1 = a + b; break;
            case '-' : res1 = a - b; break;
            case '*' : res1 = a * b; break;
            case '/' : res2 = (double) a / b; break;
            case '%' : res1 = a % b; break;
        }

        if(op=='/'){
            System.out.println(a+" 나누기 "+b+"는 "+res2);
        }else{
            System.out.println(a+" "+op+" "+b+" = "+res1);
        }
    }
}
