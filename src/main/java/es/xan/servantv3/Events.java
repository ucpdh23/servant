package es.xan.servantv3;

import es.xan.servantv3.messages.NewStatus;
import es.xan.servantv3.messages.ParrotMessageReceived;
import es.xan.servantv3.messages.Person;
import es.xan.servantv3.messages.Room;
import es.xan.servantv3.messages.Temperature;
import es.xan.servantv3.network.RouterPageManager.Device;

/**
 * List of events 
 * @author alopez
 *
 */
public enum Events implements Event {
	PARROT_MESSAGE_RECEIVED(ParrotMessageReceived.class),
	PARRONT_AVAILABLE(null),
	
	TEMPERATURE_RECEIVED(Temperature.class),
	NO_TEMPERATURE_INFO(Room.class),
	
	NEW_NETWORK_DEVICES_MESSAGE(Device.class),
	REM_NETWORK_DEVICES_MESSAGE(Device.class),
	
	PERSON_AT_HOME(Person.class),
	PERSON_LEAVE_HOME(Person.class),
	
	BOILER_SWITCHED(NewStatus.class)
	;
	
	
	private Class<?> mBeanClass;

	private Events(Class<?> beanClass) {
		this.mBeanClass = beanClass;
	}

	@Override
	public Class<?> getPayloadClass() {
		return this.mBeanClass;
	}
	

}
