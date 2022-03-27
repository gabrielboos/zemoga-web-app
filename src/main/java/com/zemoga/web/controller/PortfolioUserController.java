package com.zemoga.web.controller;

import com.zemoga.web.repository.dto.PortfolioUserDTO;
import com.zemoga.web.service.PortfolioService;
import com.zemoga.web.util.UtilConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.List;

@PropertySource({"classpath:/messages.properties"})
@RestController
@RequestMapping("/portfolio")
public class PortfolioUserController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/{id}")
    public ResponseEntity<PortfolioUserDTO> getUserById(@PathVariable String id) {

        var response = portfolioService.get(Long.parseLong(id));

        return ResponseEntity.ok(response);
    }

    @GetMapping("/twitter/{twitter}")
    public ResponseEntity<PortfolioUserDTO> getUserByTwitter(@PathVariable String twitter) {

        var response = portfolioService.getByTwitter(twitter);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/")
    public ResponseEntity<List<PortfolioUserDTO>> getAllUsers() {

        var response = portfolioService.getAll();

        return ResponseEntity.ok(response);
    }

    @PostMapping("/")
    public ResponseEntity<PortfolioUserDTO> createUser(@Valid @RequestBody PortfolioUserDTO user) throws URISyntaxException {

        var response = portfolioService.save(user);

        return ResponseEntity
                .created(UtilConstants.getPortfolioResponseURI())
                .body(response);
    }

    @PatchMapping("/")
    public ResponseEntity<PortfolioUserDTO> patchUser(@Valid @RequestBody PortfolioUserDTO user) {

        var response = portfolioService.patch(user);

        return ResponseEntity.ok(response);
    }


}
