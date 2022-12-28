public interface List<E> {
	public void add(E value);
   public String toString();
	
   public int size();
   public E get(int index);
   public int indexOf(E value);
	
   public void add(int index, E value);
	public void remove(int index);
   
   public boolean equals(Object object);
   public void insertList(int index, LinkedList<E> list); 
}