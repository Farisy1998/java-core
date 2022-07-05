package com.emc.managers.impl;

import com.emc.entities.Event;
import com.emc.managers.EventManager;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {

		return new Event(id, "Macbook Launch", "New generation of macbooks lauch");
	}

}
