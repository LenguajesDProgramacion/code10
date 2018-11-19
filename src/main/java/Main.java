package tania;

public class Main {
    public void main (String [] arg){
        Estudiante estudiante = new Estudiante("Jorge", "Ledezma", 788555, 23);
        Materia materia1 = new Materia("Ingles", "123A", 52);
        Materia materia2 = new Materia("Fisica", "123B", 52);
        Materia materia3 = new Materia("Literatura", "123B", 52);

        estudiante.addMateria(materia1);
        estudiante.addMateria(materia2);
        estudiante.addMateria(materia3);


    }
}
