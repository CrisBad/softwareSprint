package co.unicauca.sprintapi.infrastructure.adapters.output.eventpublisher;

import org.springframework.context.ApplicationEventPublisher;

import co.unicauca.sprintapi.application.ports.output.ProductEventPublisher;
import co.unicauca.sprintapi.domain.event.ProductCreatedEvent;

public class ProductEventPublisherAdapter implements ProductEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher = null;

    @Override
    public void publishProductCreatedEvent(ProductCreatedEvent event) {
        applicationEventPublisher.publishEvent(event);
    }

}
