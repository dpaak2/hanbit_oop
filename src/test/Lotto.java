package test;
import java.util.Scanner;
/*
 * 로또볼 추첨
 * 1~45 까지 랜덤 숫자
 * 볼갯수는 총 6개
 * 중복 허용
 * 출력음 [5,23,23,40,19,22]
 */
public class Lotto {
	private int[]arr;
	public static void main(String[] args) {
		int lottoNum = 0, count=0;
		int ball1=0,ball2=0,ball3=0,ball4=0,ball5=0,ball6=0;
		//System.out.println(lottoNum);
		while(count<6){
			lottoNum = (int)(Math.random()*45+1);
			count++;
			switch(count){
			case 1:
				ball1=lottoNum;
				break;
			case 2:
				count= (lottoNum==ball1)?count--:count;
				break;
			case 3:
				count=(lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 4:
				count=(lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 5:
				count=(lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 6:
				count=(lottoNum==ball5||lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
				}
				}
		System.out.printf("[%d %d %d %d %d %d]",ball1,ball2,ball3,ball4,ball5,ball6);
	}
	
}