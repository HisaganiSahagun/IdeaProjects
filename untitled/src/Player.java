public class Player {
    /**
     * Instance Variable Requirements
     * Name
     * Level
     */
    private String name;
    private int level;

    /**
     * Static Variable Requirement
     * Create a static Variable called max_level(int)(private)
     * It should hold the value of the Max Level of the players created.
     */
    private static int max_level;
    private static int player_count;


    Player(String playerName, int playerLevel) {
        /**
         * Hint:
         * Perform comparison here.
         * Update the counter here.
         */
        name = playerName;
        level = playerLevel;
        //level and player counter
        if (playerLevel > max_level) {
            max_level = playerLevel;
        }
        player_count++;
    }

    /**
     * Create static methods - getters for max_level, and counter
     *
     * @return max_level
     */

    /*
    Example
    public static int getMaxLevel(){
        return max_level
    }
    */
    public static int getPlayerCount() {
        return player_count;

    }

    public static int getMaxLevel() {
        return max_level;
    }
}
