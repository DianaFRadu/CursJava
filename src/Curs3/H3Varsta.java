package Curs3;

public class H3Varsta {

	public void verificaH3Varsta(int ani) {
	
		if(ani<18) {
			
			System.out.println("Esti minor");	
		} else if(ani<=65) {
			
			System.out.println("Esti adult");
		} else {
			System.out.println("Esti batran");
			
		}
	}
}
