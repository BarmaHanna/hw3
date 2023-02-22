package parser;

import utilities.Iterator;

public class ProgramRunner {

    public static void main(String[] args) {
        XMLParser parser = new XMLParser("C:\\Users\\Dell\\hw3\\lesson7\\src\\test\\resources\\ErrorOpenTag.html");
        parser.parseDocument();
        if (parser.getErrors().isEmpty()) {
            System.out.println("Valid xml");
        } else {
            Iterator<String> errorsIter = parser.getErrors().iterator();
            while (errorsIter.hasNext()) {
                System.out.println(errorsIter.next());
            }
        }
    }}