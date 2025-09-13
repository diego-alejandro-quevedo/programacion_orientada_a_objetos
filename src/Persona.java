public class Persona{

    //es un atributo publico ya que el nombre es lo puede saber cualquiera
    public  String nombre;
    // es un atributo privado ya que la cedula es un dato confidencial
    private String cedula;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCedula(String nombre){
        this.cedula=cedula;
    }

    public String getCedula(){
        return cedula;
    }

}
