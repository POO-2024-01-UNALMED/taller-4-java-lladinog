package classroom;

public class Asignatura {

    public String nombre;
    public Integer codigoInterno;
    public Integer codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.codigoInterno = 0;
        this.codigoExterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    public Asignatura(int codigoInterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.codigoInterno = codigoInterno;
        this.codigoExterno = 0;
        this.tipo = tipo;
    }

    public Asignatura( String nombre,int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = 0;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = 0;
        this.codigoExterno = 0;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, Integer codigoInterno, Integer codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int nuevoCodigo) {
        if (codigoInterno != null)
            this.codigoInterno = nuevoCodigo;
        else
            this.codigoExterno = nuevoCodigo;
    }

    public void cambiarDatos(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setCodigoInterno(Integer codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}
