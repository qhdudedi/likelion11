package techit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {
    public static void main(String[] args){
        System.out.println("================");
        System.out.println("회원 등록");
        System.out.println("================");

        boolean register = false;
        Scanner sc = new Scanner(System.in); //import 할 때 ctrl+space 누르면 필요한 import 생성 가능

        while(!register) {
            System.out.println("회원가입을 하시겠습니까?\n Y:진행 , N:취소");
            System.out.print(">> ");
            String register_input = sc.nextLine(); // 입력 후 enter 입력 시 다음 진행으로 넘어감

            if (register_input.equalsIgnoreCase("y")) {//대소문자 구분을 안하기 위한 equalsIgnoreCase() 사용
                register = true;
                System.out.println("================");
                System.out.println("회원가입 진행");
                System.out.println("================");
            } else if(register_input.equalsIgnoreCase("n")) {
                System.out.println("================");
                System.out.println("회원가입 종료");
                System.out.println("================");
                System.exit(0); // 종료코드 0 작성
            } else{
                System.out.println("입력 값을 확인해주세요.");
            }
        }
        ArrayList users = new ArrayList();

        while (true){
            HashMap user = new HashMap();
            //ID
            System.out.print("ID: ");
            String username = sc.nextLine(); //console 입력 값 받음

            //PW - 난이도 up(입력이 2번)
            String password  = "";
            while(true){
                System.out.print("PW: ");
                password = sc.nextLine();
                System.out.print("PW 확인: ");
                String password_confirm = sc.nextLine();

                if(password.equals(password_confirm)) {
                    break;              // 값이 같을 경우 while문 탈출
                }else{
                    System.out.println("================");
                    System.out.println("패스워드 불일치, 다시 입력");
                    System.out.println("================");
                }
            }
            //이름
            System.out.print("성명: ");
            String name = sc.nextLine();
            //생년월일(6자리)
            String birth_date = "";
            while(true){
                System.out.print("생년월일(6자리): ");
                birth_date = sc.nextLine();
                if(birth_date.length() == 6){
                    break;
                }else {
                    System.out.println("================");
                    System.out.println("생년월일 자릿수 확인 필요");
                    System.out.println("================");
                }
            }
            //이메일
            System.out.print("이메일: ");
            String email  = sc.nextLine();

            //HashMap에 키-값 쌍을 넣는 과정
            user.put("username", username);
            user.put("password", password);
            user.put("name", name);
            user.put("birth_date", birth_date);
            user.put("email", email);

            users.add(user); //users Array에 user HashpMap add !
            System.out.println("================");
            System.out.println(user.get("name")+ "Welcome");
            System.out.println("================");

            System.out.println("회원가입을 이어서 진행하시겠습니까?\n Y:진행 , N:취소");
            System.out.print(">> ");
            String register_again = sc.nextLine();

            if(register_again.equalsIgnoreCase("y")){
                ;
            }else if (register_again.equalsIgnoreCase("n")){
                System.exit(0); // 정상 종료 코드 0
            }

        }
    }
}
