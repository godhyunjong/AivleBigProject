package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "familyMembers",
    path = "familyMembers"
)
public interface FamilyMemberRepository
    extends PagingAndSortingRepository<FamilyMember, Long> {}
