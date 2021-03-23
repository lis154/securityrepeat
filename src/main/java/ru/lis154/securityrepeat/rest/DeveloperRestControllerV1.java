package ru.lis154.securityrepeat.rest;

import org.springframework.web.bind.annotation.*;
import ru.lis154.securityrepeat.model.Developer;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping ("/api/v1/developers")
public class DeveloperRestControllerV1 {

    private List<Developer> developers = Stream.of(
            new Developer(1L, "Ilya", "Lapshinov"),
            new Developer(2L, "Dima", "Dmitriev"),
            new Developer(3L, "Ivan", "Ivanov")).collect(Collectors.toList());



    @GetMapping
    public List<Developer> getAll(){
        return developers;
    }

    @GetMapping("/{id}")
    public Developer getById(@PathVariable Long id){
        return developers.stream().filter(developer -> developer.getId().equals(id)).findFirst().orElse(null);
    }
}
