import java.io.*;

public class FileProperties {

	public static void main(String[] args) throws Exception{
		
	File f=new File("c:/Sheetal/f1.txt");
	System.out.println("File name:"+f.getName());
	System.out.println("File Absolute path:"+f.getAbsolutePath());
	System.out.println("File parent:"+f.getParent());
	System.out.println("File path:"+f.getPath());
	System.out.println("File length:"+f.length());
	System.out.println("File Exist:"+f.exists());
	if(f.exists())
	{
		System.out.println("Is writable:" +f.canWrite());
		System.out.println("Is readable:" +f.canRead());
		System.out.println("Is Executable:" +f.canExecute());
		System.out.println("Is Directory:" +f.isDirectory());
		
	}
	}
}
