package Collections;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * Created by expert on 8/8/18.
 */
public class DocParser {
    public static void main(String[] args) {
        /*try
        {
            File inputFIle = new File("SampleFIle.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc= dBuilder.parse(inputFIle);
            NodeList nList = doc.getRootElementsByTagName("food");
            System.out.println("-----------------------");

            for(int temp=0;temp<nList.getLength();temp++)
            {
                Node nNode=nList.item(temp);
                System.out.println("\nCurrent Element:"+ nNode.getNodeName());
            }
        }


    }*/
    }
}
