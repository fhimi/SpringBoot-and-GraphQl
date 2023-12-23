package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dtos.ComputerDto;
import ma.xproce.inventoryservice.service.ComputerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PersonGraphQlController {

    @Autowired
    private ComputerManager computerManager;

    @QueryMapping
    public ComputerDto getPersonById(@Argument Long id) {
        return computerManager.getPersonById(id);
    }

    // savePerson(personDto: PersonDtoInput ):PersonDto
    @MutationMapping
    public ComputerDto savePerson(ComputerDto personDto) {
        return computerManager.savePerson(personDto);
    }
}