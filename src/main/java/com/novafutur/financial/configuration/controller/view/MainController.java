package com.novafutur.financial.configuration.controller.view;

import com.novafutur.financial.configuration.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class MainController extends BaseController {

    public final Logger log = Logger.getLogger(this.getClass().getName());

    @ResponseBody
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(String txt){

        log.info(txt + "MSG: ");

        return "Echo: " + txt;

    }
}
