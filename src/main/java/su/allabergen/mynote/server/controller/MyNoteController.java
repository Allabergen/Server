package su.allabergen.mynote.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rabat on 11.02.2016.
 */
@Controller
@RequestMapping("/mynote")
public class MyNoteController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getMynote(ModelMap model) {
        return "My Note";
    }
}
