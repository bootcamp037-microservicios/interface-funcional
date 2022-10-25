package com.bootcamp.interfacefuncional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class InterfacefuncionalApplication {

	static final Logger log = LoggerFactory.getLogger(InterfacefuncionalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(InterfacefuncionalApplication.class, args);

		// Interface saludo

/*		IGreeting iGreeting = () -> {System.out.println("Hola Mundo");};

		iGreeting.SayHello();*/

		// Interface convertidor
/*
		Function<Integer, String> convertidor = x -> Integer.toString(x);

		log.info(""+convertidor.apply(10).length());
		log.info(""+convertidor.apply(1000).length());*/

		// Operador calcular
/*		Calcular suma = (x,y) -> x+y;
		Calcular resta = (x,y) -> x-y;
		Calcular mult = (x,y) -> x*y;
		Calcular div = (x,y) -> x/y;
		System.out.println(suma.opera(23,7));
		System.out.println(resta.opera(23,7));
		System.out.println(mult.opera(23,7));
		System.out.println(div.opera(23,7));*/

		// Suppier
/*		Supplier<String> nombre = () -> "Pedro";
		System.out.println("El nombre proporcionado es: "+nombre.get());*/

		//Consumer

		List<Estudiante> estudianteList = Arrays.asList(
				new Estudiante("Javier",14),
				new Estudiante("Pedro",12)
		);

		EstudianteService estudianteService = new EstudianteService();

		Consumer<Estudiante> consumer = e -> System.out.println(
				"Nombre: "+ e.getNombre() +
						" Su calificación es: "+e.getNota());

		estudianteService.listaEstudiante(estudianteList,consumer);


	}

}
