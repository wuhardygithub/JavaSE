import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ZipFileSystem {

	public static void main(String[] args) throws IOException {
  	  Path uri=Paths.get("src", "a.zip");
  	  FileSystem fs=FileSystems.newFileSystem(uri,null);
  	  Path p=fs.getPath("/");
  	  
  	  Files.walkFileTree(p, new SimpleFileVisitor<Path>(){
  		  public FileVisitResult visitFile(Path file,BasicFileAttributes attrs) throws IOException{
  			  System.out.println(file);
  			  return FileVisitResult.CONTINUE;
  		  }
  	  });

	}

}
