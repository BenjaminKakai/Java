package com.codility.external;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Flux<Car> findAll() {
        return carRepository.findAll();
    }

    public Mono<Car> findById(String id) {
        return carRepository.findById(id);
    }

    public Mono<Car> create(String name) {
        Car newCar = new Car(null, name);
        return carRepository.save(newCar);
    }

    public Mono<Car> update(String id, String name) {
        return carRepository.findById(id)
                .flatMap(car -> {
                    car.setName(name);
                    return carRepository.save(car);
                });
    }

    public Mono<Void> delete(String id) {
        return carRepository.findById(id)
                .flatMap(car -> carRepository.deleteById(car.getId()))
                .then();
    }
}
