package chapter16.generic2;

public class GenericPrinterMain2 {

	public static void main(String[] args) {
		
		GenericPrinter genericprinter = new GenericPrinter();
		
		
		
		
		
		GenericPrinter<Powder> printerPowder= new GenericPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder = printerPowder.getMaterial();
		System.out.println(powder);//방법1
		powder.doprinting();
	
		GenericPrinter<Plastic> printerPlastic= new GenericPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(plastic);//방법1
		plastic.doprinting();
		
		System.out.println();
		///모순(물 재료는 허용불가지만 제네릭문법상 허용되는 상황발생)
		Water water = new Water();
		water.doprinting();
		GenericPrinter<Water> printerWater= new GenericPrinter<Water>();
		//printerWater.setMaterial(new Water());
		//Water water = printerWater.getMaterial();
		//System.out.println(printerWater);
	}

}
