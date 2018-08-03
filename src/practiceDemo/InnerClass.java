package practiceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class InnerClass {
        public static void main(String[] args) {
			InnerClass container=new InnerClass();
			container.put("aa",10);
			container.put("bb",20);
			container.put("cc",30);
			container.put("dd",40);
			container.put("ee",50);
			container.put("ff",60);
			InnerClass.Entry[] entrys=container.entryArrays();
			for(Entry a:entrys) {
				System.out.println(a.getName()+"--"+a.getAge());
			}
			System.out.println(container.count);
		}
	
	
	
	
	
	
	private Entry[] entrys=null;
        private int count=0;
        public InnerClass() {
        	entrys=new Entry[5];
        }
	    public void put(String name,int age) {
	    	Entry entry=new Entry();
	    	entry.setName(name);
	    	entry.setAge(age);
	    	ensureCapacity();
	    	entrys[count++]=entry;
	    }
	    public void ensureCapacity() {
	    	if(entrys.length<=count) {
	    		int capacity=entrys.length;
	    		int newCapacity=capacity*2;
	    		entrys=Arrays.copyOf(entrys, newCapacity);
	    	}
	    }
	    public Entry[] entryArrays(){
	    	return Arrays.copyOfRange(entrys, 0, count);
	    }
	
	
	
	
	
	
	
	
	  class Entry{
        	  private String name;
        	  private int age;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
        	  
        }
	     
}
