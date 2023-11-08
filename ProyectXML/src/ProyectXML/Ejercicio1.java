package ProyectXML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Ruta del archivo XML
        String filePath = "/restaurant.xml";

        try {
            // Crear un objeto DocumentBuilderFactory y DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsear el archivo XML
            File xmlFile = new File(filePath);
            Document document = builder.parse(xmlFile);

            // Obtener el elemento raíz del documento
            Element rootElement = document.getDocumentElement();

            // Obtener el desayuno
            NodeList breakfastList = rootElement.getElementsByTagName("breakfast");
            Element breakfastElement = (Element) breakfastList.item(0);
            NodeList breakfastItems = breakfastElement.getElementsByTagName("item");

            // Mostrar los elementos del desayuno
            System.out.println("Desayuno:");
            for (int i = 0; i < breakfastItems.getLength(); i++) {
                Element item = (Element) breakfastItems.item(i);
                String name = item.getElementsByTagName("name").item(0).getTextContent();
                String price = item.getElementsByTagName("price").item(0).getTextContent();
                System.out.println("- " + name + ": " + price);
            }

            // Obtener el menú de almuerzo
            NodeList lunchMenuList = rootElement.getElementsByTagName("lunchMenu");
            Element lunchMenuElement = (Element) lunchMenuList.item(0);
            NodeList lunchItems = lunchMenuElement.getElementsByTagName("item");

            // Mostrar los elementos del menú de almuerzo
            System.out.println("\nMenú de almuerzo:");
            for (int i = 0; i < lunchItems.getLength(); i++) {
                Element item = (Element) lunchItems.item(i);
                String name = item.getElementsByTagName("name").item(0).getTextContent();
                String price = item.getElementsByTagName("price").item(0).getTextContent();
                System.out.println("- " + name + ": " + price);
            }

            // Obtener la cena
            NodeList dinnerList = rootElement.getElementsByTagName("dinner");
            Element dinnerElement = (Element) dinnerList.item(0);
            NodeList dinnerItems = dinnerElement.getElementsByTagName("item");

            // Mostrar los elementos de la cena
            System.out.println("\nCena:");
            for (int i = 0; i < dinnerItems.getLength(); i++) {
                Element item = (Element) dinnerItems.item(i);
                String name = item.getElementsByTagName("name").item(0).getTextContent();
                String price = item.getElementsByTagName("price").item(0).getTextContent();
                System.out.println("- " + name + ": " + price);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

