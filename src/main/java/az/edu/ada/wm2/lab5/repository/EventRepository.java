package az.edu.ada.wm2.lab5.repository;

import az.edu.ada.wm2.lab5.model.Event;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EventRepository {
    Event save(Event event);
    Optional<Event> findById(UUID id);
    List<Event> findAll();
    void deleteById(UUID id);
    boolean existsById(UUID id);

    List<Event> findByTagsContainingIgnoreCaseOrderByEventDateTime(String trim);
    List<Event> findByEventDateTimeAfterOrderByEventDateTime(LocalDateTime now);
    List<Event> findByTicketPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
    List<Event> findByEventDateTimeBetween(LocalDateTime start, LocalDateTime end);
}
