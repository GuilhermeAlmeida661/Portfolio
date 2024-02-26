package converters;

import entities.Servidor;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@FacesConverter(forClass = Servidor.class)
@Named
public class ServidorConverter extends EntityConverter<Servidor>{
    
    public ServidorConverter(){
        super(Servidor.class);
    }
}
