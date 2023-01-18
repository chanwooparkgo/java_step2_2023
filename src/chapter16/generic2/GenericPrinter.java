
package chapter16.generic2;

public class GenericPrinter<T>  {

	private T material;

	

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	
}
