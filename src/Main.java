public class Main {
    public static void main(String[] args){
        Persona juan=new Persona();
        juan.setNombre("Juan");
        juan.setEdad(27);
        juan.setTelefono("3126589658");

        System.out.println(juan.getNombre()+" Tiene "+juan.getEdad()+" años y su celular es "+ juan.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
}
