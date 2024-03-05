package Graffit;

public class Nachos {
	protected String nombre;
	protected int cantidad;
	protected double queso;
	protected double bacon;
	public Nachos(String nombre, int cantidad, double queso, double bacon) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.queso = queso;
		this.bacon = bacon;
	}
	public Nachos() {
		super();
		this.nombre = "";
		this.cantidad = 0;
		this.queso = 0;
		this.bacon = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getQueso() {
		return queso;
	}
	public void setQueso(double queso) {
		this.queso = queso;
	}
	public double getBacon() {
		return bacon;
	}
	public void setBacon(double bacon) {
		this.bacon = bacon;
	}
	@Override
	public String toString() {
		return "Nachos [nombre=" + nombre + ", cantidad=" + cantidad + ", queso=" + queso + ", bacon=" + bacon + "]";
	}
	
	
}
