package com.generation.f20220601;

import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Michi;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Perro;

public class Main { // La palabra extends significa que estamos usando herencia

	public static void main(String[] args) {
		// Herencia

		Mascota mascota = new Mascota();
		mascota.setColor("Gris");
		mascota.setNombre("Tom");

		Perro perro = new Perro();
		perro.setColor("RedFaund");
		perro.setNombre("Ayun");

		Gato gato = new Gato();
		gato.setEspecie("Felino");
		gato.setPelaje("Pelo");
		gato.setPeso(3);

		System.out.println(gato.toString());

		Michi michi = new Michi(true);
		michi.setColor("Amarillo");
		System.out.println(michi.toString());

		// Polimorfismo

		Mascota regalon = new Mascota("Negro", "Canes", "Pelo", "Firulais", 1.5f, "Macho");

		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(4);

		Mascota chocolo = new Perro();
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Cafe");
		chocolo.setPeso(10);

		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		listaMascotas.add(regalon);
		listaMascotas.add(felix);
		listaMascotas.add(chocolo);

		// MUCHAS FORMAS DE RESPUESTA
		// Por ello lo trabajamos como algo generico
		regalon.hacerSonido();
		felix.hacerSonido();
		chocolo.hacerSonido();

		System.out.println("************");

		for (Mascota mascota2 : listaMascotas) {
			mascota2.hacerSonido();
		}

		// Transformar el objeto generico a uno especifico
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(6);
		// Hasta este momento <felix> sigue siendo tratado como una "Mascota" a
		// diferencia de <chocolo> que ya es considerado "Perro"

	}

}
