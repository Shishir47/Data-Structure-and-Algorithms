public class LinkedListType{
		private int count=0;
		private Node first=null;
		private Node last=null;
		boolean found=false;
		String find;
		Node f;
		
		public  LinkedListType() {
			count=0;
			last=null;
		}
		public void initalizeList() {
			count=0;
			last=null;	
		}
		public boolean isEmptyList() {
			if(count==0)
			{
			return true;
			}
			else {
				return false;
			}
		}
		public int length() {
			if(!isEmptyList())
			return count;
			else
				return 0;
		}
		public String toString() {
		StringBuilder sb= new StringBuilder();
		first=last.getLink();
		Node i=first;
		do {
			if(i== first) {
				sb.append(i.getInfo());
			}
			else {
				sb.append("," + i.getInfo());
			}
			i=i.getLink();
			
		}while(i!=first);
		
		return sb.toString();
		}

		public Node getBack() {
			if(!isEmptyList()) {
				return last;
			}
			else {
				return null;
			}	
		}
		public void insertFirst(int newItem) {
			Node newNode= new Node(newItem,first);
			first= newNode;
			count++;
			if(last==null) {
				last=newNode;
			}
		}
		public void insertLast(int newItem) {
			Node newNode= new Node(newItem,first);
			if(first==null) {
				first=last=newNode;
			}
			else {
				last.setLink(newNode);
				last=newNode;
				count++;
			}
		}

		public void search(int searchItem) {
			
			for(Node i=first;i!=null;i=i.getLink()) {
				if(i.getInfo()==searchItem) {
					f=i;
					found= true;
					find="Found it";
					break;
				}
				else {
				found= false;
				find="Not Found";
				}
			}

		}



		
}
