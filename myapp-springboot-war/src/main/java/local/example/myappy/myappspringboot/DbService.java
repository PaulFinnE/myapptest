package local.example.myappy.myappspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DbService {
    // Logger
    private static final Logger log = LoggerFactory.getLogger(DbService.class);

    public String dbSearch () {
        return "DBServiceReturnValueObjectThing";
    }
}
