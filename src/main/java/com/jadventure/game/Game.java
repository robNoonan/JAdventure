package com.jadventure.game;

import com.jadventure.game.entities.Player;
import com.jadventure.game.monsters.Monster;
import com.jadventure.game.monsters.MonsterFactory;
import com.jadventure.game.repository.LocationRepository;
import com.jadventure.game.prompts.CommandParser;

import java.util.ArrayList;

/**
 * This class contains the main loop that takes the input and
 * does the according actions.
 */
public class Game {
    public ArrayList<Monster> monsterList = new ArrayList<Monster>();
    public MonsterFactory monsterFactory = new MonsterFactory(); 
    public CommandParser parser;
    public Monster monster;
    Player player = null;

    public Game(Player player, String playerType) throws DeathException {
          this.parser = new CommandParser(player);
          this.player = player;
          switch (playerType) {
              case "new":
                  newGameStart(player);
                  break;
              case "old":
                  QueueProvider.offer("Welcome back, " + player.getName() + "!");
                  QueueProvider.offer("");
                  player.getLocation().print();
                  gamePrompt(player);
                  break;
              default:
                  QueueProvider.offer("Invalid player type");
                  break;
          }
    }
    
    /**
     * Starts a new game.
     * It prints the introduction text first and asks for the name of the player's
     * character and welcomes him or her and includes a brief description of how to
     *  move and play the game. After that, it goes to the normal game prompt.
     */
    public void newGameStart(Player player) throws DeathException {
        QueueProvider.offer(player.getIntro());
        String userInput = QueueProvider.take();
        player.setName(userInput);
        LocationRepository locationRepo = GameBeans.getLocationRepository(player.getName());
        this.player.setLocation(locationRepo.getInitialLocation());
        player.save();
        QueueProvider.offer("Welcome to Silliya, " + player.getName() + ". \n \n" 
        + "*** HOW TO PLAY ***\n \n"
        + "To move in a direction, type 'g' followed by the first letter of the direction you'd like to go\n"
        + "* MOVEMENT *\n"
        + "'g n' - go north\n"
        + "'g s' - go south\n"
        + "'g e' - go east\n"
        + "'g w' - go west\n \n"
        + "* INVENTORY *\n"
        + "'v <s,e,b>' - view status, eqipped items, backbpack\n"
        + "'p <itemname>' - pick up an item\n"
        + "'d <itemname>' - drop an item\n"
        + "'e <itemname>' - equip item\n"
        + "'ue <itemname>' - unequip item\n \n"
        + "* INTERACTIONS *\n"
        + "'m' - get a list of monsters around you\n"
        + "'la' - look around you\n"
        + "'t <npc>' - to talk to a character\n"
        + "'a <monster>' - to attack a monster\n \n"
        + "* GAME *\n"
        + "'h' - help menu\n"
        + "'s' - save game\n"
        + "'exit' - quit current game\n");
        player.getLocation().print();
        gamePrompt(player);
    }

    /**
     * This is the main loop for the player-game interaction. It gets input from the
     * command line and checks if it is a recognised command.
     *
     * This keeps looping as long as the player didn't type an exit command.
     */
    public void gamePrompt(Player player) throws DeathException {
        boolean continuePrompt = true;
        try {
            while (continuePrompt) {
                QueueProvider.offer("\nPrompt:");
                String command = QueueProvider.take().toLowerCase();
                continuePrompt = parser.parse(player, command);
            }
        } catch (DeathException e) {
            if (e.getLocalisedMessage().equals("replay")) {
                return;
            } else {
                throw e;
            }
        }
    }
}
