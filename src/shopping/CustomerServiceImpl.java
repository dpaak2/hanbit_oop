package shopping;

public class CustomerServiceImpl implements CustomerService {//associate 관계이다.  회원탈퇴하면 죽는다. 
	Customer customer;
	Product[] cart;
	int i; //int i =0; 쓸수없다. 필드에는 초기화하지 않는다
	public CustomerServiceImpl(){
		customer=new Customer();
		cart= new Product[4];
		i=0;
	}
	public Customer getCustomer() {
		return customer;
	}
	/**
	 *  물건을 구매시 현재 금액과 차이를 보고
	 *  구매가능한지를 따진다.
	 *  만약 가진 돈이 작으면 잔액이 부족합니다 라고 한다.
	 */
	@Override
	public String buy(Product p) {
		//
		String result ="잔액 부족";
		if(customer.getMoney()>p.getPrice()){
			customer.setMoney(customer.getMoney()-p.getPrice());
			customer.setMoney(customer.getMoney());
			add(p);
			result=p.getName()+" 카트에 추가됨";}
		return result;
	}
	/**
	 *  카트에 추가시키는 로직
	 * 
	 */

	@Override
	public void add(Product p) {
		cart[i]=p;
		i++; //누적
		
	}
	/**
	 *  쇼핑을 마치고 영수증을 출력
	 * 산것들의 toString 보여주면 됨
	 * TV...300원
	 * 지금 상황에서 3갸먼 규합한 내용이 나온다. 
	 * TV.toString+phone.toString +phone.toString 카트안에 있는 것만 가지고 나온다. 
	 */
	@Override
	public String getBill() {
		String bill="";
		i=0;
		for(int k=0;k<i;k++){
			bill+=cart[k].toString()+"\n";
		}
		return bill;/*String.format("\n잔액은 %d 입니다",customer.getMoney());*/
	}

}
