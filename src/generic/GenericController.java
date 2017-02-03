package generic;

public class GenericController {
	public static void main(String[] args) {
/*		GenericService service = new GenericServiceImpl();
		service.add("apple,banan,melon");*/
		GenericService service = new GenericServiceImpl<String>();
		System.out.println(service.print("Hello Generic!!"));
		/*
		 * System.out.println(service.print()); // RETRUN TYPE이 없어서 ERROR가 났음
		 */
		
	}
}
