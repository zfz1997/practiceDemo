package practiceDemo;

import java.util.Arrays;

public class MyContainer<T> implements IContainer<T>{
	    private Object data[]=null;
	    private int index=0;
	    public static void main(String[] args) {
			MyContainer<String> a=new MyContainer<String>();
			a.add("aa");
			a.add("bb");
			a.add("cc");
			System.out.println(a.get(0));
			System.out.println(a.get(1));
			System.out.println(a.getSize());
		}
	    
	    
	    public int getSize() {
	    	return index;
	    }
	    
	    
	    public MyContainer(){
	    	data=new Object[2];
	    }
	    public void add(T obj) {
	    	 ensureCapacity();
	    	 data[index++]=obj;
	    }
	    public void ensureCapacity() {
	    	if(data.length<=index) {
	    		int capacity=data.length;
	    		int newCapacity=capacity*2;
	    		data=Arrays.copyOf(data, newCapacity);
	    	}
	    	
	    }
	    public T get(int index) {
	    	return (T)data[index];
	    }
	    
}








 interface IContainer<T> {
       public void add(T obj);
       public int getSize();
       public T get(int index);
}
