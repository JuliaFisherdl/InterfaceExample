package com.company;

public class PlayerCommands {

    private Player player;

    public PlayerCommands(Player player) {
        this.player = player;
    }

    public void castSpellCommand(MagicItem magicItem) {
        if (player.isSpellCaster()) {
            magicItem.castSpell();
        }
    }
}
