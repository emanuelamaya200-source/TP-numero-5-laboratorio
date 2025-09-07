                     
package trabajon5;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class DirectorioTelefonico {
    
     private final TreeMap<Long, Contacto> directorio = new TreeMap<>();
     
     private final TreeSet<String> ciudades  = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    private final TreeSet<String> apellidos = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    
    
    //Agregar contacto 
    
     public boolean agregarContacto(Long telefono, Contacto c) {
     
         if (telefono == null || c == null) return false;
        if (directorio.containsKey(telefono)) return false;
        directorio.put(telefono, c);
        if (c.getCiudad() != null)   ciudades.add(c.getCiudad()); 
        if (c.getApellido() != null) apellidos.add(c.getApellido());
        return true;
         
    }
     
     // Buscar por Telefono
     
         public Contacto buscarContacto(Long telefono) {
        return directorio.get(telefono);
    }
         
         // Buscar telefono por apellido
         
         
         
        public Set<Long> buscarTelefono(String apellido) {
          TreeSet<Long> telefonos = new TreeSet<>();
        if (apellido == null) return telefonos;
           for (Map.Entry<Long, Contacto> e : directorio.entrySet()) {
            Contacto c = e.getValue();
            if (c != null && c.getApellido() != null && c.getApellido().equalsIgnoreCase(apellido.trim())) {
                telefonos.add(e.getKey());
            }
        }
        return telefonos;
    }
      //Borrar contacto desde el directorio.  
public boolean borraContacto(Long telefono){
    if (directorio.containsKey(telefono)) {
        directorio.remove(telefono);
        return  true;
        
        
    }
    return false;
} 
 //final       
}          
 

    
       // Buscar contactos por ciudad
     
   
 
     // Borrar por teléfono
    
//    public boolean borrarContacto(Long telefono) {
//        Contacto borrado = directorio.remove(telefono);
//        if (borrado == null) return false;
//
//     
//}
}
