package com.tutorialspoint;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.annot.PdfAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfTextAnnotation;
import com.itextpdf.layout.Document;
import java.awt.Color; //Color sınıfını import et


import java.awt.*;
import java.io.FileNotFoundException;

public class TextAnnotation11 {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/TextAnnotation.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdfDoc);

        // Creating PdfAnnotation
        Rectangle rect = new Rectangle(20,800,0,0);
        PdfAnnotation ann = new PdfTextAnnotation(rect);

        /*java.awt ve iText kütüphaneleri, farklı amaçlara hizmet eden iki ayrı kütüphanedir.
        Eğer amacınız PDF belgesi üzerinde çalışmaksa ve PDF belgelerine çeşitli öğeler eklemek istiyorsanız, örneğin metin açıklamaları eklemek gibi, iText kütüphanesi kullanmanız daha uygundur.
        PdfAnnotation ve PdfTextAnnotation gibi sınıflar, iText kütüphanesine özgüdür.
        java.awt kütüphanesi renkleri temsil etmek için Color sınıfını içerir. */

        // Setting color to the annotation
        ann.setColor(new DeviceRgb(0,255,0));
        /* PdfTextAnnotation sınıfının setColor metodu, Color sınıfının değil, DeviceRgb sınıfının bir örneğini bekler.
        Bu nedenle, doğrudan java.awt.Color kullanamazsınız. */

        // Setting title to the annotation
        ann.setTitle(new PdfString("Oku"));

        // Setting contents of the annotation
        ann.setContents("Merhaba, Ben Emre Simsek");

        //Adding the annotation to a page
        PdfPage page = pdfDoc.addNewPage();
        // Adding annotation to a page in a PDF
        page.addAnnotation(ann);




        // Closing the document
        document.close();














    }
}
