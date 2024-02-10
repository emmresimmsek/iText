package com.tutorialspoint;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import java.awt.*;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class ScalingImage10 {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        // Creating a PdfWriter
        String dest = "C:/Users/promosyoncu/Desktop/Scaling.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Creating a Document
        Document doc =new Document(pdfDoc);

        // Creating an ImageData object
        String imageFile = "C:/Users/promosyoncu/Desktop/logo.png";
        ImageData data = ImageDataFactory.create(imageFile);

        // Creating an Image object
        Image img = new Image(data);


        //You can scale an image using the setAutoScale() method.
        img.setFixedPosition(100,300);


        // Adding image to the document
        doc.add(img);

        // Closing the document
        doc.close();






    }
}
