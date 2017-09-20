package iot.core.services.device.registry.serialization;

import org.apache.qpid.proton.amqp.messaging.Section;

public interface AmqpSerializer {
    public Section encode(Object object);

    public <T> T decode(Section section, Class<T> clazz);
}
