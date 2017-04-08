package com.pedroborgesalves.javadesignpatterns.chainofresponsability;

/**
 * <h1>Chain of Responsibility Pattern</h1>
 * <p>
 * This pattern is all about connecting objects in a chain of notification; as a
 * notification travels down the chain, it’s handled by the first object that is
 * set up to deal with the particular notification.</p>
 * <p>
 * - More than one objects may handle a request, and the handler isn’t known a
 * priori. The handler should be ascertained automatically.</p>
 * <p>
 * - You want to issue a request to one of several objects without specifying
 * the receiver explicitly.</p>
 * <p>
 * - The set of objects that can handle a request should be specified
 * dynamically.</p>
 */
public class ChainofResponsibilityDemo {

    public static void main(String[] args) {
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");
        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);
        file = new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);
        file = new File("Abc.jpg", "video", "C:");
        textHandler.process(file);
        file = new File("Abc.doc", "doc", "C:");
        textHandler.process(file);
        file = new File("Abc.bat", "bat", "C:");
        textHandler.process(file);
    }

}
