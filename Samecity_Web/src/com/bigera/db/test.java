package com.bigera.db;

import java.util.ArrayList;
import java.util.List;
public class test {
	public static void main(String[] args) {
		Room room = new Room();
		
		List list = new ArrayList();
		for(int i=0;i<5;i++)
		{
			room.setId(i);
			list.add(room);
			System.out.println(list);
//			for(int j=0;j<list.size();j++){
//				System.out.println(list.get(j));	
//			}
		
		}
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
	}
}
