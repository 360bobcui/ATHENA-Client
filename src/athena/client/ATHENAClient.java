/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athena.client;

import java.io.IOException;
import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 *
 * @author bob
 */
public class ATHENAClient {
    
//    public ATHENAClient() {
//        this.setIconImage(new ImageIcon(getClass().getResource("img.jpg")).getImage());
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //setIconImage(new ImageIcon(getClass().getResource(GlobalVar.ICON_NAME)).getImage());
        Runtime rt = Runtime.getRuntime();
        System.out.println(ATHENAClient.class.getResource("ATHENAClient.class"));
       // String path = "C:\\";
        String path = ATHENAClient.class.getResource("ATHENAClient.class").toString();
        path = path.replaceAll("file:/", "");
        String[] data = path.split("/ATHENAClient.class");
        path = data[0];
        //String[] cmdArray = new String[]{"cmd.exe", "/C", "\"start; cd " + path + "\"" };
        
        // rename ATHENA-DMPO as lib.  Leave source and lib in the same directory where ATHENAClient.jar is. 
        String[] cmdArray = new String[]{"cmd.exe", "/C", "\"start; java -jar lib\\ATHENA-DMPO.jar \"" };
        System.out.println(Arrays.toString(cmdArray));
        rt.exec(cmdArray);
        //rt.exec(new String[]{"cmd.exe", "/C", "\"start; cd " + path + ";java -jar ATHENA-DMPO.jar \"" });
      //  rt.exec(new String[]{".exe", " ATHENA-DMPO.jar 1000"});
//        Process pr = rt.exec("cmd/c Desktop");        
//        pr = rt.exec("java -jar ATHENA-DMPO.jar");        
    }    
}
