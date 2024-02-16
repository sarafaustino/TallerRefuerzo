public class Persona {
    private String  nombres;
    private String apellidos;
    private String id;

    public Persona(String nombres, String apellidos, String id){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getId() {
        return id;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }





}
