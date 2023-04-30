/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import javax.swing.JOptionPane;
import dao.PharmacyUtils;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author kulde
 */
public class OpenPdf {
    public static void openById(String Id){
        try{
            if(new File(PharmacyUtils.billPath+Id+".pdf").exists()){
                Process P=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+PharmacyUtils.billPath+""+Id+".pdf");
            }else{
                JOptionPane.showMessageDialog(null,"Bill not found.");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
