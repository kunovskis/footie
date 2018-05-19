package com.footie.footieapi.service.implementations;

import com.footie.footieapi.model.Player;
import com.footie.footieapi.persistence.PlayerRepository;
import com.footie.footieapi.persistence.BasePlayerRepository;
import com.footie.footieapi.service.interfaces.PlayerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService implements PlayerInterface {

    @Autowired
    private UserService userService;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private BasePlayerRepository basePlayerRepository;

    public void addPlayer(Player player) throws Exception {
        this.basePlayerRepository.save(player.basePlayer);
        player.user = this.userService.getUser();
        this.playerRepository.save(player);
    }
}
