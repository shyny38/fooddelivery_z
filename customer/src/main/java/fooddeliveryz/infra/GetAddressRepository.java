package fooddeliveryz.infra;

import fooddeliveryz.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "getAddresses",
    path = "getAddresses"
)
public interface GetAddressRepository
    extends PagingAndSortingRepository<GetAddress, Long> {}
