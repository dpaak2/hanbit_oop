package array;
import java.util.*;
import array.ArrayServiceImpl;
import array.ArrayService;
public class ArrayController {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayServiceImpl service= new ArrayServiceImpl();
		service.add();
		String temp="";
	/*	temp=String.format("%s\n %s\n %s\n %s\n %s\n ",
				service.arrPrint()
				,service.findH()
				,service.findJ()
				,service.deleteSpring()
				,service.printAll());
		System.out.println(temp);*/
	}
}
