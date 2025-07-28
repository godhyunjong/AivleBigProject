package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FamilyMemberHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FamilyMember>> {

    @Override
    public EntityModel<FamilyMember> process(EntityModel<FamilyMember> model) {
        return model;
    }
}
