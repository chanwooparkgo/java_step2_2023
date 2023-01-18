package chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		
		ThreeDPrinter threedprinter = new ThreeDPrinter();
		Powder p1 = new Powder();
		threedprinter.setMaterial(p1);
		System.out.println(p1);//방법1
		
		Powder p2= (Powder)threedprinter.getMaterial();
		System.out.println(p2);//방법2

		
	
		Plastic p4 = new Plastic();
		threedprinter.setMaterial(p4);
		System.out.println(p4);
		
		Plastic p3  = (Plastic)threedprinter.getMaterial();
		System.out.println(p3);
	}

}
