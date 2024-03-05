package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
    	this.nombre = "Sin nombre";
        this.codigoInterno = 0;
        this.codigoExterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    public Asignatura(int codigoExterno,Tipo tipo) {
    	this.nombre = "Sin nombre";
        this.codigoInterno = codigoExterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, Tipo tipo) {
    	this.nombre = nombre;
        this.codigoInterno = 0;
        this.codigoExterno = 0;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    
    public void cambiarDatos(int codigoExterno) {
    	this(codigoExterno,codigoExterno,null,null);
    }

    public void cambiarDatos(String nombre) {
        this(0,0,nombre,null);
        
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}