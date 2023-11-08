package ListAssigment;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(2);
        sll.add(4);
        sll.add(6);
        sll.add(8);
        sll.add(10);
        sll.add(12);
        sll.remove();
        sll.printValues();
        //Saca un valor del sll como sacar un valor del array
        sll.removeAt(0);


        //Total de sll
        sll.display();
        
        // Muestra en pantalla el nodo encontrado como un array
        Node foundNode = sll.find(6);
        if (foundNode != null) {
            System.out.println("Nodo encontrado: " + foundNode.data);
        } else {
            System.out.println("No se encontró el nodo con el valor buscado.");
        }
        


    }
}


