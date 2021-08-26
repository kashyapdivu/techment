package com.techment.day7.arraylistpackage;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		int a =1;
        ArrayList obj = new ArrayList();
        System.out.println("Size before adding element:" + obj.size());
        obj.add(1);
        obj.add("sachine");
        obj.add(24.50);
        System.out.println("Size before adding element:" + obj);
        System.out.println("Size after adding element:" + obj.size());
        
        obj.remove(1);
        System.out.println("remove index 1 value");
        System.out.println(obj);
        
        obj.add(1,55);
        System.out.println("Add 55 at inex 1");
        System.out.println(obj);
        
       obj.remove(Integer.valueOf(55)); 
       System.out.println(obj);
       
       obj.add(1,"Divya");
       System.out.println("elemnt at ist index: "+obj.get(1));
       
	}

}
