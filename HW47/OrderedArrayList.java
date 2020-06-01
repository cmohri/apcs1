/*
Clara Mohri
APCS1 Pd8
2017-12-5
HW#47: ascending
*/

import java.util.ArrayList;

public class OrderedArrayList extends ArrayList<Comparable>{

    //the constructor is the same as for ArrayList
    public OrderedArrayList(){
	super();
    }

    //Adds Comparable c into ArrayList if the index allows it to remain
    //in ascending order
    //else: throws an error message
    public void add(int index, Comparable c){
	if (size() == 0)
	    super.add(c);
	else if (c.compareTo(get(index)) >= 0){
	    throw new ClassCastException("index alters ascending order or array");
	}
	else if (index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	else 
	    super.add(index, c);
	
    }

    //adds Comparable c into ArrayList such that it remains in  ascending order
    public boolean add(Comparable c){
	if (size() == 0)
	    super.add(c);

	else{
	    int ctr = 0;
	    while (ctr < size()){
		if (c.compareTo(get(ctr)) <= 0)
		    break;
		ctr += 1;
	    }
	    super.add(ctr, c);
	}
	return true;
    }


    public static void main(String[] args){
	OrderedArrayList o = new OrderedArrayList();
	System.out.println("Instantiating OrderedArrayList o...");
	System.out.println(o);
	o.add(0,5);
	o.add(0, 1);
	o.add(1, 2);
	o.add(2, 4);
	o.add(10);
	System.out.println("o after several additions...");
	System.out.println(o);


	OrderedArrayList n = new OrderedArrayList();
	System.out.println("Instantiating OrderedArrayList n...");
	System.out.println(n);
	n.add(3);
	n.add(4);
	n.add(2);
	n.add(0);
	n.add(10);
	System.out.println("n after several additions...");
	System.out.println(n);

    }

}