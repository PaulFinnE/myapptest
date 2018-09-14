package local.example.myappy.myappspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
	// Logger
	private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @Autowired
    private DbService dbService;

    @RequestMapping("/search")
    public Entity search(@RequestParam(value="myvalue1", defaultValue="1") String myvalue1,
                                 @RequestParam(value="myvalue2", defaultValue="content") String myvalue2 ) {

        log.info("searched");
        return new Entity(Long.getLong(myvalue1, 0), myvalue2);
    }
}
