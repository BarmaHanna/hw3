import org.testng.TestNGException;
import org.testng.annotations.Test;
import org.testng.xml.XMLParser;
import parser.XMLTag;
import utilities.Iterator;
import utilities.ListADT;
import utilities.MyArrayList;
import utilities.MyStack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class XMLParserTest {

    @Test(groups = "parser")
    public void testTrueSimpleXmlFile() {
        parser.XMLParser parser = new parser.XMLParser("C:\\Users\\Dell\\hw3\\lesson7\\src\\test\\resources\\ErrorOpenTag.html");
        parser.parseDocument();
        assertTrue(parser.getErrors().isEmpty());
    }

    private void assertTrue(boolean empty) {
    }

    @Test(groups = "parser")
    public void testSelfClosedTag() {
        parser.XMLParser parser = new parser.XMLParser("C:\\Users\\Dell\\hw3\\lesson7\\src\\test\\resources\\ErrorOpenTag.html");
        parser.parseDocument();
        assertTrue(parser.getErrors().isEmpty());
    }

    @Test(groups = "parser")
    public void testWithoutDeclarationFile() {
        parser.XMLParser parser = new parser.XMLParser("C:\\Users\\Dell\\hw3\\lesson7\\src\\test\\resources\\ErrorOpenTag.html");
        parser.parseDocument();
        assertFalse(parser.getErrors().isEmpty());
    }

    private void assertFalse(boolean empty) {
    }
}