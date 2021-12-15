package br.itau.spring.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring.model.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Long> {
    
}
