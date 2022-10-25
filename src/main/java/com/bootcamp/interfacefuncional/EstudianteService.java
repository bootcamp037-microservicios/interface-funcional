package com.bootcamp.interfacefuncional;

import java.util.List;
import java.util.function.Consumer;

public class EstudianteService {

    public void listaEstudiante(List<Estudiante> estudiantes, Consumer<Estudiante> cons){

        for (Estudiante est: estudiantes){
            cons.accept(est);
        }
    }
}
