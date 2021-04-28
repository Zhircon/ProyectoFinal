public class ExperienciaEducativa {
    //Atributos
    private String clave;
    private String nombre;
    private int totaldecreditos;
    //Contructores
    public ExperienciaEducativa(){
    }
    public ExperienciaEducativa(String clave,String nombre,int totaldecreditos){
        this.clave=clave;
        this.nombre=nombre;
        this.totaldecreditos=totaldecreditos;
    }
    //Gettters
    public String getClave() {
        return clave;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTotaldecreditos() {
        return totaldecreditos;
    }
    //Setters
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTotaldecreditos(int totaldecreditos) {
        this.totaldecreditos = totaldecreditos;
    }
}
