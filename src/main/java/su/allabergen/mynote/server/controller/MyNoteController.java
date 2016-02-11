package su.allabergen.mynote.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import su.allabergen.mynote.server.entity.MyNote;

import java.util.Date;

/**
 * Created by Rabat on 11.02.2016.
 */
@RestController
@RequestMapping("/mynote")
public class MyNoteController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public MyNote getMynote() {
        return createMockMyNote();
    }

    private MyNote createMockMyNote() {
        MyNote myNote = new MyNote();
        myNote.setId(1);
        myNote.setMynoteDate(new Date());
        myNote.setTitle("First Note");

        return myNote;
    }
}
