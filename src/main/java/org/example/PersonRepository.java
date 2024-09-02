package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    List<Person> persons = new ArrayList<>();

    public Optional<Person> findById(String id){
        for (Person p : persons){
            if(p.id().equals(id)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> findByName(String name){
        for (Person p : persons){
            if(p.id().equals(name)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public int countByGender(Gender gender){
        int count = 0;
        for(Person p : persons){
            if(p.gender().equals(gender)){
                count++;
            }
        }
        return count;
    }
}
