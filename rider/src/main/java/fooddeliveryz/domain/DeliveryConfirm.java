package fooddeliveryz.domain;

import fooddeliveryz.domain.*;
import fooddeliveryz.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryConfirm extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;

    public DeliveryConfirm(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryConfirm() {
        super();
    }
}
