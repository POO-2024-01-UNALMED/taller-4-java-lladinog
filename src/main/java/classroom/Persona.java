package classroom;
public class Persona {

	private long cedula;
	private String nombre;
    public static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }
    
    public Persona() {
        this.cedula = 0; // O cualquier otro valor predeterminado que desees para la cédula
        this.nombre = ""; // O cualquier otro valor predeterminado que desees para el nombre
        totalPersonas++;

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this(cedula, nombre); // Llama al otro constructor
    }

    public Persona(long cedula) {
        this(cedula, ""); // Llama al otro constructor
    }

    public Persona(String nombre) {
        this(0, nombre); // Llama al otro constructor
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
