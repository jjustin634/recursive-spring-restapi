package com.jj.recursivesearch.binarysearch.controllers;

import com.jj.recursivesearch.binarysearch.repositorys.BinaryRepo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/binarysearch")
public class ListController {

    @RequestMapping(value = "/num", method = RequestMethod.GET)
    public List<Integer> getNumber() {
        return BinaryRepo.getNumbers();
    }

    @RequestMapping(value = "/num", method = RequestMethod.POST)
    public @ResponseBody
    void addNumbers(@RequestBody int c) {
        BinaryRepo.addNumbers(c);
    }
}

