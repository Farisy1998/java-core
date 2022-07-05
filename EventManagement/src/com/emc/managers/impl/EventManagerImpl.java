package com.emc.managers.impl;

import com.emc.entities.Event;
import com.emc.managers.EventManager;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, null, null);
	}

}
