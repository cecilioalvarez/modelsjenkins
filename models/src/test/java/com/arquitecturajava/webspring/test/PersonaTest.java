package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void mayorEdadTest() {
		//AAA
		
	//arrange preparar
	Persona p= new Persona("pepe",20);
	boolean esMayor=p.esMayorEdad();
	assertTrue(esMayor);
	
	}
	

	@Test
	void mayorEdadTest5() {
		//AAA
		
	//arrange preparar
	Persona p= new Persona("pepe",20);
	boolean esMayor=p.esMayorEdad();
	assertTrue(esMayor);
	
	}
	

	@Test
	void mayorEdadTest2() {
		//AAA
		
	//arrange preparar
	Persona p= new Persona("pepe",20);
	boolean esMayor=p.esMayorEdad();
	assertTrue(esMayor);
	
	}

	@Test
	void mayorEdadTest3() {
		//AAA
		
	//arrange preparar
	Persona p= new Persona("pepe",20);
	boolean esMayor=p.esMayorEdad();
	assertTrue(esMayor);
	
	}

	@Test
	void mayorEdadTest4() {
		//AAA
		
	//arrange preparar
	Persona p= new Persona("pepe",10);
	boolean esMayor=p.esMayorEdad();
	assertTrue(esMayor);
	
	}
	

}
