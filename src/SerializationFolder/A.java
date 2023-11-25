package SerializationFolder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class A {
	public static void main(String[] args) {
		
		
		Student st=new Student(1, "krishna", "TOCE", "Bangalore");
		try {
			FileOutputStream fos=new FileOutputStream("d:/krishna/seria.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.close();
			fos.close();
			
			System.out.println("File has been transfered sucessfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
