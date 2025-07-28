package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "customerReadmodels",
    path = "customerReadmodels"
)
public interface CustomerReadmodelRepository
    extends PagingAndSortingRepository<CustomerReadmodel, Long> {}
