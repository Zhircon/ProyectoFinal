public class Estudiante {
    private String matricula;
    private String nombre;
    private String datos;
    public Estudiante(){

    }
    public Estudiante(String matricula,String nombre,String datos){
        this.matricula=matricula;
        this.nombre=nombre;
        this.datos=datos;
    }
    //Getters
    public String getMatricula() {
        return matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDatos() {
        return datos;
    }
    //Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDatos(String datos) {
        this.datos = datos;
    }
}
