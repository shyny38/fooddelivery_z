package fooddeliveryz.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "GetAddress_table")
@Data
public class GetAddress {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
