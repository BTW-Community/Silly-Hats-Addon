package btw.community.sockthing.item;

import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import btw.community.sockthing.item.items.HatItem;
import btw.community.sockthing.item.items.MobHeadItem;
import btw.community.sockthing.utils.*;
import net.minecraft.src.Item;

import java.util.Random;

public class SHItems {

    public static int ID_HAT = 21000;
    public static int ID_MOB_HEAD = 21001;

    public static Item hat;
    public static Item mobHead;
    private static final Random random = new Random();

    public static void initItems() {

        initMobHeads();

        hat = new HatItem( ID_HAT - 256 )
                .setBuoyant()
                .setIncineratedInCrucible()
                .setFilterableProperties(Item.FILTERABLE_SOLID_BLOCK)
                .setUnlocalizedName( "SHItemHat" );

        mobHead = new MobHeadItem( ID_MOB_HEAD - 256, SHBlocks.mobHead);
    }

    private static void initMobHeads() {

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.OCELOT, "ocelot",
                "mob.cat.hitt"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CAT_BLACK, "catBlack",
                "mob.cat.meow"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CAT_ORANGE, "catOrange",
                "mob.cat.meow"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CAT_WHITE, "catWhite",
                "mob.cat.meow"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CAT_TABBY, "catTabby",
                "mob.cat.purr"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CHICKEN, "chicken",
                "mob.chicken.say"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CHICKEN_FAMISHED,"chickenFamished",
                "mob.chicken.say", 0.9F, 0.9F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CHICKEN_STARVING, "chickenStarving",
                "mob.chicken.hurt", 0.7F, 0.7F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.COW, "cow",
                "mob.cow.say"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.COW_FAMISHED,"cowFamished",
                "mob.cow.say", 0.9F, 0.9F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.COW_STARVING, "cowStarving",
                "mob.cow.hurt", 0.7F, 0.7F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.COW_HARNESS, "cowHarness",
                "mob.cow.hurt", 0.5F, 0.9F,
                MobHeadTileEntityRenderer.OVERLAY));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.PIG, "pig",
                "mob.pig.say"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.PIG_FAMISHED,"pigFamished",
                "mob.pig.say", 0.9F, 0.9F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.PIG_STARVING, "pigStarving",
                "mob.pig.death", 0.7F, 0.7F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.PIG_HARNESS, "pigHarness",
                "mob.pig.death", 0.5F, 0.9F,
                MobHeadTileEntityRenderer.OVERLAY));
        
        MobHeadsUtil.addNewMobHead( new SheepHeadType(
                MobHeadsUtil.SHEEP, "sheep",
                "mob.sheep.say", 1.0F, 1.0F,
                MobHeadTileEntityRenderer.BASE, "/shmodtex/heads/sheep.png", null));

        MobHeadsUtil.addNewMobHead( new SheepHeadType(
                MobHeadsUtil.SHEEP_FAMISHED,"sheepFamished",
                "mob.sheep.say", 0.9F, 0.9F,
                MobHeadTileEntityRenderer.BASE, "/shmodtex/heads/sheepFamished.png", null));

        MobHeadsUtil.addNewMobHead( new SheepHeadType(
                MobHeadsUtil.SHEEP_STARVING, "sheepStarving",
                "mob.sheep.saz", 0.7F, 0.7F,
                MobHeadTileEntityRenderer.BASE, "/shmodtex/heads/sheepStarving.png", null));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.SHEEP_HARNESS, "sheepHarness",
                "mob.sheep.shear", 0.5F, 0.9F,
                MobHeadTileEntityRenderer.OVERLAY));
        
        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.MOOSHROOM, "mooshroom",
                "mob.cow.say"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.MOOSHROOM_FAMISHED,"mooshroomFamished",
                "mob.cow.say", 0.9F, 0.9F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.MOOSHROOM_STARVING, "mooshroomStarving",
                "mob.cow.hurt"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.MOOSHROOM_HARNESS, "mooshroomHarness",
                "mob.cow.hurt", 0.5F, 0.9F,
                MobHeadTileEntityRenderer.OVERLAY));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.DOG, "dog",
                "mob.wolf.panting"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.WOLF, "wolf",
                "mob.wolf.bark"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.WOLF_ANGRY, "wolfAngry",
                "mob.wolf.growl"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.WOLF_HUNGRY, "wolfHungry",
                "mob.wolf.whine"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.WOLF_DIRE, "wolfDire",
                "mob.wolf.growl", 3.0F, 0.9F));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.VILLAGER, "villager",
                null, 1.0F, 1.0F,
                MobHeadTileEntityRenderer.VILLAGER));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.VILLAGER_DIRTY, "villagerDirty",
                null, 1.0F, 1.0F,
                MobHeadTileEntityRenderer.VILLAGER));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.VILLAGER_LIBRARIAN, "villagerLibrarian",
                null, 1.0F, 1.0F,
                MobHeadTileEntityRenderer.VILLAGER));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.VILLAGER_PRIEST, "villagerPriest",
                null, 1.0F, 1.0F,
                MobHeadTileEntityRenderer.VILLAGER, "villagerPriestEyes"));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.VILLAGER_BUTCHER, "villagerButcher",
                null, 1.0F, 1.0F,
                MobHeadTileEntityRenderer.VILLAGER));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.WITCH, "witch",
                "mob.ghast.affectionate", 0.25F, 0.5F + random.nextFloat() * 0.25F,
                MobHeadTileEntityRenderer.WITCH));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.VILLAGER_ZOMBIE, "villagerZombie",
                "mob.zombie.say", 1.0F, (random.nextFloat() - random.nextFloat() ) * 0.2F + 0.7F,
                MobHeadTileEntityRenderer.VILLAGER));

        MobHeadsUtil.addNewMobHead( new VillagerHeadType(
                MobHeadsUtil.GOLEM, "golem",
                "mob.irongolem.hit", 1.0F, 1.0F,
                MobHeadTileEntityRenderer.VILLAGER));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.SNOWMAN, "snowman",
                null, 1.0F, 1.0F,
                MobHeadTileEntityRenderer.SNOWMAN, "/mob/snowman.png"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.CREEPER_NEUTERED, "creeperNeutered",
                "mob.creeper.say", 0.25F, 1.25F));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.SPIDER, "spider",
                "mob.spider.say", 1.0F, 1.0F,
                MobHeadTileEntityRenderer.SPIDER,
                "/mob/spider.png","/mob/spider_eyes.png"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.SPIDER_CAVE, "spiderCave",
                "mob.spider.say", 1.0F, 1.0F,
                MobHeadTileEntityRenderer.SPIDER,
                "/mob/cavespider.png", "/mob/spider_eyes.png"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.SPIDER_JUNGLE, "spiderJungle",
                "mob.spider.say", 1.0F, 1.0F,
                MobHeadTileEntityRenderer.SPIDER,
                "/btwmodtex/fcSpiderJungle.png","/mob/spider_eyes.png"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.ENDERMAN, "enderman",
                "mob.endermen.portal",
                MobHeadTileEntityRenderer.BASE,"/btwmodtex/fcInfusedSkullEyes.png"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.BLAZE, "blaze",
                "mob.blaze.breathe", 1.0F, 1.0F,
                MobHeadTileEntityRenderer.MOB, "/mob/fire.png"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.GHAST, "ghast",
                "mob.ghast.moan"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.GHAST_SCREAMING, "ghastScreaming",
                "mob.ghast.scream",
                MobHeadTileEntityRenderer.BASE, "ghastScreamingEyes"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.MAGMACUBE, "magmaCube",
                "mob.slime.big"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.PIGMAN, "pigman",
                "mob.zombiepig.zpig",
                MobHeadTileEntityRenderer.OVERLAY));

        MobHeadsUtil.addNewMobHead( new SlimeHeadType(
                MobHeadsUtil.SLIME, "slime",
                "mob.slime.big"));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.SQUID, "squid",
                null));

        MobHeadsUtil.addNewMobHead( new MobHeadType(
                MobHeadsUtil.BAT, "bat",
                "mob.bat.idle"));

        MobHeadsUtil.addNewMobHead( new DragonHeadType(
                MobHeadsUtil.DRAGON, "dragon",
                "mob.dragon.say", 1.0F, 1.0F,
                MobHeadTileEntityRenderer.DRAGON,
                "/shmodtex/heads/dragon.png", "/shmodtex/heads/dragon_eyes.png"));

    }
}
