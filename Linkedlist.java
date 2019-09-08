
public class Linkedlist {
	private static class Node<AnyType>
	{
	   private AnyType data;
	   private Node<AnyType> next;

	   public Node(AnyType data)
	   {
	      this.data = data;
	      //this.next = next;
	   }
	   
	   public void  addFirstt(AnyType item)
	   {
		   
	      Node<AnyType> head = new Node<AnyType>(item);
	      Node n=this;
	      while(n.next!=null){
	    	  n=n.next;
	    	  n.next=head;
	      }
	   }
	public static void main(String[] args){
		Node<Integer> ll = new Node<Integer>(null);
		ll.addFirstt(5);
		ll.addFirstt(2);
	}
	/*public void addFirst(AnyType item)
	{
	Node  head = new Node(item,null);
	}*/
	
	public void additems(AnyType nnn){
		
		if(.head== null){
			addFirst(nnn);
		}
		else{
			
	Node	temp = 	addFirst.head;
	temp=temp.link
			while(temp.link!= null){
				temp=temp.link;
				temp.link=nnn;
			}
		}
		
		
	}
	 public void insertelement(int dat){
		 
	 }
	
	}
}
