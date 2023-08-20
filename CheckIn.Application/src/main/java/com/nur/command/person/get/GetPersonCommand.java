package com.nur.command.person.get;

import an.awesome.pipelinr.Command;
import com.nur.dtos.PersonDTO;
import org.springframework.stereotype.Component;

public class GetPersonCommand implements Command<PersonDTO> {
    String personId;

    public GetPersonCommand(String personId) {
        this.personId = personId;
    }
}
