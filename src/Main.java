public class Main {
    public static void main(String[] args) {
      Alumno alumno1 = new Alumno("Juan", 20);
        Alumno alumno2 = new Alumno("Pedro", 21);
        Alumno alumno3 = new Alumno("Maria", 22);

        alumno1.addAsignatura(new Asignatura("Matematicas", 4.5));
        alumno1.addAsignatura(new Asignatura("Lengua", 3.5));
        alumno1.addAsignatura(new Asignatura("Fisica", 2.5));
        alumno1.addAsignatura(new Asignatura("Quimica", 4.5));

        alumno2.addAsignatura(new Asignatura("Matematicas", 4.5));
        alumno2.addAsignatura(new Asignatura("Lengua", 4.5));
        alumno2.addAsignatura(new Asignatura("Fisica", 3.5));
        alumno2.addAsignatura(new Asignatura("Quimica", 2.8));


        System.out.println("El promedio de notas de " + alumno1.getNombre() + " es: " + alumno1.promedioAlumno());



    }
}