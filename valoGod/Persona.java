package valoGod;

public class Persona {
	protected String nombre;
	protected double edad;
	protected Sociabilidad nSocial;
	public Persona(String nombre, Double edad, Sociabilidad nSocial) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nSocial = nSocial;
	}
	
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.nSocial = Sociabilidad.nadaSociable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public Sociabilidad getnSocial() {
		return nSocial;
	}

	public void setnSocial(Sociabilidad nSocial) {
		this.nSocial = nSocial;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nSocial=" + nSocial + "]";
	}
	
	public String comer() {
		return "...";
	}
	

}
