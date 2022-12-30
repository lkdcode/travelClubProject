package service;

import exception.ErrorMessage;
import user.UserServiceLogic;

import java.util.Scanner;


public class service {
    private final UserServiceLogic userSignIn = new UserServiceLogic();

    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        mainMenu();
        subMenu();
    }

    private void mainMenu() {

        while (true) {
            menuPrint();
            int userInputMenu = scanner.nextInt();

            if (userInputMenu == 1) {
                userLogin();
            } else if (userInputMenu == 2) {
                userSignIn();
            } else if (userInputMenu == 0) {
                return;
            } else {
                ErrorMessage.ERROR_MENU.getView();
            }

        }


    }

    private void subMenu() {
        System.out.println("응 서브메뉴");
        System.out.println(userSignIn.toString());
    }

    private void menuPrint() {
        System.out.println("여행 클럽에 오신 것을 환영합니다.");
        System.out.println("아래의 매뉴를 선택해주세요");
        System.out.println("-------------------------------");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("-------------------------------");
        System.out.println("0. 종료");
        System.out.println("-------------------------------");
    }

    private void userLogin() {

        System.out.println("유저 로그인 진행");
        System.out.println();


        // 아이디
        // 비밀번호
        // 매칭이 되어야 한다..........
    }

    private void userSignIn() {
        System.out.println("유저 회원가입 진행");
        // 아이디
        // 비밀번호
        userSignIn.userSignSurvice();

        // 여행지는 추후에

        System.out.println("");
    }


}
