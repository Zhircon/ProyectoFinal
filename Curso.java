public class Curso {
    //Atributos
    private String nrc;
    private String bloque;
    private int seccion;
    //Constructores
    public Curso(){
    }
    public Curso(String nrc,String bloque,int seccion){
        this.nrc=nrc;
        this.bloque=bloque;
        this.seccion=seccion;
    }
    //Getters
    public String getNrc() {
        return nrc;
    }
    public String getBloque() {
        return bloque;
    }
    public int getSeccion() {
        return seccion;
    }
    //Setters
    public void setNrc(String nrc) {
        this.nrc = nrc;
    }
    public void setBloque(String bloque) {
        this.bloque = bloque;
    }
    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }
}
