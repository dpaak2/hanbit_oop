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
				phone.setReceiver(JOptionPane.showInputDialog("수신자를 입력하여 주세요."));
				phone.setCall(JOptionPane.showInputDialog("전할 메세지를 입력하여 주세요"));
				JOptionPane.showMessageDialog(null, phone.toString());
			break;
			case "2": 
				Nokia nokia =new Nokia();
				nokia.setReceiver(JOptionPane.showInputDialog("수신자를 입력하여 주세요."));
				nokia.setCall(JOptionPane.showInputDialog("전할 메세지를 입력하여 주세요"));
				nokia.setPortable(true);
			    JOptionPane.showMessageDialog(null, nokia.toString());
				break;
			case "3": 
				Iphone iphone= new Iphone();
				iphone.setPortable(true);
				iphone.setReceiver(JOptionPane.showInputDialog("어디에서 검색 하시겠습니까?"));
				iphone.setDate(JOptionPane.showInputDialog("검색어를 입력하여 주세요."));
				JOptionPane.showMessageDialog(null, iphone.toString());
				break;
			case "4": 
				GalaxyNote g=new GalaxyNote();
				g.setPortable(true);
				g.setSize(JOptionPane.showInputDialog("화면크기를 지정하여 주세요"));
				g.setDate(JOptionPane.showInputDialog("검색어를 입력하여 주세요."));
				JOptionPane.showMessageDialog(null, g.toString());
				break;
			
			}
		}
	}

}
