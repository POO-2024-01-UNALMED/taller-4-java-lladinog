package classroom;

public class Asignatura {

    public String nombre;
    public Integer codigoInterno;
    public Integer codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre", 0, 0, Tipo.FUNDAMENTACION);
    }

    public Asignatura(int codigoInterno, Tipo tipo) {
        this("Sin nombre", codigoInterno, null, tipo);
    }

    public Asignatura(int codigoExterno, String nombre, Tipo tipo) {
        this(nombre, null, codigoExterno, tipo;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, null, null, tipo);
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
