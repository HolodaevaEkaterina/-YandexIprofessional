package yandex.project.exceptions;

import lombok.Data;

import java.util.Date;

@Data
public class NoteError {
  private int status;
  private String message;
  private Date timestamp;

  public NoteError(int status, String message) {
    this.status = status;
    this.message = message;
    this.timestamp = new Date();
  }
}
