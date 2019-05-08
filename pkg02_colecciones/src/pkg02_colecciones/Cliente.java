package pkg02_colecciones;

public class Cliente {
    private long id;
    private String nombre;
    private String email;
    private boolean activo;

    public Cliente(long id, String nombre, String email) {
        this.id = id;    //el this.id se refiere al id de la variable atributo de la clase. id sin this es id recibido como parámetro
        this.nombre = nombre; 
        this.email = email;
        this.activo=true;
        
    }
    
    public long getId(){
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
