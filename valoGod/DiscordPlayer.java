package valoGod;

public class DiscordPlayer extends Persona {
	protected String videojuego;
	protected double nivel;
	public DiscordPlayer(String nombre, Double edad, Sociabilidad nSocial, String videojuego, double nivel) {
		super(nombre, edad, nSocial);
		this.videojuego = videojuego;
		this.nivel = nivel;
	}
	public DiscordPlayer() {
		super();
		this.videojuego = "";
		this.nivel = 0;
	}
	public String getVideojuego() {
		return videojuego;
	}
	public void setVideojuego(String videojuego) {
		this.videojuego = videojuego;
	}
	public double getNivel() {
		return nivel;
	}
	public void setNivel(double nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "DiscordPlayer [videojuego=" + videojuego + ", nivel=" + nivel + "]";
	}
	public String comer() {
		return "mocos";
	}
	

}
