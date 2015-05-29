package com.recursivechaos.boredgames.repository;

import com.recursivechaos.boredgames.domain.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Andrew Bell 5/28/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

public interface GameRepository extends MongoRepository<Game, String> {

}
