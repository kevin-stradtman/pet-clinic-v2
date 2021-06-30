package com.stradtman.petclinicv2.service;

import com.stradtman.petclinicv2.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
