import java.util.Scanner;
import java.lang.Math;
public class NGG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = (int) (Math.random() * 100); // 0 ~ 100 사이의 난수
		int life = 6;
		
		System.out.println(num);
		System.out.println("숫자 추측 게임");
		System.out.println("0 ~ 100 사이의 숫자 맞추기\n기회는 6번");
		
		do {
			life -= 1; // 6번의 기회에서 1회 씩 차감
			int g_num = scanner.nextInt(); // 추측값 받기
			if(g_num == num) {
				System.out.println("정답입니다!!");
				break;
			}
			else {
				if (g_num > num) System.out.println(g_num + "가 정답보다 큽니다. 더 작은 수를 말하세요.");
				else System.out.println(g_num + "가 정답보다 작습니다. 더 큰 수를 말하세요.");
				}
			System.out.printf("남은 기회: %d번", life); // 남은 기회를 알려줌
		}while(life > 0); // 기회가 남았으면 body 실행
		
		if(life == 0) // 기회가 0일 때(게임에서 패비시) 실행
			System.out.println("남은 기회가 없습니다. 정답은 " + num + "이었습니다.");
		
		System.out.println("게임 종료");
		scanner.close();
	}

}
