package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "documentFiles",
    path = "documentFiles"
)
public interface DocumentFileRepository
    extends PagingAndSortingRepository<DocumentFile, Long> {}
