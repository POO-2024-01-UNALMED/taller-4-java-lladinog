package classroom;
public class Asignatura {

	public String nombre;
	public String n;
	public int codigoInterno;
	public int codigoExterno;
	public Tipo tipo;

    public Asignatura() {
        this("Sin nombre", 0, 0, Tipo.FUNDAMENTACION);
    }

    // Constructor con código interno y tipo
    public Asignatura(int codigoInterno, Tipo tipo) {
        this("Sin nombre", codigoInterno, 0, tipo);
    }

    // Constructor con código externo y tipo
    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", 0, codigoExterno, tipo);
    }

    // Constructor con nombre y tipo
    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo);
    }

    // Constructor completo
    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.n = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int nuevoCodigo) {
        if (codigoInterno != 0)
            this.codigoInterno = nuevoCodigo;
        else
            this.codigoExterno = nuevoCodigo;
    }

    public void cambiarDatos(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}