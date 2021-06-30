package com.stradtman.petclinicv2.service;

import com.stradtman.petclinicv2.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
