package bank;

import java.util.Calendar;

import util.RandomGenerator;

public class Account {
	public final static String BANK_NAME = "한빛뱅크";
	private int money, accountNo;
	private String uid, accountType, createdDate;
	private int createAccountNo;

	public Account(String uid,String accountType,int money) {//6자리 랜덤숫자
		this.accountNo=RandomGenerator.getRandomNum(100000, 999999);
		this.createdDate=today();
		this.uid=uid;
		this.accountType=accountType;
		this.money=money;
	} //통장 생성할때 기본적으로 가져라
	//this.accountNo=0;//math.random ..... 100000`99999	
	public int getAccountNo(){
		return accountNo;
	}
	public int getMoney(){
		return money;
	}
	public void setUid(String uid){
		this.uid=uid;
	}
	public String getUid(){
		return uid;
	}

	public String getAccountType(){
		return accountType;
	}
	public void deposit(int money){
		//입금 로직
		
	}
	public void withdraw(int money){
		//출금 로직
	}
	public String today(){
		/*//로직
		String today="";
		StringBuffer sb= new StringBuffer();*/
		Calendar now =Calendar.getInstance(); //기본적으로 사용하는것 공용으로 사용하는것 그래서 new로 생성자 만드는게 아니라 now로 만들어짐 static에서 만들어짐
		return Calendar.getInstance().get(Calendar.YEAR)+"년"
				+Calendar.getInstance().get(Calendar.MONTH)+"월"
				+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일"; //이렇게 줄일수 있다.
	/*	
		int yy= now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1;
		int dd = now.get(Calendar.DAY_OF_MONTH);*/
				
/*		sb.append(yy);
		sb.append("년");
		sb.append(mm);
		sb.append("월");
		sb.append(dd);
		sb.append("일");
		
		today=sb.toString();
		return yy+"년"+mm+"월"+dd+"일";*/
	}
/*	public int createAccountNo(){
		int accountNum=0;
		//로직짜고
		//Math.random...100000-99999
		this.createAccountNo = accountNum;
		accountNum=(int)((Math.random()*999999)+1000000);
		return accountNum;
	}*/
	}
