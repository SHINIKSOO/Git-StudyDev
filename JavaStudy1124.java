package test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
	
	//개념있는 자바 예제
    //Q 2-3
	/*
	 * Scanner stdIn = new Scanner(System.in); System.out.print("정숫값 : "); int a =
	 * stdIn.nextInt();
	 * 
	 * System.out.print(a+"이라고 입력했습니다."); stdIn.close();
	 */
		
	//Q 3-1 세 정숫값 입력하면 오름차순 정렬하라
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		System.out.print("첫째 정수(a): ");
		int a = sc.nextInt();
		System.out.print("첫째 정수(b): ");
		int b = sc.nextInt();
		System.out.print("첫째 정수(c): ");
		int c = sc.nextInt();
		
		
		if(a<b) { 
			int t=a;
			a = b;
			b = t;
		}
		if(a<c) {
			int t = a;
			a = c;
			c = t;
		}
		if(b<c){
			int t = b;
			b = c;
			c = t;
		}
		if(a==b||a==c||b==c) {
			System.out.println("동일한 값이 입력되어 있습니다.");
			continue;
		}
		
		System.out.println("내림차순으로 정렬하면"+a+","+b+","+c);
		flag=false;
	}
		sc.close();
	}
	

}
