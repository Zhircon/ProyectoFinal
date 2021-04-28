public class Profesor {
    //Atributos
    private String nombre;
    private String numerodepersonal;
    private String tiempodecontratacion;
    //Constructores
    public Profesor(){
    }
    public Profesor(String nombre,String numerodepersonal,String tiempodecontratacion){
        this.nombre=nombre;
        this.numerodepersonal=numerodepersonal;
        this.tiempodecontratacion=tiempodecontratacion;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getNumerodepersonal() {
        return numerodepersonal;
    }
    public String getTiempodecontratacion() {
        return tiempodecontratacion;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumerodepersonal(String numerodepersonal) {
        this.numerodepersonal = numerodepersonal;
    }
    public void setTiempodecontratacion(String tiempodecontratacion) {
        this.tiempodecontratacion = tiempodecontratacion;
    }
}
