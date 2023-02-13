public class LinkedList
{
	class Node {
		Object info; // éléments, item de donnée
		Node next; // fait reference au Node next dans la liste
		Node( Object ob ) // constructeur
		{
			info = ob;
			next = null;
		}
	}

	Node head; 
	Node current; 
	int numberOfElements; 

	public void initList() {
		head = new Node(null);
		current = head;
		numberOfElements = 0;
	}

	/**
	 * Creates a list inserting values from 0 to n by increment.
	 * 
	 * @param n
	 * @param increment
	 */
	public void createList(int n, int increment) {
		initList();
		for(int i = n; i >= increment; i = i - increment) {
			this.insertHead(i);
		}
	}

	/**
	 * Insert a new head an shift the list.
	 * @param ob
	 */
	public void insertHead(Object ob) {
		current = head;
		head = new Node(ob); // Creating a new head.
		head.next = current; // Linking it the the former head.

		numberOfElements++;
	}

	/**
	 * Insert an objet right after another one.
	 * @param obNew
	 * @param ob
	 */
	public void insertAfter(Object obNew, Object ob) {
		current = head;
		while(current.next != null) {

			// node_a - > node_b
			// node_a -> newNode -> node_b
			// current is node_a in this exemple.
			if (current.info == ob) {
					Node newNode = new Node(obNew); // Create a new node.
					newNode.next = current.next;  // Linking it to node_a's next: node_b
					current.next = newNode; // node's a next becomes newNode
			}
			
			current = current.next; // aka the new node.
		}
		
		numberOfElements++;
	}

	/**
	 * Deletes the head.
	 * @return
	 */
	public Object deleteHead() {
		Node toDelete = head;
		Object toDeleteInfo = head.info;

		// the head becomes the former head's next node.
		head = toDelete.next;

		numberOfElements--;
		return toDeleteInfo;
	}

	/**
	 * Deletes the first node after an object.
	 * @param ob
	 * @return
	 */
	public Object deleteAfter(Object ob) {
		current = head;
		while(current.next != null) {
			// node_a -> toDelete -> node_b
			// node_a -> node_b
			if (current.info == ob) {
				// the node to delete must link the node
				// right after itself.
				// Therefore the next's next.
				current.next = (current.next).next; 
				numberOfElements--;
				return current.next.info;
			}

			current = current.next;
		}
		return null;
	}

	/**
	 * Assert wether or not the list is empty.
	 * @return true or false depending the the state of the list.
	 */
	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	/**
	 * Gives the lengh of the list
	 * @return the lengh of the list.
	 */
	public int lengh() {
		return numberOfElements;
	}

	/**
	 * Prints a list to console.
	 */
	public void printList() {
		current = head;
		while(current.next != null) {
			System.out.print(current.info + " -> ");
			current = current.next;
		}
		System.out.print(current.info);
	}
}