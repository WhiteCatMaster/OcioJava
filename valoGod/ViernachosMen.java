package valoGod;

public class ViernachosMen extends Persona {
	protected String actividad;

	public ViernachosMen(String nombre, Double edad, Sociabilidad nSocial, String actividad) {
		super(nombre, edad, nSocial);
		this.actividad = actividad;
	
	}
	public ViernachosMen() {
		super();
		this.actividad = "";
	
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	@Override
	public String toString() {
		return "ViernachosMen [actividad=" + actividad + "]";
	}
	public String comer() {
		return "nachos";
	}
}
	
	
	