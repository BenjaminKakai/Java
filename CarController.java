package com.codility.external;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public Publisher<ResponseEntity<Flux<Car>>> findAll() {
        return Mono.just(ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(carService.findAll()));
    }

    @GetMapping("/{id}")
    public Publisher<ResponseEntity<Mono<Car>>> findById(@PathVariable String id) {
        return Mono.just(ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(carService.findById(id)));
    }

    @PostMapping
    public Mono<ResponseEntity<Car>> create(@RequestBody Car car) {
        return carService.create(car.getName())
                .map(savedCar -> ResponseEntity.created(URI.create("/car/" + savedCar.getId()))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(savedCar));
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> deleteById(@PathVariable String id) {
        return carService.delete(id)
                .then(Mono.just(ResponseEntity.ok().<Void>build()));
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<Car>> updateById(@PathVariable String id, @RequestBody Car car) {
        return carService.update(id, car.getName())
                .map(updatedCar -> ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(updatedCar));
    }
}
