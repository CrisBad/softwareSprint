package co.unicauca.sprintapi.infrastructure.adapters.input.eventlistener;

import org.springframework.context.event.EventListener;

import co.unicauca.sprintapi.domain.event.ProductCreatedEvent;

public class ProductEventListenerAdapter {

    @EventListener
    public void handle(ProductCreatedEvent event){
        //log.info("Product created with id " + event.getId() + " at " + event.getDate());
    }

}
