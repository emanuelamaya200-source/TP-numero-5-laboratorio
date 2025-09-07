
package trabajon5;


public class Ciudad {
  
   //atributos 
   String nombre;
   
   //constructor
   public Ciudad(String nombre) {
        this.nombre = nombre;
    }
   
   //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
     @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Ciudad ciudad = (Ciudad) o;
        

        return nombre.equalsIgnoreCase(ciudad.nombre);
    }


    @Override
    public int hashCode() {

        return nombre.toLowerCase().hashCode();
    }
}
      
       
       
    
//final    

