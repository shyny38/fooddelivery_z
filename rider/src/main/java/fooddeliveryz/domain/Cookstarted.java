package fooddeliveryz.domain;

import fooddeliveryz.domain.*;
import fooddeliveryz.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cookstarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String address;
    private String status;
}
