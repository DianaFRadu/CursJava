package Curs6;

public class TestInheritance {
	public static void main(String[] args) {

		TesterAutomat tester = new TesterAutomat();
		
		tester.setNume("Ion");// din clasa Angajat()
		tester.setEmail("ion@ion.com");//din clasa Angajat()
		tester.setSeniority("junior");//din clasa Tester
		tester.setDepartament("QA"); //din clasa Tester
		tester.setProgramimgLang("Java");//din clasa tester automat
		
	}
}
