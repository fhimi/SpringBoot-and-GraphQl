package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Computer;
import ma.xproce.inventoryservice.dtos.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public ComputerDto fromComputerToComputerDto(Computer computer) {
        return this.modelMapper.map(computer, ComputerDto.class);
    }

    public Computer fromComputerDtoToComputer(ComputerDto personDto) {
        return this.modelMapper.map(personDto, Computer.class);
    }
}
