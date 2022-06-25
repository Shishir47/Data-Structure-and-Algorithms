public class Stack<E> extends Node{
	Node top;
	Node rem;
	public void initialize() {
	rem=null;
	top=null;
	count=0;
	}

	public void push(E x) {
        Node temp = new Node();
        temp.info = x;
        temp.link = top;
        top = temp;
        count++;
    }
  
    public boolean isEmpty() {
    	if(top==null)
        return true;
    	else
		return false;
    }
    public E peek()
    {
        if (!isEmpty()) {
            return (E) top.info;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
    }
  
    public E pop()
    {

        if (top != null) {
            removed=top;
            top = (top).link;
            count--;
    		return (E) removed.info;
        }
        System.out.println("Stack is Empty");
        return null;
    }
	public int size() {
		if(!isEmpty())
		return count;
		else
			return 0;
	}

}