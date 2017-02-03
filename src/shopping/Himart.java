package shopping;

import javax.swing.JOptionPane;

public class Himart {
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();//다양성 ,이 기능으로는 구조를 잡지 않는다, overloading 
		Product p=null;
		String status="";
		StringBuffer sb=new StringBuffer();
		while(true){
			switch (JOptionPane.showInputDialog("뭐 샀니? 0.종료 1.TV 2.폰 3.청소기 4.PC")) {
			case "0":
				JOptionPane.showMessageDialog(null,"구매목록\n"+service.getBill());
				return;
			case "1":
			
				Product tv = new TV();
				sb.append(tv.toString()+"\n");
				JOptionPane.showMessageDialog(null,service.buy(tv));
				
				break;
			case "2":
				Product phone =new SmartPhone();
				sb.append(phone.toString()+"\n");
				JOptionPane.showMessageDialog(null,service.buy(phone));
			
				break;
			case "3":
				Product cleaner=new Cleaner();
				sb.append(cleaner.toString()+"\n");
				JOptionPane.showMessageDialog(null,service.buy(cleaner));
			
				break;
			case "4":
				Product pc=new Computer();
				sb.append(pc.toString()+"\n");
				JOptionPane.showMessageDialog(null,service.buy(pc));
				break;
			}
		}
	}
}
