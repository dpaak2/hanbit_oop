package hashSet;
import java.util.*;
public class HashSetController2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String result="";
		String arr[] ={"Java","JSP","Spring","JS","HTML"};
		//1.추가..위에 주어진 배열 arr을 set에 추가하기
		Set<String> set= new HashSet<String>(); //다양성을 구현하는것이다.
		for(String i:arr){
			set.add(i);
		}
		//2. 검색(1).. 첫글자가 H 로 시작하는 단어를 출력 ex) snn= '0'==H 
		for(int i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);				
			if(String.valueOf(ch).equals("H")){
				result=arr[i];
				break;
			}
		}System.out.println(result);
		
		// 검색(some)...첫글자가 J로 시작하는 단어를 출력
		result="";
		for(int i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);
			if(String.valueOf(ch).equals("J")){
				result+=arr[i]+" ";
			}
		}System.out.println(result);
		
		//전체출력
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//수정(JS를 javascript) 로 변경
		result="";
		for(int i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i]="javascript";
				result=arr[i];
				break;
			}
		}System.out.println(result);
		
		System.out.println("수정이 끝나면 배열 arr을 프린트 하기");
		result="";
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
		//삭제(Spring 을 삭제)
		for(int i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
			}
		}
		//삭제가 끝나면 배열 arr을 프린트하기
		result="";
		for(int i=0;i<arr.length-1;i++){
			result+=arr[i]+" ";
		}System.out.println(" "+result);
	}

}
