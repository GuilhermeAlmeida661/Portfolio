package converters;

import entities.Paciente;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@FacesConverter(forClass = Paciente.class)
@Named
public class PacienteConverter extends EntityConverter<Paciente>{
    
    public PacienteConverter(){
        super(Paciente.class);
    }
}
