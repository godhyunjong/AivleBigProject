package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DocumentFileHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DocumentFile>> {

    @Override
    public EntityModel<DocumentFile> process(EntityModel<DocumentFile> model) {
        return model;
    }
}
