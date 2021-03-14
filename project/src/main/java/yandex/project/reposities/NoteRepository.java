package yandex.project.reposities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import yandex.project.entities.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
//    @Query("update Product p set p.title = ?1 where p.id = ?2")
//    @Modifying
//    Integer updateProductTitleById(String title, Long id);
}
