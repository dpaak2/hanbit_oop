package array;
import java.util.*;
public interface ArrayService2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String[] arr={"Java","JSP","Spring","JS","HTML"};
		int i=0;
		String result="";
		//다 출력
		
		for(i=0;i<arr.length;i++){
			result=arr[i]+" ";
			System.out.print(result);
		}
		// 검색(1).. 첫글자가 H 로 시작하는 단어를 출력 ex) snn= '0'==H 
		result="";
		for(i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);
			if(String.valueOf(arr[i].charAt(0)).equals("H")){
				result=arr[i]+" ";
			}
		}System.out.println();
		// 검색(some)...첫글자가 J로 시작하는 단어를 출력
		//전체출력
		result="";
		for(i=0;i<arr.length;i++){
			result=arr[i]+" ";
			System.out.print(result);
		}
		//수정(JS를 javascript) 로 변경
		//삭제(Spring 을 삭제)
	}
}
