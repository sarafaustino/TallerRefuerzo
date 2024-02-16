public class Estudiante extends Persona {

    private int edad;
    public Estudiante(String nombres, String apellidos, String id, int edad) {
        super(nombres, apellidos, id);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
