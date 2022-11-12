package com.example.demo.controller;

import com.example.demo.entities.Pet;
import com.example.demo.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PetController {

    private PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }
    @GetMapping(value = "/pets2")
    public HttpEntity<List<Pet>> getListOfPets() {
        return new HttpEntity<List<Pet>>(petService.getAllPets());
    }
    @GetMapping(value = "/pets")
    @ResponseBody
    public String getPets() {
        return "Sonia";
    }
}
