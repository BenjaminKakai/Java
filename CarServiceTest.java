package com.codility.external;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

public class CarServiceTest {

    @Mock
    private CarRepository carRepository;

    private CarService carService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        carService = new CarService(carRepository);
    }

    @Test
    public void findAll_ShouldReturnAllCars() {
        Car car = new Car("1", "Test Car");
        when(carRepository.findAll()).thenReturn(Flux.just(car));

        StepVerifier.create(carService.findAll())
                .expectNext(car)
                .verifyComplete();
    }

    @Test
    public void findById_ShouldReturnCarWhenExists() {
        Car car = new Car("1", "Test Car");
        when(carRepository.findById("1")).thenReturn(Mono.just(car));

        StepVerifier.create(carService.findById("1"))
                .expectNext(car)
                .verifyComplete();
    }

    @Test
    public void create_ShouldSaveNewCar() {
        Car car = new Car("1", "Test Car");
        when(carRepository.save(any(Car.class))).thenReturn(Mono.just(car));

        StepVerifier.create(carService.create("Test Car"))
                .expectNext(car)
                .verifyComplete();
    }

    @Test
    public void update_ShouldUpdateCarWhenExists() {
        Car existingCar = new Car("1", "Test Car");
        Car updatedCar = new Car("1", "Updated Car");
        when(carRepository.findById("1")).thenReturn(Mono.just(existingCar));
        when(carRepository.save(any(Car.class))).thenReturn(Mono.just(updatedCar));

        StepVerifier.create(carService.update("1", "Updated Car"))
                .expectNext(updatedCar)
                .verifyComplete();
    }

    @Test
    public void delete_ShouldDeleteCarWhenExists() {
        Car car = new Car("1", "Test Car");
        when(carRepository.findById("1")).thenReturn(Mono.just(car));
        when(carRepository.deleteById("1")).thenReturn(Mono.empty());

        StepVerifier.create(carService.delete("1"))
                .verifyComplete();
    }
}
