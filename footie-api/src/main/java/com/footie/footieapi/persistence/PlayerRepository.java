package com.footie.footieapi.persistence;

import com.footie.footieapi.model.Player;
import com.footie.footieapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PlayerRepository extends
        CrudRepository<Player, Long>{

}
