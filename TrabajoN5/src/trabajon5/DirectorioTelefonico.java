                     
package trabajon5;

import java.util.TreeMap;


public class DirectorioTelefonico {
    
     private final TreeMap<Long, Contacto> directorio = new TreeMap<>();
    
    
    //Agregar contacto 
    
//     public boolean agregarContacto(Long telefono, Contacto c) {
//     
//         if (telefono == null || c == null) return false;
//        if (directorio.containsKey(telefono)) return false;
//        directorio.put(telefono, c);
//        if (c.getCiudad() != null)   ciudad.add(c.getCiudad());
//        if (c.getApellido() != null) apellido.add(c.getApellido());
//        return true;
//         
//     }
     
     // Buscar por Telefono
     
         public Contacto buscarContacto(Long telefono) {
        return directorio.get(telefono);
    }
         
         // Buscar telefono por apellido
         
         
 

    
       // Buscar contactos por ciudad
     
   
 
     // Borrar por teléfono
    
//    public boolean borrarContacto(Long telefono) {
//        Contacto borrado = directorio.remove(telefono);
//        if (borrado == null) return false;
//
//     
//}
}
