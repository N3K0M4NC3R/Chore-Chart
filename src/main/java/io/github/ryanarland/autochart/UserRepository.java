package io.github.ryanarland.autochart;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.web.bind.annotation.GetMapping;
                                            // TODO: nothing. The bug was that Meeple and Long were switched around. 
                                            // it's the entity and then the key, not the key then entity
public interface UserRepository extends CrudRepository<User, Long> { 
    
    // @GetMapping("/save")
    // public Meeple saveMeeple();    
    
    // @GetMapping("/saveAll")
    // public Iterable<Meeple> saveAllMeeple();

    // @GetMapping("/findOne")
    // public void findMeepleById();

    // @GetMapping("/findOne")
    // public void find(); 

    // @GetMapping("/deleteCustomer")
    // public void deleteCustomer();

    List<User> findByName(String name);

    List<User> findByRole(String role);


}