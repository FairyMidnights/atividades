
public class Quadrado extends Poligono {

	public Quadrado(double a, double b, double l) {
		super(a, b, l);
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return (getAltura() * getBase());
	}

	public double CalcularD() {
		return 0;
	}

}
