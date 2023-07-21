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
		
	}
	
	public void practice7(){
		
	}
	
	public void practice8(){
		
	}
	
	public void practice9(){
		
	}
	
	public void practice10(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}




