
package trabajon5;


public class Persona {
  
  int dni;
  String nombre;
  String apellido;
  int numCelu;   
  String ciudad;
  String domicilio;
    
   //constructor completo  
    public Persona(int dni, String nombre, String apellido, int numCelu, String ciudad, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCelu = numCelu;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }
    
  //constructor por dni
    public Persona(int dni) {
        this.dni = dni;
    }
    
  //constructor por nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
   //consrtructor por dni y nombre

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    //Getters Y Setters

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumCelu() {
        return numCelu;
    }

    public void setNumCelu(int numCelu) {
        this.numCelu = numCelu;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
         
    
    //tostring
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", numCelu=" + numCelu + ", ciudad=" + ciudad + ", domicilio=" + domicilio + '}';
    }
    
//final     
}
