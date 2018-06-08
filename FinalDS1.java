
class Node1 {
	int data;
	Node1 next;
}

class LinkedList1 {

	Node1 head;

	public void insert(int data) {

		Node1 node = new Node1();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node1 n = head;

			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}
	}

	public void insertAtStart(int data) {

		Node1 node = new Node1();
		node.data = data;
		node.next = head;
		head = node;

	}

	public void insertAtPosition(Node1 pre_node, int data) {

		Node1 node = new Node1();
		node.data = data;

		if (pre_node == null) {
			System.out.println("Pre node cannot ne null");
		}

		node.next = pre_node.next;
		pre_node.next = node;

	}

	public void insertAtEnd(int data) {
		Node1 node = new Node1();
		node.data = data;

		if (head == null) {
			head = node;
		}

		node.next = null;
		Node1 n = head;

		while (n.next != null) {
			n = n.next;
		}
		n.next = node;
	}

	public void show() {

		Node1 node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}

public class FinalDS1 {
	public static void main(String[] args) {
		LinkedList1 list1 = new LinkedList1();
		list1.insert(5);
		list1.insert(3);
		list1.insert(91);
		list1.show();
		list1.insertAtStart(1);
		list1.show();
		list1.insertAtEnd(1);
		list1.show();
		list1.insertAtPosition(new Node1(), 2);
		list1.show();
	}
}
