
public class DynamicArray {
	private int capacity;
	private Object [] arr;
	private int size;
	
	public DynamicArray(){
		this.capacity=10;
		arr= new Object[capacity];
	}
	public DynamicArray(int capacity) {
		this.capacity=capacity;
		arr= new Object[capacity];
	}
	public int size() {
		return size;
	}
	public int capacity() {
		return capacity;
	}
	public void add(Object data) {
		if(size>=capacity) {
			grow();
		}
			arr[size]=data;
			size++;
	}
	public void replace(int index,Object data) {
		arr[index]=data;
	}
	public void insert(int index,Object data) {
		if(size>=capacity) {
			grow();
		}
		for(int i=size; i>index; i--) {
				arr[i]= arr[i-1];
			}
			arr[index]=data;
			size++;
	}
	
	public void delete(Object data) {
		for(int i=0; i<size; i++) {
			if(arr[i]==data) {
				for(int j=0; j<size-i-1; j++) {
					arr[i+j]=arr[i+j+1];
				}
				arr[size-1]=null;
				size--;
				if(size<=(int)capacity/3) {
					shrink();
				}
			}
		}

	}
	public int search(Object data) {
		for(int i=0; i<size; i++) {
			if(arr[i]==data) {
				return i; 
			}
		}
		return -1;
	}
	public void grow() {
		int newCapacity= (int)(capacity*2);
		Object [] newArr= new Object[newCapacity];
		for(int i=0; i<size; i++) {
			newArr[i]= arr[i];
		}
		capacity= newCapacity;
		arr=newArr;
	}
	public void shrink() {
		int newCapacity= (capacity/2);
		Object [] newArr= new Object[newCapacity];
		for(int i=0; i<size; i++) {
			newArr[i]= arr[i];
		}
		capacity= newCapacity;
		arr=newArr;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public String toString() {
		String s="[";
		for(int i=0; i<size; i++) {
			s=s+(arr[i]);
			if(i!=size-1) {
				s=s+", ";
			}
		}
		s=s+']';
		return s;
	}
}
