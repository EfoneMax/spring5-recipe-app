package efone.max.spring5recipeapp.repositories;

import efone.max.spring5recipeapp.domain.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Notes, Long> {
}
