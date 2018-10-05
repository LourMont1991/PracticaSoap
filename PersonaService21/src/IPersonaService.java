
public interface IPersonaService {

		boolean addPerson(Persona persona);

		boolean deletePerson(int id);

		Persona getPerson(int id);

		Persona[] getAllPersons();

	}

