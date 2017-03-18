/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerPDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;

/**
 *
 * @author csqueiroz
 */
public class Pdf3DTAlpha {
    
    private Document document;
    
    public void  generatePDF(){
        try {
            createDocument();
            document.open();
            addHeader();
            document.close();
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pdf3DTAlpha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Pdf3DTAlpha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void createDocument() throws FileNotFoundException, DocumentException{
        document = new Document();
        File outFile = new File("C:\\Users\\csqueiroz\\3dtficha2.pdf");
        
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outFile));
    }
    
    private void addHeader() throws DocumentException{
        Paragraph paragraph = new Paragraph("3D&T - Defensores de Tóquio 3ª Edição Alpha");
        paragraph.setFont(new Font(FontFamily.TIMES_ROMAN, 15, Font.BOLD,BaseColor.BLACK));
        paragraph.setAlignment(1);
        document.add(paragraph);
        paragraph = new Paragraph("FICHA DE PERSONAGEM");
        paragraph.setFont(new Font(FontFamily.TIMES_ROMAN, 15, Font.BOLD,BaseColor.BLUE));
        document.add(paragraph);
        
    }
    
}
