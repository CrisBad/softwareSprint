package co.unicauca.sprintapi.domain.event;

import java.time.LocalDateTime;

public class ProductCreatedEvent {
	private Long id;

    private LocalDateTime date;

    public ProductCreatedEvent(Long id) {
        this.id = id;
        this.date = LocalDateTime.now();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
    
    
}
