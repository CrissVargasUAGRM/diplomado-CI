package com.nur.command.person.get;

import an.awesome.pipelinr.Command;
import com.nur.dtos.PersonDTO;
import com.nur.factories.persons.IPersonaFactory;
import com.nur.model.Personas;
import com.nur.repositories.IPersonRepository;
import com.nur.util.PersonMapper;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetPersonHandler implements Command.Handler<GetPersonCommand, PersonDTO>{

    private final IPersonRepository personRepository;

    private final IPersonaFactory personaFactory;

    public GetPersonHandler(IPersonRepository personRepository, IPersonaFactory personaFactory) {
        this.personRepository = personRepository;
        this.personaFactory = personaFactory;
    }

    @Override
    public PersonDTO handle(GetPersonCommand getPersonCommand) {
        Personas person = personRepository.getById(UUID.fromString(getPersonCommand.getPersonId()));
        if(person == null){
            return null;
        }
        return PersonMapper.from(person);
    }
}
