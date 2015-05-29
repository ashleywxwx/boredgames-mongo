package com.recursivechaos.boredgames.repository;

import com.recursivechaos.boredgames.domain.GameCard;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Andrew Bell 5/28/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

public interface GameCardRepository extends MongoRepository<GameCard, String> {

}
