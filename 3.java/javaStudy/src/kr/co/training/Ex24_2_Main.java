package kr.co.training;

import java.util.Scanner;

public class Ex24_2_Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex24_2_Login lg = new Ex24_2_Login();
		
		System.out.println("===회원가입===");
		System.out.print("아이디를 설정하세요:");
		lg.setMemberId(sc.nextLine());
		System.out.print("비밀번호를 설정하세요:");
		lg.setMemberPwd(sc.nextInt());
		sc.nextLine();
		
		while(true) {
		System.out.println("===로그인===");
		System.out.print("아이디를 입력하세요:");
		String inputID = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요:");
		Integer inputPW = sc.nextInt();
		sc.nextLine();

		
		if(lg.getMemberId().equals(inputID) && 
				lg.getMemberPwd().equals(inputPW)) {
			System.out.println("-------------");
			System.out.println("로그인 되었습니다.");
			System.out.println("-------------");
			return;
		} else if (!lg.getMemberId().equals(inputID)) {
			System.out.println("-------------");
			System.out.println("❌아이디가 다릅니다.");
			System.out.println("-------------");
			continue;
		}else if(!lg.getMemberPwd().equals(inputPW)) {
			System.out.println("-------------");
			System.out.println("❌비밀번호가 다릅니다.");
			System.out.println("-------------");
			continue;
		}
		}
		
		
		
		
	}

}
