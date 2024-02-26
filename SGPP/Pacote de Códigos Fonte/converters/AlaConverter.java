package converters;

import entities.Ala;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@FacesConverter(forClass = Ala.class)
@Named
public class AlaConverter extends EntityConverter<Ala>{
    
    public AlaConverter(){
        super(Ala.class);
    }
}
