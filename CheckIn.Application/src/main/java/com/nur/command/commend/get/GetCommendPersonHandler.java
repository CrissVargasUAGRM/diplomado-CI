package com.nur.command.commend.get;

import an.awesome.pipelinr.Command;
import com.nur.dtos.CommendPersonDTO;
import com.nur.model.CommendPerson;
import com.nur.repositories.ICommendPersonRepository;
import com.nur.util.CommendMapper;
import com.nur.util.CommendPersonMapper;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetCommendPersonHandler implements Command.Handler<GetCommendPersonQuery, CommendPersonDTO> {

    private final ICommendPersonRepository commendPersonRepository;

    public GetCommendPersonHandler(ICommendPersonRepository commendPersonRepository) {
        this.commendPersonRepository = commendPersonRepository;
    }

    @Override
    public CommendPersonDTO handle(GetCommendPersonQuery command) {
        CommendPerson commend = commendPersonRepository.getById(UUID.fromString(command.commandPersonId));
        if(commend == null) return null;
        return CommendPersonMapper.from(commend);
    }
}
