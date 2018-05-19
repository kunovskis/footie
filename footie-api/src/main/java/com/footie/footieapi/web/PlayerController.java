package com.footie.footieapi.web;

import com.footie.footieapi.model.Player;
import com.footie.footieapi.model.User;
import com.footie.footieapi.service.implementations.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping(value="/player/save", consumes = MediaType.ALL_VALUE, produces = "application/json")
    public <T> T addPlayer(@RequestBody Player player) {
        try {
            this.playerService.addPlayer(player);
        } catch (Exception ex){
            return (T) ex.getMessage();
        }
        return (T) player;
    }
}
