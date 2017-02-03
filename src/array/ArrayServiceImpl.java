package array;
import java.util.Scanner;

import array.ArrayService;
public class ArrayServiceImpl implements ArrayService{
	String [] arr;
	private int i=0;
	private String result="";
	
	public ArrayServiceImpl(){
		arr=new String[5];
	}
	@Override
	public void add() {
		arr[0]="Java";
		arr[1]="JSP";
		arr[2]="Spring";
		arr[3]="JS";
		arr[4]="HTML";
	}

	@Override
	public void printAll(){
		result="";
		for(i=0;i<arr.length;i++){
			result+=arr[i]+" ";
		}
	}

	@Override
	public void findH() {
		String result="";
		for(i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);				
			if(String.valueOf(ch).equals("H")){
				result=arr[i];
				break;
			}
		}System.out.println(result);
		
	}

	@Override
	public void findJ() {
		String result="";
		for(i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);
			if(String.valueOf(arr[i]).equals("J")){
				result= arr[i]+" ";
			}
		}
	}

	@Override
	//수정(JS를 javascript) 로 변경
	public void chang() {
		String result="";
		for(i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i]="JavaScript";
				result=arr[i]+" ";
				break;
			}
		}
	}

	@Override
	public void deleteSpring() {
		for(i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
			}
		}
		
	}

	@Override
	public void arrPrint() {
		String result="";
		for(i=0;i<arr.length;i++){
			result+=arr[i]+" ";
		}
		
	}

	
}
