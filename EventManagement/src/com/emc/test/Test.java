package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.impl.EventManagerImpl;
import com.emc.managers.impl.EventManagerImpl2;

public class Test {
	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.setId(123L);
		organizer.setName("Apple Inc");
		System.out.println(organizer.getId());
		System.out.println(organizer.getName());

		Event event = new Event(456L, "iphone 14", "Grand launch");
		System.out.println(event.getName());
		System.out.println(event.getDescription());

		EventManager emgr = new EventManagerImpl2();	// Runtime polymorphism with abstraction
		System.out.println(emgr.create(456L).getName());
	}
}
