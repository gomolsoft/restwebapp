package mvc;

/**
 * Created by sandro on 15.04.15.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
    @RequestMapping("/home")
    public String test()
    {
        return "view";
    }
}
