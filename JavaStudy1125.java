package test;

import java.util.Random;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
	
	//개념있는 자바 예제

		
    //4-3 두 정숫값을 입력하면 작은 쪽의 수 이상, 큰 쪽의 수 이하의 모든 정수를 작은 수부터 순서대로 표시하는 프로그램을 작성하라.
	/*
	 * Scanner sc = new Scanner(System.in); int a; int b; do {
	 * System.out.print("정수 A:"); a = sc.nextInt(); System.out.print("정수 B:"); b =
	 * sc.nextInt(); if(a>b) { for(int i=b;i<=a;i++) { System.out.print(i+"\t"); } }
	 * if(a<b) { for(int i=a;i<=b;i++) { System.out.print(i+"\t"); } }
	 * System.out.println();
	 * 
	 * }while(a!=b); System.out.print("두 수는 동일합니다."); sc.close();
	 */
	
	//6-4 배열을 생성하고,임의의 난수로 값을 넣고 그것을 세로 방향의 막대그래프로 각 배열의 값을 별표모양으로 표시하여 나열하라. 
	Scanner sc = new Scanner(System.in); 
	Random rd = new Random();
	 
	 //0~9까지
	 
	 System.out.print("요소 수: "+"\n");
	 int b = sc.nextInt();
	 int[] arr = new int[b]; //배열의 크기를 입력한 요소 수 만큼 할당한다.
	 
	 for(int i=0;i<arr.length;i++) {
		 arr[i] = 1+ rd.nextInt(10);; //랜덤값1~10을 각 요소에 대입
	 }
	 for(int z : arr) {
		 System.out.print(z+",");
		 
		 
	 }System.out.println();
		/*
		 * for(int j=10;j>=0;j--) { for(int k=0;k<arr.length;k++) { if(arr[k]>=j) {
		 * System.out.print("*\t"); } } System.out.println();
		 * 
		 * }
		 */
	 
	 
	 
	 
	 
sc.close();

}}
