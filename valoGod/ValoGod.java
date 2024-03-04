package valoGod;

import java.util.ArrayList;

public class ValoGod {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona());
		personas.add(new ViernachosMen());
		personas.add(new DiscordPlayer());
		
		for (Persona persona : personas) {
			System.out.println(persona.comer());}
		ViernachosMen Aitor = new ViernachosMen();
		System.out.println(Aitor);
		
}}
