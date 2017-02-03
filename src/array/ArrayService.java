package array;
import java.util.*;
public interface ArrayService {
	public void add();
	//다 출력
	public void printAll();
	// 검색(1).. 첫글자가 H 로 시작하는 단어를 출력 ex) snn= '0'==H 
	public void findH();
	// 검색(some)...첫글자가 J로 시작하는 단어를 출력
	public void findJ();
	//수정(JS를 javascript) 로 변경
	public void chang();
	//삭제(Spring 을 삭제)
	public void deleteSpring();
	//삭제가 끝나면 배열 arr을 프린트하기
	public void arrPrint();
}
