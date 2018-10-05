import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonaServiceImp implements IPersonaService{
	
private static Map<Integer,Persona> personas = new HashMap<Integer,Persona>();
	
	@Override
	public boolean addPerson(Persona persona) {
		if(personas.get(persona.getId()) != null) return false;
		personas.put(persona.getId(), persona);
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		if(personas.get(id) == null) return false;
		personas.remove(id);
		return true;
	}

	@Override
	public Persona getPerson(int id) {
		return personas.get(id);
	}

	@Override
	public Persona[] getAllPersons() {
		Set<Integer> ids = personas.keySet();
		Persona[] personas2 = new Persona[ids.size()];
		int i=0;
		for(Integer id : ids){
			personas2[i] = personas.get(id);
			i++;
		}
		return personas2;
	}


}
