package fooddeliveryz.infra;

import fooddeliveryz.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CookingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cooking>> {

    @Override
    public EntityModel<Cooking> process(EntityModel<Cooking> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/acceptor-or-reject"
                )
                .withRel("acceptor-or-reject")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/start")
                .withRel("start")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/finish")
                .withRel("finish")
        );

        return model;
    }
}
