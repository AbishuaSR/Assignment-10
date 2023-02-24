package week4.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
	
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();
	}

	

}
