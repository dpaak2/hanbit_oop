package hospital;

import java.util.Scanner;
import javax.swing.*;

public class Controller {
	public final static String EXE_OPTION = "0.EXIT" + "1.REG-DOCTOR\n" + "2.REG-NURSE\n" + "3.REG-PATIENT\n"
			+ "4.CHECK BMI\n";

	public final static String DOC_SPEC = "의사ID,담당 진료과목,성명,주민번호,전화번호,이메일,직급";
	public final static String NUR_SPEC = "간호사ID,담당 진료과목,성명,주민번호,전화번호,이메일,직급";
	public final static String PAT_SPEC = "환자ID,간호사ID,의사ID,환자 성명,주민번호,전화번호,주소,이메일,직업";
	public final static String BMI_SPEC = "";
	String ssn;

	public void start() {
		Scanner s = new Scanner(System.in);
		String ssn = "";
		BMI bmi = null;
		Member member =null;
		Doctors doc = null;
		Nurses nur = null;
		Patient pat = null;
		String uid = "";
		

		while (true) {
			switch (JOptionPane.showInputDialog( EXE_OPTION)) {
			case "0":
				return;
			case "1":/* 의사 */
				doc = new Doctors();
				String docInfo = JOptionPane.showInputDialog(DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid(Integer.parseInt(docInfoArr[0]));
				doc.setMajorTreat(docInfoArr[1]);
				doc.setName(docInfoArr[2]);
				doc.setSsn(docInfoArr[3]);
				doc.setPhone(docInfoArr[4]);
				doc.setEmail(docInfoArr[5]);
				doc.setDocPosition(docInfoArr[6]);
				JOptionPane.showMessageDialog(null,doc.toString());
				break;
			case "2":
				nur = new Nurses();
				String nurInfo =JOptionPane.showInputDialog(NUR_SPEC);
				String[] nurInfoArr= nurInfo.split(",");
				nur.setUid(Integer.parseInt(nurInfoArr[0]));
				nur.setMajorJob(nurInfoArr[1]);
				nur.setName(nurInfoArr[2]);
			    nur.setSsn(nurInfoArr[3]);
			    nur.setEmail(nurInfoArr[4]);
				nur.setPhone(nurInfoArr[5]);
				nur.setNurPosition(nurInfoArr[6]);
				JOptionPane.showMessageDialog(null,nur.toString());
				break;
			case "3":
				pat = new Patient();
				nur= new Nurses();
				doc =new Doctors();
				String patInfo =JOptionPane.showInputDialog(PAT_SPEC);
				String[] patInfoArr= patInfo.split(",");
				pat.setUid(Integer.parseInt(patInfoArr[0]));
				nur.setUid(Integer.parseInt(patInfoArr[1]));
				doc.setUid(Integer.parseInt(patInfoArr[2]));
				pat.setName(patInfoArr[3]);
			    pat.setSsn(patInfoArr[4]);
			    pat.setPhone(patInfoArr[5]);
				pat.setAddr(patInfoArr[6]);
				pat.setEmail(patInfoArr[7]);
				pat.setPatJob(patInfoArr[8]);
				JOptionPane.showMessageDialog(null, pat.toString());
				break;
			case "4":
				bmi= new BMI();				
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")) / 100);
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게")));
				JOptionPane.showMessageDialog(null,bmi.treat());
							
				break;


			}

		}

	}

}
