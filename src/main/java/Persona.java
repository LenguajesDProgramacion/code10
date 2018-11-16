package tania;

public class Persona {
    private String nombre;
    private String apellido;
    private int ci;
    private int edad;

    public Persona(String nombre, String apellido, int ci, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
