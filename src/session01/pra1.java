package session01;

public class pra1 {
    public static void main(String[] args) {
    int kor = 92;
    int eng = 80;
    int math = 96;

    //3으로 나누는 것과 3.0으로 나누는 것과 자료형 타입이 달라진다.
    double avg = (kor + eng + math)/3.0;
    double avg2 = (kor + eng + math)/3;

    System.out.println("평균점수(실수형) = " + avg);      // 출력 값 89.33333333
    System.out.println("평균점수(정수형) = " + (int)avg); // 출력 값 89
    System.out.println(avg2); // 출력 값 89.0

}

}
