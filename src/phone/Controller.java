package phone;

import javax.swing.JOptionPane;

public class Controller {

	public void start() {
		String option="기능선택: 0.종료 1.삼성전화기 2.노키아 3.아이폰 4.갤럭시";
			/*JOptionPane.showMessageDialog(phone.toString() );*/
		while(true){
			switch(JOptionPane.showInputDialog("기능선택: 0.종료 1.삼성전화기 2.노키아 3.아이폰 4.갤럭시")){
			case "0": return;
			case "1":
				Phone phone =new Phone();
				phone.setReceiver("수신자");
				phone.setCall("안녕");
				JOptionPane.showMessageDialog(null, phone.toString());
			break;
			case "2": break;
			case "3": break;
			case "4": break;
			
			}
		}
	}

}
