package c9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class UuidWriter {

  public static void writeUuid() {
    String content = UUID.randomUUID().toString();
    try {
      Files.writeString(Path.of("uuids.txt"),
        content, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    writeUuid();
  }
}