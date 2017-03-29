package com.pedroborgesalves.javadesignpatterns.composite;

/**
 * <h1>Composite Pattern</h1>
 * <p> - When you want to represent part-whole hierarchies of objects.</p>
 * <p> - When you want clients to be able to ignore the difference between
 * compositions of objects and individual objects. Clients will treat all 
 * objects in the composite structure uniformly.</p>
 * 
 */
public class CompositeDemo {

    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");

        parentTag.addChildTag(p1);

        HtmlTag child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);

        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);

        parentTag.generateHtml();

    }

}
