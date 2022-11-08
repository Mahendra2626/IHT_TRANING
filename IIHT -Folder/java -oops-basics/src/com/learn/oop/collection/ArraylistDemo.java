package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList<String> ParticipantList = new ArrayList<>();
		ParticipantList.add("Nisha");
		ParticipantList.add("mahi");
		ParticipantList.add("mani");
		ParticipantList.add("Niru");
		
		Iterator itr = ParticipantList.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}
	
}
