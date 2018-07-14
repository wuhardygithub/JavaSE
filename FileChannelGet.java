import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileChannelGet {
//20180714
	public static void main(String[] args) throws IOException {
		  Path p=Paths.get("src", "ZipFileSystem.java");    	  
    	  File f=p.toFile();
	      FileChannel fc=FileChannel.open(p);	      
	      MappedByteBuffer buffer=fc.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
	      
	      for(int i=0;i<buffer.remaining();i++){	    	  
	    	  byte dst=buffer.get();
	    	  System.out.print(dst);
	      }

	}
	

}
