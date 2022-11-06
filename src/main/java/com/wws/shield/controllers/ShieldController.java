package com.wws.shield.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


@RestController
public class ShieldController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD!";
    }
    @GetMapping("/avengers/assemble")
    @RolesAllowed("CHAMPION")
    public String assemble() {
        return "Avengers assemble!!!";
    }

    @GetMapping("/secret-bases")
    @RolesAllowed("DIRECTOR")
    public String director() {
        List<String> liste = new ArrayList<>(Arrays.asList("biarritz", "bordeaux","la loupe", "lille", "lyon"));
        return liste.toString();
    }
}
