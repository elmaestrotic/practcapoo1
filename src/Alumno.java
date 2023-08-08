import java.util.ArrayList;

public class Alumno {
    //atributos de la clase
    private String nombre;
    private int edad;

    //creamos un atributo tipo arraylist para almacenar objetos de tipo Asignatura
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    //constructor
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {//método get para consultar el nombre del alumno
        return nombre;
    }

    public void setNombre(String nombre) {//método set para modificar el nombre del alumno
        this.nombre = nombre;
    }

    public int getEdad() {//método get para consultar la edad del alumno
        return edad;
    }

    public void setEdad(int edad) {//método set para modificar la edad del alumno
        this.edad = edad;
    }

    public void addAsignatura(Asignatura asignatura) {//método para añadir asignaturas al arraylist
        if (asignaturas.contains(asignatura)) {
            System.out.println("La asignatura ya existe");

        } else {
            asignaturas.add(asignatura);
        }
    }
    public Double promedioAlumno(){//método para calcular el promedio de las notas
        double promedio = 0;
        for (Asignatura asignatura: asignaturas) {
            promedio += asignatura.getNota();
        }
        return promedio/asignaturas.size();
    }

}
