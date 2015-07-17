/**
 * Created by Andrew Bell 7/16/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.boredgames.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void testGame() throws Exception {
        String TITLE = "Title";

        Game game = new Game();
        game.setDescription("description");
        game.setTitle(TITLE);

        assertEquals("Wrong title", TITLE, game.getTitle());

    }
}
