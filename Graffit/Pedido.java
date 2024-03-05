package Graffit;

import java.util.Date;

public abstract  class Pedido implements Cobrable {
	public static int contador = 1;
	protected int codigo;
	protected Date fecha;
	protected boolean pagado;
	
	@Override
	public boolean enEfectivo(double cantidad) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean conTarjeta(String tarjeta) {
		// TODO Auto-generated method stub
		return false;
	} 
	
}
