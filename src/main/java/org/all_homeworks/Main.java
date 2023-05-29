package org.all_homeworks;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XmlParser {
    public static void main(String[] args){

        try {
            // Parsing the XML file
            File inputFile = new File("input.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Accessing the student elements and their attributes
            NodeList nodeList = doc.getElementsByTagName("student");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Roll No : " + element.getAttribute("rollno"));
                    System.out.println("First Name : " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name : " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nick Name : " + element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Marks : " + element.getElementsByTagName("marks").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}