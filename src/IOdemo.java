import java.io.*;

public class IOdemo {
public static void main(String[] args) throws Exception{
	FileInputStream input1=new FileInputStream("C:/Sheetal/f1.txt");
	FileInputStream input2=new FileInputStream("C:/Sheetal/f2.txt");
	SequenceInputStream s1=new SequenceInputStream(input1, input2);
	int j;
	while((j=s1.read())!=-1)
	{
		System.out.print((char)j+"  ");
	}

	s1.close();
	input1.close();
	input2.close();
}
	
}
