public class Asignatura {
//atributos de la clase
    private String nombre;
    private double nota;

    //constructor
    public Asignatura(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {//método get para consultar el nombre de la asignatura
        return nombre;
    }

    public void setNombre(String nombre) {//método set para modificar la nota
        this.nombre = nombre;
    }

    public String getConceptoNota() {//método get para consultar el concepto la nota de la asignatura
        if (nota >= 3.5) {
            return "Aprobado";
        }else{
            return "Reprobado";
        }

    }

    public double getNota() {//método get para consultar la nota de la asignatura
        return nota;
    }

    public void setNota(double nota) {//método set para modificar la nota
        this.nota = nota;
    }
}
