package fooddeliveryz.domain;

import fooddeliveryz.CustomerApplication;
import fooddeliveryz.domain.OrderPlaced;
import fooddeliveryz.domain.Ordercancelled;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String foodId;

    private String option;

    private String address;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        Ordercancelled ordercancelled = new Ordercancelled(this);
        ordercancelled.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = CustomerApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public void cancel() {}
}
