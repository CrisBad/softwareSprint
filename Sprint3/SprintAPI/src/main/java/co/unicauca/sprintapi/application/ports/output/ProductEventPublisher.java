package co.unicauca.sprintapi.application.ports.output;

import co.unicauca.sprintapi.domain.event.ProductCreatedEvent;

public interface ProductEventPublisher {
	void publishProductCreatedEvent(ProductCreatedEvent event);
}
