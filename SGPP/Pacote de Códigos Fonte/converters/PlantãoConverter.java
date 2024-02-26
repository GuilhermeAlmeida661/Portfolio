package converters;

import entities.Plantão;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@FacesConverter(forClass = Plantão.class)
@Named
public class PlantãoConverter extends EntityConverter<Plantão>{
    
    public PlantãoConverter(){
        super(Plantão.class);
    }
}