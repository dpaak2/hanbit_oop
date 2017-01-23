package bank;
import java.util.Scanner;

import javax.swing.*;

import test.Member;
public class Controller {
	public void start(){
	Scanner s=new Scanner(System.in);
		Member member=null;
		Account account=null;
		String ssn="";
		String uid="";
		while(true){
			/*int flag=(s.nextInt())*/
			switch(JOptionPane.showInputDialog("0.종료,1.회원등록,2.통장개설,3.입금,4.출금,5.조회,6.해지")){
			case "0": return;
			case "1":
				member =new Member();	
				while(true){ 	
					ssn=JOptionPane.showInputDialog("주민번호: ");
					char ch = ssn.charAt(7);
					if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
						/*System.out.println("다시 입력하세요");*/
						JOptionPane.showMessageDialog(null, "다시 입력하세요");
					}else{
						break;
					}
				}
				member.setSsn(ssn);
				member.setUid(JOptionPane.showInputDialog("아이디:"));
				member.setName(JOptionPane.showInputDialog("이름:"));			
				/*System.out.println(member.getName()+"("+member.calcGender(gender)+")");*/
				JOptionPane.showMessageDialog(null, member.getName()+"님 회원 등록되었습니다.");
				
				break;
			case "2":
				
				while(true){
					uid=JOptionPane.showInputDialog("아이디: ");
								
					if(member.getUid().equals(uid)){
						break;
					}
				}
				int accountNo=0;//6자리 랜덤숫자
				String date ="";//오늘 날짜
				String name="";
				int money=0;
				String accountType="저축예금";
				account=new Account(uid,accountType,money);
				StringBuffer sb =new StringBuffer();
				sb.append("["+Account.BANK_NAME+"]\n");  //class variable
				sb.append("계좌번호: "+account.getAccountNo()+"\n");
				sb.append("예금종류: "+account.getAccountType());
				sb.append(member.getName()+" 님 \n");
				sb.append("가입일: "+account.today()+"\n");
				sb.append("잔액: "+account.getMoney());   // instance variable
				System.out.println(sb.toString());

				/*[한빛뱅크] 123456 
				 * 예금종류:저축예금 송상훈님 
				 * 가입일:2016년12월14일
				 * 잔액:￦0 */				
				break;
			case "3":break;
			case "4":break;
			case "5":break;
			case "6":break;
			}
		}
	}
}
