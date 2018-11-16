package tania;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends tania.Persona {
    private List<tania.Materia> materia;

    public Estudiante(String nombre, String apellido, int ci, int edad){
        super(nombre, apellido,ci,edad);
        this.materia = new ArrayList<>();
    }

    public void addMateria(tania.Materia materia){
        this.materia.add(materia);
    }

    public String getMateria(String key){
        String nombre = "";
        for (tania.Materia materia: this.materia) {
            if (materia.getKey().equals(key)){
                nombre = materia.getNombre();
            }
            break;
        }
        return nombre;
    }

    public int notaMinima(){
        int min = 100;
        for (tania.Materia materia: this.materia) {
            if (materia.getNota() <= min ){
                min = materia.getNota();
            }
        }

        return min;
    }
}
