package classroom;

public class Grupo {
    int codigo;
    Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int numEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = new Persona[numEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }
}
