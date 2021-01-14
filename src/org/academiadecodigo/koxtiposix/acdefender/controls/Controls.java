package org.academiadecodigo.koxtiposix.acdefender.controls;

import org.academiadecodigo.koxtiposix.acdefender.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private Player player;

    public void init() {

        this.keyboard = new Keyboard(this);

        KeyboardEvent pressUp = new KeyboardEvent();
        pressUp.setKey(KeyboardEvent.KEY_UP);
        pressUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent pressDown = new KeyboardEvent();
        pressDown.setKey(KeyboardEvent.KEY_DOWN);
        pressDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(pressUp);
        keyboard.addEventListener(pressDown);

    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                player.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                player.moveDown();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}