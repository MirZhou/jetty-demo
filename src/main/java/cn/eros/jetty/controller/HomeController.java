package cn.eros.jetty.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 * 
 * <p>
 * create time: 2020-05-07 15:18
 * </p>
 * 
 * @author Eros
 */
@RestController
public class HomeController {

    @GetMapping(value = { "/", "/index" })
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("access success!!!");
    }
}