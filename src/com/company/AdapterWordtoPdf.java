package com.company;

public class AdapterWordtoPdf implements Document{
    WordFile  wordFile;
    public AdapterWordtoPdf(WordFile wordFile){
        this.wordFile=wordFile;
    }
    @Override
    public void createDocument() {
        wordFile.saveDocument();
    }

    @Override
    public void uploadToMoodleDocument() {
       wordFile.uploadDocument();
    }
}
