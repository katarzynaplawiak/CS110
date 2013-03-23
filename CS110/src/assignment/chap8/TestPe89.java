package assignment.chap8;

public class TestPe89 {

	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon();
		System.out.printf(
				"\nThe perimeter of %s is %.1f and the area is %.1f","polygon1"
				,polygon1.getPerimeter(), polygon1.getArea());
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		System.out.printf(
				"\nThe perimeter of %s is %.1f and the area is %.1f","polygon2"
				,polygon2.getPerimeter(), polygon2.getArea());
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.printf(
				"\nThe perimeter of %s is %.1f and the area is %.1f","polygon3"
				,polygon3.getPerimeter(), polygon3.getArea());
	}

}
