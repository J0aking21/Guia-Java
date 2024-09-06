public class Empleado1 {
    private String nombre;
    private String apellido;
    private int edad;
    private int salario;
    public Empleado1(String nombre, String apellido, int edad, int salario)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public int getSalario() {
        return salario;
    }
}
