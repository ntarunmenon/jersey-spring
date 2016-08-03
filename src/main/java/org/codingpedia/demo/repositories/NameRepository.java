package org.codingpedia.demo.repositories;

import org.codingpedia.demo.rest.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Name, Long> {

}
