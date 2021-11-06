package com.company;

public class Main {

    public static void main(String[] args) {
      WordFile wordFile=new WordFile();
      wordFile.saveDocument();
      wordFile.uploadDocument();


      PDFFile pdfFile=new PDFFile();
      pdfFile.createDocument();
      pdfFile.uploadToMoodleDocument();

      Document file =new AdapterWordtoPdf(wordFile);
      file.createDocument();
      file.uploadToMoodleDocument();
    }

}
