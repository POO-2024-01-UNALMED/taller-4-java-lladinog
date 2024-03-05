package classroom;

public class Persona {

    private  final long cedula;
    private String nombre;
    private static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }

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
        this(0, nombre); // Llama al otro constructor, puedes usar cualquier valor para cedula aquí
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