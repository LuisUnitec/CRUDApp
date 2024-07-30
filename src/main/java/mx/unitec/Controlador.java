package mx.unitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    @Autowired
    private PasajeroDao pasajeroDao;

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
