package array;
import java.util.*;
public class ArrayController2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]arr= {"Java","JSP","Spring","JS","HTML"};
		int i;
		String result="";
		// 검색(1).. 첫글자가 H 로 시작하는 단어를 출력 ex) snn= '0'==H 
		for(i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);				
			if(String.valueOf(ch).equals("H")){
				result=arr[i];
				break;
			}
		}System.out.println(result);
		
		// 검색(some)...첫글자가 J로 시작하는 단어를 출력
		result="";
		for(i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);
			if(String.valueOf(ch).equals("J")){
				result+=arr[i]+" ";
			}
		}System.out.println(result);
		
		//전체출력
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//수정(JS를 javascript) 로 변경
		result="";
		for(i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i]="javascript";
				result=arr[i];
				break;
			}
		}System.out.println(result);
		
		System.out.println("수정이 끝나면 배열 arr을 프린트 하기");
		result="";
		for(i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		//삭제(Spring 을 삭제)
		for(i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
			}
			System.out.print(" "+arr[i]);
		}
		//삭제가 끝나면 배열 arr을 프린트하기
		for(i=0;i<arr.length;i++){
			
		}
		
	}

}
