package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.repositories.ComputerRepository;
import ma.xproce.inventoryservice.dtos.ComputerDto;
import ma.xproce.inventoryservice.mappers.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComputerManagerImpl implements ComputerManager {


    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto getPersonById(Long id) {
        return computerMapper.fromComputerToComputerDto(computerRepository.findById(id).get());
    }

    @Override
    public ComputerDto savePerson(ComputerDto computerDto) {
        return computerMapper.fromComputerToComputerDto(computerRepository.save(computerMapper.fromComputerDtoToComputer(computerDto)));

    }


}
