package edu.kh.array2.practice;

import java.util.Arrays;

import java.util.Scanner;

public class Array2Practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		
		int[][] arr = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("( %d , %d )" , i , j);
			}
			System.out.println();
		}
		
	}
	
	public void practice2(){ 
		
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf("%2d  " , arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice3(){
		
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;
				System.out.printf("%2d  " , arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice4(){
		
		// 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		// 아래의 내용처럼 처리하세요.
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				
			}
		}
	}
	
	public void practice5(){
		
		// 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		// “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		// 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		// (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
		
		System.out.print("행 크기 : ");
		int input1 = sc.nextInt();
		
		if(input1 < 0 && input1 > 10) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
		System.out.print("열 크기 : ");
		int input2 = sc.nextInt();
		
		
	}
	
	public void practice6(){
		
		// 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		// 문자형 가변 배열을 선언 및 할당하세요.
		// 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
	}
	
	public void practice7(){
		
		// 1차원 문자열 배열에 학생 이름 초기화되어 있다.
		// 3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
		// 학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
		// (첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
		
	}
	
	public void practice8(){
		
		// 위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
		// 해당 학생이 어느 자리에 앉았는지 출력하세요.
		
	}
	
	public void practice9(){
		
		// String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
		// 그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
		
	}
	
	public void practice10(){
		
		// 실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}




