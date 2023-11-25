package DeserializationFolder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import SerializationFolder.Student;

public class B {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("d:/krishna/seria.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student readObject = (Student) ois.readObject();
			
			readObject.displayName();
			System.out.println(readObject.getCollege());
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
