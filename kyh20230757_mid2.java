package homework;

import java.util.Random;
import java.util.Scanner;

public class kyh20230757_mid2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String right;
        String left;
        int cright;
        int cleft;
        String Fhchoice;
        int cchoice;
        String Fcchoice;
        System.out.println("게임을 시작합니다.");
        System.out.println("오른손은 뭘 낼겁니까?");
        right = scanner.nextLine();
        System.out.println("왼손은 뭘 낼겁니까?");
        left = scanner.nextLine();
        
        cright = (int)(Math.random()*3); 	
        cleft = (int)(Math.random()*3);
        String computerR;
        if (cright == 0) 
          computerR = "가위";
        else if (cright == 1) 
          computerR = "바위";
        else 
          computerR = "보";
        String computerL;
        if (cleft == 0) 
        	computerL = "가위";
        else if (cleft == 1) 
            computerL = "바위";
        else 
            computerL = "보";
        System.out.println("컴퓨터의 오른손은 "+ computerR+" 왼손은 "+ computerL+"이다.");
        System.out.println("오른손과 왼손중에 무엇을 낼까?");
        String Hchoice = scanner.nextLine();
        if(Hchoice.equals("오른손")) {
        	Fhchoice = right;
        } else {
        	Fhchoice = left;
        }
        cchoice = (int)(Math.random()*2);
        if(cchoice == 1) {
        	Fcchoice = computerR;
        } else {
        	Fcchoice = computerL;
        }
        System.out.println("컴퓨터는 "+Fcchoice+"를 냈다!");
        if (Fhchoice.equals(Fcchoice)) {
            System.out.println("비겼습니다!");
        } else if ((Fhchoice.equals("가위") && Fcchoice.equals("보")) ||
                   (Fhchoice.equals("바위") && Fcchoice.equals("가위")) ||
                   (Fhchoice.equals("보") && Fcchoice.equals("바위"))) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
        
        scanner.close();

	}

}
