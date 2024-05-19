package homework;

import java.util.Random;
import java.util.Scanner;

public class kyh20230757_mid1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //시작 안내와 사용자에게 입력을 받는 코드
        String userChoice; 
        System.out.println("가위바위보를 시작합니다.");
        System.out.println("가위, 바위, 보 중에서 선택하세요.");
        userChoice = scanner.nextLine();
        
        //컴퓨터의 랜덤 초이스를 받고 스트링으로 바꾸는 코드
        int computerChoice = (int)(Math.random() * 3);
        String computer;
        if (computerChoice == 0) 
          computer = "가위";
        else if (computerChoice == 1) 
          computer = "바위";
        else 
          computer = "보";
        System.out.println("컴퓨터: " + computer);
        //사용자와 컴퓨터의 값을 비교하고 승패를 알려주는 코드
        if (userChoice.equals(computer)) {
            System.out.println("비겼습니다!");
        } else if ((userChoice.equals("가위") && computer.equals("보")) ||
                   (userChoice.equals("바위") && computer.equals("가위")) ||
                   (userChoice.equals("보") && computer.equals("바위"))) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
        
        scanner.close();

	}

}
