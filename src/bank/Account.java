package bank;

import java.util.Calendar;

import javax.swing.JOptionPane;

import util.RandomGenerator;

public abstract class Account {
	public final static String BANK_NAME = "한빛뱅크";
	public final static String ACCOUNT_TYPE = "통장 베이스";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FIAL="입금 실패";
	protected int money, accountNo;
	protected String uid, accountType, createdDate;
	protected int createAccountNo;
	public Account(){}   //over loading 

	public Account(String uid, String accountType, int money) {// 6자리 랜덤숫자
		this.accountNo = RandomGenerator.getRandomNum(100000, 999999);
		this.createdDate = today();
		this.uid = uid;
		this.accountType = accountType;
		this.money = money;
	} // 통장 생성할때 기본적으로 가져라
		// this.accountNo=0;//math.random ..... 100000`99999 // over loading 

	public int getAccountNo() {
		return accountNo;
	}

	public int getMoney() {
		return money;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	public String getAccountType() {
		return accountType;
	}
    public abstract boolean checkMoney(int money);
	public abstract String deposit(int money);
	public abstract String withdraw(int money);


	public String today() {
		/*
		 * //로직 String today=""; StringBuffer sb= new StringBuffer();
		 */
		Calendar now = Calendar.getInstance(); // 기본적으로 사용하는것 공용으로 사용하는것 그래서
												// new로 생성자 만드는게 아니라 now로 만들어짐
												// static에서 만들어짐
		return Calendar.getInstance().get(Calendar.YEAR) + "년" + Calendar.getInstance().get(Calendar.MONTH) + "월"
				+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "일"; // 이렇게
																			// 줄일수
																			// 있다.

	}
}
