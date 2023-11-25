package IOPkg;

import java.io.*;  
import java.security.PermissionCollection;  
public class FilePermissionExample{  
       public static void main(String[] args) throws IOException {  
        String srg = "testout";  
        FilePermission file1 = new FilePermission(srg,"read");  
        PermissionCollection permission = file1.newPermissionCollection();  
        permission.add(file1);  
             if(permission.implies(new FilePermission(srg, "write"))) {  
             System.out.println("Read, Write permission is granted for the path "+srg );  
             }else {  
            System.out.println("No Read, Write permission is granted for the path "+srg);            }  
       }   
}  