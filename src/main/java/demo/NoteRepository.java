package demo;

import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, String> {

}
