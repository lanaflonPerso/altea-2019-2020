@RestController
public class PokemonController {
    @Autowired
    private PokemonRepository repository;

    @RequestMapping("/pokemon-types")
    public Iterable<Pokemon> getAllPokmeons() {
        return repository.findAll();
    }
}


@RestController
@RequestMapping("/api")
public class PokemonController {

    @GetMapping("/pokemon-types")
    public Iterable<Pokemon> getAllPokemons() {
        ...
    }
}

@RestController
@RequestMapping("/api")
public class PokemonController {

    @GetMapping("/pokemon-types/{id}")
    public Pokemon getPokemon(@PathVariable String id) {
        ...
    }
}


@RestController
@RequestMapping("/api")
public class PokemonController {

    @GetMapping("/pokemon-types")
    public Iterable<Pokemon> getAllPokemons(@RequestParam String orderBy) {
        ...
    }
}

@RestController
@RequestMapping("/api")
public class TrainerController {

    @PostMapping("/trainers")
    public Trainer createTrainer(@RequestBody Trainer trainer) {
        ...
    }
}