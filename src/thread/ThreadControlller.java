package thread;
import java.lang.Thread;
import java.lang.Object;
import java.lang.String;

public class ThreadControlller {
	public static void main(String[] args) {
		ATM atm=new ATM(); // 객체생성 atm에 담아줄것이다 
		Runnable hong=new User("홍길동",atm); //다양성을 하기 위해서 runnable로 씀 Runnable에도 있는것까지 쓸수 있음
		Runnable kim=new User("김유신",atm); //3개의 인스턴스가 공유한다.
		Runnable lee=new User("이순신",atm);
		Thread thr1=new Thread(hong);//decorate pattern 쓰기때문에 parmeter에 instance가 있어야 한다
		thr1.start();
		Thread thr2=new Thread(kim);
		thr2.start();
		Thread thr3=new Thread(lee); 
		thr3.start();
	}
}
class ATM{ //접근 제한자를default로 주면 된다. 앞에 public을 쓰면 안됨
	public synchronized void inchul(String name){ //synch를 생각하면됨 
		System.out.println(name+"님이 인출을 요청");
		for(int i=0;i<=5;i++){
			if(i==5){
				System.out.println(name+"님이 인출중 입니다");
			}
		}
		System.out.println(name+"님이 인출해 나감");
	}
}
class User implements Runnable{

		private String name;
		//이사용자는 ATM의 사용자에 국한되어 사용된다
		private ATM atm;
		public User(String name,ATM atm){
			super();
			this.atm=atm; //부모자식 관계 
			this.name=name;
		}
		@Override
		public void run() {
			atm.inchul(name);
		}
	
}
