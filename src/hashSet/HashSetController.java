package hashSet;
//utility = 다용도를 위한 것들 main은 아닌것들
import java.util.*;

public class HashSetController {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String arr[] ={"Java","JSP","Spring","JS","HTML"};
		HashSet<String> set= new HashSet<String>();
		for(String i:arr){
			set.add(i); //"Java","JSP","Spring","JS" 중복이 제거됨
		}
		System.out.println("ARRAY");
		for(int i=0;i<arr.length;i++){
			System.out.printf("%s ",arr[i]);
		}
		System.out.println();
		System.out.println("SET: "+set.toString());
		System.out.println("삭제하고 싶은 값을 입력하세요");
		String del=s.next();
		String result ="";
		int i=0;
		for(i=0;i<arr.length;i++){
			if(del.equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
				result=del+"삭제되었습니다.";
				break;
			}else{
				result="없는 값입니다.";
			}
		} System.out.println(result);
		result="";
		for(i=0;i<arr.length-1;i++){
			result+=arr[i]+" ";
		}System.out.print(result);
	}			
}
