package Test03;

import java.util.Scanner;

public class EuclideanAlgorithm {

    /**
     * @since 2023-05-09
     * @author Zundal
     * @description 최대공약수 최대공배수 유클리드 호제법
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = (a < b) ? a : b;
		int gcd = 0;
		for (int i = 1; i <= min; i++) { 
			if (a % i == 0 && b % i == 0) { // 공통으로 나누어 떨어지는 수 이니까
                gcd = i;
            }
		}

		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + a * b / gcd);

    }    
}
