package Datos;

public class Administrador extends Usuario{

    private String privilegios;
    private String rol;
    
    public Administrador(){
        super("Casa",true);
        super.estado=true;
        super.password="no tiene";
        
    }
    
    public Administrador(String rol){
        super();
        this.rol=rol;
        this.privilegios=null;
    }

    @Override
    public String RetornarPassword(String Fechainicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void MostrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

