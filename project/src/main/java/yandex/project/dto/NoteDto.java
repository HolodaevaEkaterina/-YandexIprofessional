package yandex.project.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import yandex.project.entities.Note;

@Data
@NoArgsConstructor
@ApiModel(description = "Note dto in the application.")
public class NoteDto {
  @ApiModelProperty(notes = "Unique identifier of the note. No two note can have the same id.", example = "1", required = true, position = 0)
  private Long id;

  @ApiModelProperty(notes = "Title of the note", example = "Bread", required = false, position = 1)
  private String title;

  @ApiModelProperty(notes = "Content of the note.", example = "some text", required = true, position = 2)
  private String content;

  public NoteDto(Note n) {
    this.id = n.getId();
    this.title = n.getTitle();
    this.content = n.getContent();
  }
}
