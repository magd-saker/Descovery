/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eureka_client.controller;

/**
 *
 * @author magds
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class homeController {

    @Value("${spring.profiles}")
    private String zone;

    @GetMapping("/ping")
    public String ping() {
        return "I'm in zone " + zone;
    }
}
