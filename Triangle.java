public class Triangle {
	private double a, b, c, d, e, f;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		a = x1;
		b = y1;
		c = x2;
		d = y2;
		e = x3;
		f = y3;
	}
	public double getSide1Length() {
		//Source: https://www.wikihow.com/Use-Distance-Formula-to-Find-the-Length-of-a-Line
		//Source: https://www.purplemath.com/modules/distform.htm
		return Math.sqrt((d - b) * (d - b) + (c - a) * (c - a)); 
	}
	public double getSide2Length() {
		//Source: https://www.wikihow.com/Use-Distance-Formula-to-Find-the-Length-of-a-Line
		//Source: https://www.purplemath.com/modules/distform.htm
		return Math.sqrt((f - b) * (f - b) + (e - a) * (e - a)); 
	}
	public double getSide3Length() {
		//Source: https://www.wikihow.com/Use-Distance-Formula-to-Find-the-Length-of-a-Line
		//Source: https://www.purplemath.com/modules/distform.htm
		return Math.sqrt((f - d) * (f - d) + (e - c) * (e - c)); 
	}
	public double getAngle1() {
		//Source: https://www.mathsisfun.com/algebra/trig-solving-sss-triangles.html
		double ap = (getSide1Length() * getSide1Length()) + (getSide2Length() * getSide2Length()) - (getSide3Length() * getSide3Length());
		ap = ap / (2 * getSide1Length() * getSide2Length());
		ap = Math.acos(ap);	
		return ap;
	}
	public double getAngle2() {
		//Source: https://www.mathsisfun.com/algebra/trig-solving-sss-triangles.html
		double ap = (getSide3Length() * getSide3Length()) + (getSide1Length() * getSide1Length()) - (getSide2Length() * getSide2Length());
		ap = ap / (2 * getSide3Length() * getSide1Length());
		ap = Math.acos(ap);		
		return ap;
	}
	public double getAngle3() {
		//Source: https://www.mathsisfun.com/algebra/trig-solving-sss-triangles.html
		double ap = (getSide2Length() * getSide2Length()) + (getSide3Length() * getSide3Length()) - (getSide1Length() * getSide1Length());
		ap = ap / (2 * getSide2Length() * getSide3Length());
		ap = Math.acos(ap);	
		return ap;
	}
	public double getPerimeter() {
		//Source: https://www.wikihow.com/Find-the-Perimeter-of-a-Triangle
		return getSide1Length() + getSide2Length() + getSide3Length();
	}
	public double getArea() {
		//Source: https://www.mathsisfun.com/geometry/herons-formula.html
		return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - getSide1Length()) * (getPerimeter() / 2 - getSide2Length()) * (getPerimeter() / 2 - getSide3Length()));
	}
} 