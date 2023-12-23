package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dtos.ComputerDto;

public interface ComputerManager {
    public ComputerDto getPersonById(Long id);
    public ComputerDto savePerson(ComputerDto personDto);
}
