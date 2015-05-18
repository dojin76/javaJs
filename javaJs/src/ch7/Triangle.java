package ch7;

class Triangle {

	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3) {
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
	}
}
