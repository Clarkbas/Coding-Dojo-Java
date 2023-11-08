package ListAssigment;

public class SinglyLinkedList {
	public Node head;
	public int data;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

	public void remove() {
        if (head == null) {
            System.out.println("La lista está vacía. No se puede eliminar ningún nodo.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
		
	}

	public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " Mismo orden ");
            current = current.next;
        }
        System.out.println(); 
		
	}

	public Node find(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;
            }
            current = current.next;
        }
        return null;
		
	}
    public void removeAt(int n) {
        if (head == null) {
            System.out.println(" ");
            return;
        }

        if (n == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < n) {
            current = current.next;
            count++;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("No existe un nodo después del nodo " + n + ".");
        }
    }


}


