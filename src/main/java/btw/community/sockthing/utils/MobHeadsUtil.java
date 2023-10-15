package btw.community.sockthing.utils;

public class MobHeadsUtil {
    public static final int OCELOT = 0;
    public static final int CAT_BLACK = 1;
    public static final int CAT_ORANGE = 2;
    public static final int CAT_WHITE = 3;
    public static final int CAT_TABBY = 4;
    public static final int CHICKEN = 5;
    public static final int CHICKEN_FAMISHED = 6;
    public static final int CHICKEN_STARVING = 7;
    public static final int COW = 8;
    public static final int COW_FAMISHED = 9;
    public static final int COW_STARVING = 10;
    public static final int COW_HARNESS = 11;
    public static final int PIG = 12;
    public static final int PIG_FAMISHED = 13;
    public static final int PIG_STARVING = 14;
    public static final int PIG_HARNESS = 15;
    public static final int SHEEP = 16;
    public static final int SHEEP_FAMISHED = 17;
    public static final int SHEEP_STARVING = 18;
    public static final int SHEEP_HARNESS = 19;
    public static final int MOOSHROOM = 20;
    public static final int MOOSHROOM_FAMISHED = 21;
    public static final int MOOSHROOM_STARVING = 22;
    public static final int MOOSHROOM_HARNESS = 23;
    public static final int DOG = 24;
    public static final int WOLF = 25;
    public static final int WOLF_ANGRY = 26;
    public static final int WOLF_HUNGRY = 27;
    public static final int WOLF_DIRE = 28;
    public static final int VILLAGER = 29;
    public static final int VILLAGER_DIRTY = 30;
    public static final int VILLAGER_LIBRARIAN = 31;
    public static final int VILLAGER_PRIEST = 32;
    public static final int VILLAGER_BUTCHER = 33;
    public static final int WITCH = 34;
    public static final int VILLAGER_ZOMBIE = 35;
    public static final int GOLEM = 36;
    public static final int SNOWMAN = 37;
    public static final int CREEPER_NEUTERED = 38;
    public static final int SPIDER = 39;
    public static final int SPIDER_CAVE = 40;
    public static final int SPIDER_JUNGLE = 41;
    public static final int ENDERMAN = 42;
    public static final int BLAZE = 43;
    public static final int GHAST = 44;
    public static final int GHAST_SCREAMING = 45;
    public static final int MAGMACUBE = 46;
    public static final int PIGMAN = 47;
    public static final int SLIME = 48;
    public static final int SQUID = 49;
    public static final int BAT = 50;

    public static boolean isVillagerType(int type) {
        return type == VILLAGER
                || type == VILLAGER_DIRTY || type == VILLAGER_LIBRARIAN
                || type == VILLAGER_PRIEST || type == VILLAGER_BUTCHER
                || type == WITCH || type == VILLAGER_ZOMBIE || type == GOLEM;
    }

    public static boolean isSpiderType(int type) {
        return type == SPIDER || type == SPIDER_CAVE || type == SPIDER_JUNGLE;
    }

    /**
     * Sheep, but not harness
     */
    public static boolean isSheepType(int type) {
        return type == SHEEP || type == SHEEP_FAMISHED || type == SHEEP_STARVING;
    }
}
