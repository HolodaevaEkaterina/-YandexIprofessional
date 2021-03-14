package yandex.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yandex.project.dto.NoteDto;
import yandex.project.entities.Note;
import yandex.project.reposities.NoteRepository;


import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
  private NoteRepository noteRepository;

  @Autowired
  public NoteService(NoteRepository noteRepository) {
    this.noteRepository = noteRepository;
  }

  public List<Note> getAllNotes() {
    return noteRepository.findAll();
  }

  public Optional<Note> getOneById(Long id) {
    return noteRepository.findById(id);
  }

  public boolean existsById(Long id) {
    return noteRepository.existsById(id);
  }

  public Note save(NoteDto noteDto) {
    Note note = new Note();
    note.setId(noteDto.getId());
    note.setTitle(noteDto.getTitle());
    note.setContent(noteDto.getContent());
    return noteRepository.save(note);
  }

  public void deleteById(Long id) {
    noteRepository.deleteById(id);
  }
}
