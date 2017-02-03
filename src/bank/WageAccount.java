package bank;

import javax.swing.JOptionPane;

import util.RandomGenerator;

public class WageAccount extends Account{
	
	public WageAccount(int money) {//6자리 랜덤숫자
		accountNo=RandomGenerator.getRandomNum(100000, 999999);
		createdDate=today();
	    super.uid=uid;
		super.accountType=accountType;
		this.money=money;
	} //통장 생성할때 기본적으로 

	@Override
	public String deposit(int money) {

		String result="";
		if(money>0){
			this.money+=money;
			result=Account.DEPOSIT_SUCCESS;
			}
		else{
			result=Account.DEPOSIT_FIAL;
			}
		
		
		return result;
	}

	@Override
	public String withdraw(int money) {
		//출금 로직
		String result="";
		if(checkMoney(this.money-money)){
			this.money-=money;
			result=Account.WITHDRAW_SUCCESS;
		}else{
			result=Account.WITHDRAW_FAIL;
		}
		return result;
		
	}

	@Override
	public boolean checkMoney(int money) {			
		return money>=0;
	}



}
