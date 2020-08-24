package org.springframework.samples.petclinic.graphql.types;

import org.springframework.samples.petclinic.model.Owner;

/**
 * @author Nils Hartmann (nils@nilshartmann.net)
 */
public class AddOwnerPayload extends AbstractOwnerPayload {

    public AddOwnerPayload(Owner owner) {
        super(owner);
    }
}
