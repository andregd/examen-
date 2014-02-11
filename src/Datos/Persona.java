package Datos;

/**
 *
 * @author vaio
 */
public class Persona {

    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private String Cedula;
    private int Edad;

    public Persona() {
        Nombre = null;
        Apellido = null;
        Direccion = null;
        Telefono = null;
        Cedula = null;
        Edad = 0;
    }

    public Persona(String cedula, String nombre, String apellido) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Cedula = cedula;
        
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Nombre) {
        this.Nombre = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellidos) {
        this.Apellido = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Persona(int num) {
        Nombre = "No tiene";
        Apellido = "No tiene";
        Cedula = "No tiene";
        Direccion = "No tiene";
        Telefono = "No tiene";
        Edad = num;

    }

    public void Mostrar() {
        System.out.println("Nombre es:" + Nombre + " " + "Apellido es:" + Apellido + "Edad es:" + Edad);
    }

    public String toString() {
        String varios;
        varios = "La cedula es:" + Cedula +" "+"Nombre es:" + Nombre +" "+ "Apellidos es:" + Apellido;
        return varios;
    }
}

   