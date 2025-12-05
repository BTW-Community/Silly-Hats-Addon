package btw.community.sockthing.utils;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.src.AxisAlignedBB;

import java.util.TreeMap;

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
    public static final int DRAGON = 51;

    public static final TreeMap<Integer, MobHeadType> mobHeads = new TreeMap<>();


    public static void addNewMobHead(MobHeadType mobHead) {
        mobHeads.put(mobHead.getId(), mobHead);
    }

    /**
     * Returns offsetX, offsetY, offsetZ, rotation depending on bounds of head
     */
    @Environment(value = EnvType.CLIENT)
    public static float[] computeOffsets(AxisAlignedBB bounds, int direction) {
        float height = (float) (bounds.maxY - bounds.minY);
        float width  = (float) Math.max(bounds.maxX - bounds.minX, bounds.maxZ - bounds.minZ);

        float yShift = 0F;
        if (direction > 1) {
            yShift = (1F - height) / 2F;
        }

        float gap = 1F - width;

        float x = 0F, y = yShift, z = 0F;
        float rotation = 0F;

        switch (direction) {
            case 2:
                z =  gap / 2F;
                break;
            case 3:
                z = -gap / 2F;
                rotation = 180F;
                break;
            case 4:
                x =  gap / 2F;
                rotation = 270F;
                break;
            case 5:
                x = -gap / 2F;
                rotation =  90F;
                break;
            default:
                // directions 0 and 1 (and any other unexpected values) produce no x/z offset and no rotation,
                // and y remains 0 when direction <= 1.
                break;
        }

        return new float[]{ x, y, z, rotation };
    }


}
