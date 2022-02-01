package c9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ProtocolException;

public class SubRandomAccessFile extends RandomAccessFile {

  public SubRandomAccessFile(File file, String mode) throws FileNotFoundException {
    super(file, mode);
  }

  @Override
  public long length() {
    try {
      return super.length();
    } catch (IOException e) {
      return 0;
    }
  }

  @Override
  public void write(int b) throws ProtocolException {
    try {
      super.write(b);
    } catch (IOException e) {
      throw new ProtocolException();
    }
  }

  @Override
  public void close() {
  }
}
