package posix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class LoadLibrary
{
  private static final String RESOURCE_PATH = "/jnl/libposix.so";
  
  protected static void loadPosix()
  {
    try
    {
      InputStream in = LoadLibrary.class.getClass().getResource(RESOURCE_PATH).openStream();
      File so = File.createTempFile("posix", ".so");
      FileOutputStream out = new FileOutputStream(so);
      
      byte[] buf = new byte[2048];
      int i;
      while ((i = in.read(buf)) != -1)
        out.write(buf, 0, i);
      in.close();
      out.close();
      so.deleteOnExit();
      System.load(so.toString());
    }
    catch (FileNotFoundException e)
    {
      System.err.println(e);
      System.exit(1);
    }
    catch (IOException e)
    {
      System.err.println(e);
      System.exit(1);
    }
  }
}
