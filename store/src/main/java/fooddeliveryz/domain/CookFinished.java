package fooddeliveryz.domain;

import fooddeliveryz.domain.*;
import fooddeliveryz.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;

    public CookFinished(Cooking aggregate) {
        super(aggregate);
    }

    public CookFinished() {
        super();
    }
}
