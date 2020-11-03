package sravan.java;

import java.beans.Transient;
import java.io.FileOutputStream;
import java.io.Serializable;

public class TryResource implements Serializable {    
public static void main(String args[]){      
        // Using try-with-resources  
try(FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\addkumar\\Desktop\\sravan\\practice\\abc.txt")){
String msg = "Welcome to javaTpoint!";   
int  i=10;
byte byteArray[] = msg.getBytes(); //converting string into byte array      
fileOutputStream.write(byteArray);  
System.out.println("Message written to file successfuly!"); 

System.out.println(fileOutputStream);
}catch(Exception exception){  
       System.out.println(exception);  
}      
}      
}    