/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playvideo_using_html;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nayanajith Priyasad
 */
public class PlayVideo_using_html {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String url = "C/Users/Nayanajith Priyasad/Downloads/Video/Adarei Man Adarei (Hiru TV Adarei Man Adarei Drama Theme Song 2) - YouTube.MP4";
        File ff = new File("Video.html");
        String url_1="E:\\PROJECT FOLDER\\My_research\\PlayVideo_using_html\\Video.html";
        FileWriter fw = new FileWriter(ff);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("<html>");
        bw.newLine();
        bw.write("<video controls>");
        bw.newLine();
        bw.write("<source src=\""+url+"\">");
        bw.newLine();
        bw.write("</video>");
        bw.newLine();
        bw.write("</html>");
        bw.newLine();
        
        bw.flush();
        bw.close();
        open_g(url_1);
//        open_gg(url);
    }

    private static void open_g(String url_1) {
        try {
            File ff=new File(url_1);
            Desktop.getDesktop().open(ff);
        } catch (Exception e) {
        }
    }

    private static void open_gg(String url) {
        try {
            File ff=new File(url);
            Desktop.getDesktop().open(ff);
        } catch (Exception e) {
        }
    }

    
  

}
