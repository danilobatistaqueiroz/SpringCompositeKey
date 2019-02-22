package br.com.labs.services;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "area", path = "area")
public interface AreaRepository extends PagingAndSortingRepository<Area, Long> {

}
