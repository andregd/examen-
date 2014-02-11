package Datos;

/**
 *
 * @author vaio
 */
public abstract class Usuario {
    protected boolean estado;
    protected String password;
    private String fechainicio;
    private String fechafin;
    
    public Usuario(){
        estado = true;
        password = null;
        fechainicio = "";
        fechafin = "";
                
    }
    
    public Usuario (String password,boolean verdad ){
        this.password = password;
        this.estado = verdad;
        this.fechainicio=null;
        this.fechafin=null;
    }
    
    public void MostrarUsuario (){
        System.out.println("Password: "+ password);
        System.out.println("Estado: " + estado);
        System.out.println("fecha de inicio: " + fechainicio );
        System.out.println("fecha de finalizacion: " + fechafin);
    }
     
    public boolean SuEstado(String password, boolean nuevo)
    {
     this.password=password;
     if (nuevo){
     this.estado=nuevo;
     }
     return this.estado;
    }
    public abstract String RetornarPassword (String Fechainicio);
}
