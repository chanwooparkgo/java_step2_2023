package chapter12.multiple;

public class InterMenuMain  implements Inter_Menu3 {

	public static void main(String[] args) {
		
		InterMenuMain im = new InterMenuMain();
		//부모 = 자식
		Inter_Menu1 im1= im; //업캐스팅
		Inter_Menu2 im2= im; //업캐스팅
		Inter_Menu3 im3= im; //업캐스팅
		System.out.println("----Inter_Menu1-------");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();
		
		System.out.println("----Inter_Menu2-------");
		System.out.println(im2.tangsuyuck());
		
		System.out.println("----Inter_Menu3-------");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
	}

	@Override
	public String jajang() {
		
		return "하나죽으면아는 짜장면";
	}

	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "해장하세요";
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Inter_Menu3.super.show();
	}
	
	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "맛집";
	}

}
