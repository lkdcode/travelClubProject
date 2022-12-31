package service;

import exception.ErrorMessage;
import user.MemberRepository;
import user.MemberStore;
import user.UserSignIn;
import user.UserSignInLogic;

import java.util.Scanner;


public class MainService {
    private final UserSignIn userSignIn;
    private final MemberStore memberStore;
    private final Scanner scanner;

    public MainService() {
        this.userSignIn = new UserSignInLogic();
        this.memberStore = new MemberRepository();
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        mainMenu();
        userMenuPrint();
    }

    private void mainMenu() {

        while (true) {
            mainMenuPrint();
            int userInputMenu = scanner.nextInt();

            if (userInputMenu == 1) {
                // 로그인 구현
            } else if (userInputMenu == 2) {
                userSignIn.signIn(memberStore);
            } else if (userInputMenu == 0) {
                return;
            } else {
                ErrorMessage.ERROR_MAIN_MENU.getView();
            }

        }


    }

    private void userMenuPrint() {
        System.out.println("서브메뉴");
        System.out.println("아래의 매뉴를 선택해주세요");
        System.out.println("-------------------------------");
        System.out.println("1. 여행지 등록하기");
        System.out.println("2. 회원가입");
        System.out.println("-------------------------------");
        System.out.println("0. 종료");
        System.out.println("-------------------------------");
    }


    private void mainMenuPrint() {
        System.out.println("여행 클럽에 오신 것을 환영합니다.");
        System.out.println("아래의 매뉴를 선택해주세요");
        System.out.println("-------------------------------");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("-------------------------------");
        System.out.println("0. 종료");
        System.out.println("-------------------------------");
    }


}
