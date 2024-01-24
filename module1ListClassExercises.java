class Node {
    int data; 
    Node next;  
    Node(int d) // Constructor
    { 
            data = d; 
            next = null; 
    } 
} 

class LUCLinkedList {// a Singly Linked List
 Node head; // head of list

 public void insert (int data) // Method to insert a new node
 {
     Node new_node = new Node(data); // Create a new node with given data
     new_node.next = null;
     if (head == null) { // If the Linked List is empty, then make the new node as head
         head = new_node;
     } else {// Else traverse till the last node and insert the new_node there
         Node last = head;
         while (last.next != null) {
             last = last.next;
         }
         last.next = new_node; // Insert the new_node at last node
     }
 }

 public void printList() // Method to print the LinkedList.
 {
     Node currNode = head;
     System.out.print("LinkedList: ");
     while (currNode != null) { // Traverse through the LinkedList
         System.out.print(currNode.data + " "); // Print the data at current node
         currNode = currNode.next; // Go to next node
     }
 }

//  need to finish
 public int sumListValues(){
    // create a variable to store the sum of the values 
    int sumOfList = 0;
    // loop through and get values from list
    
    // return the sum as an integer 
    return sumOfList;
 } // method that adds all the data values stored in a list 

 public int maxListValue(){
    return 0;
 } // method that finds the maxium (data) element of a list 

 public void printEvenIndex(){

 } //method that prints only the elements with even index

 public void remove(int number){

 } // method that removes all the elements of a list that match an input value
}

// public class LUCLinkedListMain {
public class module1ListClassExercises {
 public static void main(String[] args)
 {
     LUCLinkedList list = new LUCLinkedList();/* Start with the empty list. */
     // Insert the values
     list.insert(2);
     list.insert(2);
     list.insert(1);
     list.insert(2);
     list.insert(3);
     list.insert(4);
     list.insert(2);
     list.insert(2);
     list.printList(); // Print the LinkedList
 }
}