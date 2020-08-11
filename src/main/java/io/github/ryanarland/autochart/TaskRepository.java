package io.github.ryanarland.autochart;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.web.bind.annotation.GetMapping;
                                            // TODO: nothing. The bug was that Meeple and Long were switched around. 
                                            // it's the entity and then the key, not the key then entity
public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findByName(String name);
}