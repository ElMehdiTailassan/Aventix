package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mehdi on 01/03/17.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){

        return "view";
    }

}
