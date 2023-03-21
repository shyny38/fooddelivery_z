package fooddeliveryz.domain;

import fooddeliveryz.domain.*;
import fooddeliveryz.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordercancelled extends AbstractEvent {

    private Long id;
    private String orderId;

    public Ordercancelled(Order aggregate) {
        super(aggregate);
    }

    public Ordercancelled() {
        super();
    }
}
