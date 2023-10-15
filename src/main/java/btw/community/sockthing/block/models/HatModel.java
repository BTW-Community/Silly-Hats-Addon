// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.5.2
// Paste this class into your mod and call render() in your Entity Render class
// Note: You may need to adjust the y values of the 'setRotationPoint's

package btw.community.sockthing.block.models;

import btw.community.sockthing.utils.HatsUtil;
import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class HatModel extends ModelBase {
    private final ModelRenderer farmers;
    private final ModelRenderer farmers_brim_r1;
    private final ModelRenderer witch;
    private final ModelRenderer witch_hat_bottom;
    private final ModelRenderer witch_hat_middle;
    private final ModelRenderer witch_hat_top;
    private final ModelRenderer top;
    private final ModelRenderer chef;
    private final ModelRenderer flower;
    private final ModelRenderer wolf;
    private final ModelRenderer wolf_snout;
    private final ModelRenderer direwolf;
    private final ModelRenderer direwolf_snout;
    private final ModelRenderer big;
    private final ModelRenderer big_brim_r1;
    private final ModelRenderer big_bow;
    private final ModelRenderer big_bow_left_r1;
    private final ModelRenderer big_bow_right_r1;
    private final ModelRenderer crown;
    private final ModelRenderer babysquid;
    private final ModelRenderer babysquid_legs;
    private final ModelRenderer babysquid_leg_r1;
    private final ModelRenderer babysquid_leg_r2;
    private final ModelRenderer babysquid_leg_r3;
    private final ModelRenderer babysquid_leg_r4;
    private final ModelRenderer babysquid_leg_r5;
    private final ModelRenderer babysquid_leg_r6;
    private final ModelRenderer babysquid_leg_r7;
    private final ModelRenderer babysquid_leg_r8;
    private final ModelRenderer ushanka;
    private final ModelRenderer frog;
    private final ModelRenderer frog_body;
    private final ModelRenderer frog_head;
    private final ModelRenderer frog_eyes;
    private final ModelRenderer frog_right_eye;
    private final ModelRenderer frog_left_eye;
    private final ModelRenderer frog_croaking_body;
    private final ModelRenderer frog_tongue;
    private final ModelRenderer frog_left_arm;
    private final ModelRenderer frog_right_arm;
    private final ModelRenderer frog_left_leg;
    private final ModelRenderer frog_right_leg;
    private final ModelRenderer pumpkin;
    private final ModelRenderer cap;
    private final ModelRenderer cap_shades;
    private final ModelRenderer dino;
    private final ModelRenderer dino_back_r1;
    private final ModelRenderer fez;
    private final ModelRenderer santa;
    private final ModelRenderer santa_hat_bottom;
    private final ModelRenderer santa_hat_middle;
    private final ModelRenderer santa_hat_top;
    private final ModelRenderer fruit;
    private final ModelRenderer fruit_bowl;
    private final ModelRenderer fruit_carrot;
    private final ModelRenderer fruit_carrot_top_r1;
    private final ModelRenderer fruit_carrot_top_r2;
    private final ModelRenderer fruit_carrot_body_r1;
    private final ModelRenderer fruit_melon;
    private final ModelRenderer fruit_melon_r1;
    private final ModelRenderer fruit_apple;
    private final ModelRenderer fruit_apple_top_r1;
    private final ModelRenderer fruit_pumpkin;
    private final ModelRenderer fruit_pumpkin_r1;
    private final ModelRenderer bat;
    private final ModelRenderer bat_tail_r1;
    private final ModelRenderer bat_head;
    private final ModelRenderer bat_left_ear_r1;
    private final ModelRenderer spider;
    private final ModelRenderer spider_body_r1;
    private final ModelRenderer spider_head_r1;
    private final ModelRenderer spider_legs_1;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer spider_legs_2;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer arrow;
    private final ModelRenderer arrow_r1;
    private final ModelRenderer arrow_r2;

    private final ModelRenderer pirate;
    private final ModelRenderer pirate_hat;
    private final ModelRenderer bone28;
    private final ModelRenderer cube_r1;
    private final ModelRenderer bone27;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bone26;
    private final ModelRenderer cube_r3;
    private final ModelRenderer parrot;
    private final ModelRenderer body;
    private final ModelRenderer wing0;
    private final ModelRenderer wing1;
    private final ModelRenderer head3;
    private final ModelRenderer leg0;
    private final ModelRenderer leg1;
    private final ModelRenderer tail;
    private final ModelRenderer cowboy;
    private final ModelRenderer devil;
    private final ModelRenderer bandanna;
    private final ModelRenderer cat;
    private final ModelRenderer cat_ears;
    private final ModelRenderer mushroom_red;
    private final ModelRenderer mushroom_brown;

    public HatModel() {
        textureWidth = 64;
        textureHeight = 64;

        //--- FARMER ---//
        farmers = new ModelRenderer(this);
        farmers.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.farmers.setTextureOffset(32, 0).addBox(-4.0F, -5.5F, -4.0F, 8, 4, 8, 0.5F);

        farmers_brim_r1 = new ModelRenderer(this);
        farmers_brim_r1.setRotationPoint(0.0F, 4.5F, -5.5F);
        farmers.addChild(farmers_brim_r1);
        setRotation(farmers_brim_r1, -1.5708F, 0.0F, 0.0F);
        this.farmers_brim_r1.setTextureOffset(30, 47).addBox(-8.0F, -13.5F, -5.5F, 16, 16, 1, 0.0F);

        //--- WITCH ---//
        witch = new ModelRenderer(this);
        witch.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.witch.setTextureOffset(0, 0).addBox(-5.0F, -2.05F, -5.0F, 10, 2, 10, 0.0F);

        witch_hat_bottom = new ModelRenderer(this);
        witch_hat_bottom.setRotationPoint(1.75F, -4.0F, 2.0F);
        witch.addChild(witch_hat_bottom);
        setRotation(witch_hat_bottom, -0.0524F, 0.0F, 0.0262F);
        this.witch_hat_bottom.setTextureOffset(0, 12).addBox(-4.8953F, -1.5069F, -4.7907F, 7, 4, 7, 0.0F);

        witch_hat_middle = new ModelRenderer(this);
        witch_hat_middle.setRotationPoint(0.0F, -3.0F, 0.0F);
        witch_hat_bottom.addChild(witch_hat_middle);
        setRotation(witch_hat_middle, -0.1047F, 0.0F, 0.0524F);
        this.witch_hat_middle.setTextureOffset(0, 23).addBox(-2.9365F, -1.5615F, -2.3756F, 4, 4, 4, 0.0F);

        witch_hat_top = new ModelRenderer(this);
        witch_hat_top.setRotationPoint(0.0F, -3.0F, 0.0F);
        witch_hat_middle.addChild(witch_hat_top);
        setRotation(witch_hat_top, -0.2094F, 0.0F, 0.1047F);
        this.witch_hat_top.setTextureOffset(0, 31).addBox(-0.7765F, -0.3305F, 0.4183F, 1, 2, 1, 0.25F);

        //--- TOP ---//
        top = new ModelRenderer(this);
        top.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.top.setTextureOffset(32, 0).addBox(-4.0F, -9.0F, -4.0F, 8, 8, 8, 0.5F);
        this.top.setTextureOffset(16, 16).addBox(-6.0F, -2.05F, -6.0F, 12, 2, 12, 0.0F);

        //--- CHEF ---//
        chef = new ModelRenderer(this);
        chef.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.chef.setTextureOffset(32, 0).addBox(-4.0F, -10.5F, -4.0F, 8, 10, 8, 0.5F);

        //--- FLOWER ---//
        flower = new ModelRenderer(this);
        flower.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.flower.setTextureOffset(32, 0).addBox(-4.0F, -3.5F, -4.0F, 8, 3, 8, 0.5F);

        //--- WOLF ---//
        wolf = new ModelRenderer(this);
        wolf.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wolf.setTextureOffset(32, 0).addBox(-4.0F, -7.25F, -4.0F, 8, 10, 8, 0.5F);
        this.wolf.setTextureOffset(21, 0).addBox(-4.0F, -10.25F, 0.5F, 2, 2, 1, 0.5F);
        this.wolf.setTextureOffset(21, 0).addBox(2.0F, -10.25F, 0.5F, 2, 2, 1, 0.5F);

        wolf_snout = new ModelRenderer(this);
        wolf_snout.setRotationPoint(-16.0F, 27.0F, 0.0F);
        wolf.addChild(wolf_snout);
        this.wolf_snout.setTextureOffset(0, 0).addBox(14.5F, -29.5F, -8.0F, 3, 2, 3, 0.5F);
        this.wolf_snout.setTextureOffset(17, 4).addBox(14.5F, -27.5F, -8.0F, 3, 1, 3, 0.49F);

        //--- BEAST ---//
        direwolf = new ModelRenderer(this);
        direwolf.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.direwolf.setTextureOffset(32, 0).addBox(-4.0F, -7.25F, -4.0F, 8, 10, 8, 0.5F);
        this.direwolf.setTextureOffset(21, 0).addBox(-4.0F, -10.25F, 0.5F, 2, 2, 1, 0.5F);
        this.direwolf.setTextureOffset(21, 0).addBox(2.0F, -10.25F, 0.5F, 2, 2, 1, 0.5F);

        direwolf_snout = new ModelRenderer(this);
        direwolf_snout.setRotationPoint(-16.0F, 27.0F, 0.0F);
        direwolf.addChild(direwolf_snout);
        this.direwolf_snout.setTextureOffset(0, 0).addBox(14.5F, -29.5F, -8.0F, 3, 2, 3, 0.5F);
        this.direwolf_snout.setTextureOffset(17, 4).addBox(14.5F, -27.5F, -8.0F, 3, 1, 3, 0.49F);

        //--- BIG ---//
        big = new ModelRenderer(this);
        big.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.big.setTextureOffset(32, 0).addBox(-4.0F, -5.5F, -4.0F, 8, 4, 8, 0.5F);

        big_brim_r1 = new ModelRenderer(this);
        big_brim_r1.setRotationPoint(0.0F, 4.5F, -5.5F);
        big.addChild(big_brim_r1);
        setRotation(big_brim_r1, -1.5708F, 0.0F, 0.0F);
        this.big_brim_r1.setTextureOffset(17, 23).addBox(-10.0F, -15.5F, -5.5F, 20, 20, 1, 0.0F);

        big_bow = new ModelRenderer(this);
        big_bow.setRotationPoint(5.1276F, -3.75F, 2.6667F);
        big.addChild(big_bow);
        setRotation(big_bow, 0.829F, 0.0F, 0.0F);
        this.big_bow.setTextureOffset(18, 0).addBox(-0.6276F, -1.5F, -0.6667F, 1, 3, 1, 0.0F);

        big_bow_left_r1 = new ModelRenderer(this);
        big_bow_left_r1.setRotationPoint(0.0638F, 0.0F, -1.6286F);
        big_bow.addChild(big_bow_left_r1);
        setRotation(big_bow_left_r1, 0.0F, -0.3927F, 0.0F);
        this.big_bow_left_r1.setTextureOffset(0, 0).addBox(-0.5F, -1.5F, -2.0F, 1, 3, 4, 0.0F);

        big_bow_right_r1 = new ModelRenderer(this);
        big_bow_right_r1.setRotationPoint(0.0638F, 0.0F, 1.7953F);
        big_bow.addChild(big_bow_right_r1);
        setRotation(big_bow_right_r1, 0.0F, 0.3927F, 0.0F);
        this.big_bow_right_r1.setTextureOffset(0, 9).addBox(-0.5F, -1.5F, -2.0F, 1, 3, 4, 0.0F);

        //--- CROWN ---//
        crown = new ModelRenderer(this);
        crown.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.crown.setTextureOffset(0, 0).addBox(-4.0F, -2F, -4.0F, 8, 2, 8, 0.49F);
        this.crown.setTextureOffset(0, 12).addBox(-4.0F, -4.5F, -4.0F, 8, 4, 8, 0.5F);

        //--- SQUID ---//
        babysquid = new ModelRenderer(this);
        babysquid.setRotationPoint(0.0F, 22.0F - 24.0F, 0.0F);
        setRotation(babysquid, 0.0F, 0.0F, 0.0F);
        this.babysquid.setTextureOffset(20, 21).addBox(-2.0F, -6.5F, -2.0F, 4, 6, 4, 0.5F);

        babysquid_legs = new ModelRenderer(this);
        babysquid_legs.setRotationPoint(0.0F, -0.5F, 0.0F);
        babysquid.addChild(babysquid_legs);

        babysquid_leg_r1 = new ModelRenderer(this);
        babysquid_leg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r1);
        setRotation(babysquid_leg_r1, 0.0F, 0.0F, 0.6109F);
        this.babysquid_leg_r1.setTextureOffset(33, 45).addBox(-1.75F, 0.75F, 0.0F, 0, 4, 0, 0.5F);

        babysquid_leg_r2 = new ModelRenderer(this);
        babysquid_leg_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r2);
        setRotation(babysquid_leg_r2, 0.0F, 0.0F, -0.5672F);
        this.babysquid_leg_r2.setTextureOffset(33, 45).addBox(1.75F, 0.75F, 0.0F, 0, 4, 0, 0.5F);

        babysquid_leg_r3 = new ModelRenderer(this);
        babysquid_leg_r3.setRotationPoint(0.0F, 0.5F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r3);
        setRotation(babysquid_leg_r3, -0.5715F, 0.2126F, 0.4732F);
        this.babysquid_leg_r3.setTextureOffset(33, 45).addBox(-1.75F, 0.75F, -1.75F, 0, 4, 0, 0.5F);

        babysquid_leg_r4 = new ModelRenderer(this);
        babysquid_leg_r4.setRotationPoint(0.0F, 0.5F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r4);
        setRotation(babysquid_leg_r4, 0.2533F, -0.067F, 0.2533F);
        this.babysquid_leg_r4.setTextureOffset(33, 45).addBox(-1.75F, 0.75F, 1.75F, 0, 4, 0, 0.5F);

        babysquid_leg_r5 = new ModelRenderer(this);
        babysquid_leg_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r5);
        setRotation(babysquid_leg_r5, -0.6981F, 0.0F, 0.0F);
        this.babysquid_leg_r5.setTextureOffset(33, 45).addBox(0.0F, 0.75F, -1.75F, 0, 4, 0, 0.5F);

        babysquid_leg_r6 = new ModelRenderer(this);
        babysquid_leg_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r6);
        setRotation(babysquid_leg_r6, 0.5672F, 0.0F, 0.0F);
        this.babysquid_leg_r6.setTextureOffset(33, 45).addBox(0.0F, 0.75F, 1.75F, 0, 4, 0, 0.5F);

        babysquid_leg_r7 = new ModelRenderer(this);
        babysquid_leg_r7.setRotationPoint(0.0F, 0.5F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r7);
        setRotation(babysquid_leg_r7, 0.2533F, 0.067F, -0.2533F);
        this.babysquid_leg_r7.setTextureOffset(33, 45).addBox(1.75F, 0.75F, 1.75F, 0, 4, 0, 0.5F);

        babysquid_leg_r8 = new ModelRenderer(this);
        babysquid_leg_r8.setRotationPoint(0.0F, 0.5F, 0.0F);
        babysquid_legs.addChild(babysquid_leg_r8);
        setRotation(babysquid_leg_r8, -0.5789F, -0.1889F, -0.4359F);
        this.babysquid_leg_r8.setTextureOffset(33, 45).addBox(1.75F, 0.75F, -1.75F, 0, 4, 0, 0.5F);

        //--- USHANKA ---//
        ushanka = new ModelRenderer(this);
        ushanka.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.ushanka.setTextureOffset(10, 40).addBox(-4.0F, -7.0F, -4.0F, 8, 11, 8, 0.5F);
        this.ushanka.setTextureOffset(7, 1).addBox(-4.0F, -5.5F, -5.0F, 8, 3, 0, 0.5F);

        //--- FROG ---//
        frog = new ModelRenderer(this);
        frog.setRotationPoint(0.0F, 0.0F, 0.0F);

        frog_body = new ModelRenderer(this);
        frog_body.setRotationPoint(0.0F, 0.0F, -0.25F);
        frog.addChild(frog_body);
        this.frog_body.setTextureOffset(0, 12).addBox(-3.5F, -4.0F, -4.5F, 7, 3, 9, 0.0F);
        this.frog_body.setTextureOffset(14, 12).addBox(-3.5F, -3.0F, -4.5F, 7, 0, 9, 0.0F);

        frog_head = new ModelRenderer(this);
        frog_head.setRotationPoint(0.0F, -4.0F, 2.5F);
        frog_body.addChild(frog_head);
        this.frog_head.setTextureOffset(7, 0).addBox(-3.5F, -1.0F, -7.0F, 7, 0, 9, 0.0F);
        this.frog_head.setTextureOffset(0, 0).addBox(-3.5F, -2.0F, -7.0F, 7, 3, 9, 0.0F);

        frog_eyes = new ModelRenderer(this);
        frog_eyes.setRotationPoint(-0.5F, 0.0F, 2.0F);
        frog_head.addChild(frog_eyes);

        frog_right_eye = new ModelRenderer(this);
        frog_right_eye.setRotationPoint(-1.5F, -3.0F, -6.5F);
        frog_eyes.addChild(frog_right_eye);
        this.frog_right_eye.setTextureOffset(9, 39).addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);

        frog_left_eye = new ModelRenderer(this);
        frog_left_eye.setRotationPoint(2.5F, -3.0F, -6.5F);
        frog_eyes.addChild(frog_left_eye);
        this.frog_left_eye.setTextureOffset(0, 37).addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);

        frog_croaking_body = new ModelRenderer(this);
        frog_croaking_body.setRotationPoint(0.0F, -3.0F, -1.5F);
        frog_body.addChild(frog_croaking_body);
        this.frog_croaking_body.setTextureOffset(0, 32).addBox(-3.5F, -0.1F, -2.9F, 7, 2, 3, -0.1F);

        frog_tongue = new ModelRenderer(this);
        frog_tongue.setRotationPoint(0.0F, -3.1F, 4.5F);
        frog_body.addChild(frog_tongue);
        this.frog_tongue.setTextureOffset(30, 16).addBox(-2.0F, 0.0F, -7.1F, 4, 0, 7, 0.0F);

        frog_left_arm = new ModelRenderer(this);
        frog_left_arm.setRotationPoint(4.0F, -3.0F, -3.0F);
        frog_body.addChild(frog_left_arm);
        this.frog_left_arm.setTextureOffset(31, 39).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 3, 0.0F);
        this.frog_left_arm.setTextureOffset(29, 8).addBox(-4.0F, 3.01F, -5.0F, 8, 0, 8, 0.0F);

        frog_right_arm = new ModelRenderer(this);
        frog_right_arm.setRotationPoint(-4.0F, -3.0F, -3.0F);
        frog_body.addChild(frog_right_arm);
        this.frog_right_arm.setTextureOffset(21, 39).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 3, 0.0F);
        this.frog_right_arm.setTextureOffset(29, 0).addBox(-4.0F, 3.01F, -5.0F, 8, 0, 8, 0.0F);

        frog_left_leg = new ModelRenderer(this);
        frog_left_leg.setRotationPoint(3.5F, -3.0F, 3.25F);
        frog.addChild(frog_left_leg);
        this.frog_left_leg.setTextureOffset(34, 32).addBox(-1.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
        this.frog_left_leg.setTextureOffset(16, 24).addBox(-2.0F, 3.01F, -4.0F, 8, 0, 8, 0.0F);

        frog_right_leg = new ModelRenderer(this);
        frog_right_leg.setRotationPoint(-3.5F, -3.0F, 3.25F);
        frog.addChild(frog_right_leg);
        this.frog_right_leg.setTextureOffset(20, 32).addBox(-2.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
        this.frog_right_leg.setTextureOffset(0, 24).addBox(-6.0F, 3.01F, -4.0F, 8, 0, 8, 0.0F);

        //--- PUMPKIN ---//
        pumpkin = new ModelRenderer(this);
        pumpkin.setRotationPoint(0.0F, 23.99F - 24.0F, 0.0F);
        this.pumpkin.setTextureOffset(0, 0).addBox(-8.0F, -12.0F, -8.0F, 16, 16, 16, -3.5F);

        //--- CAP ---//
        cap = new ModelRenderer(this);
        cap.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cap.setTextureOffset(0, 0).addBox(-4.0F, -4.6F, -4.0F, 8, 4, 8, 0.5F);
        this.cap.setTextureOffset(24, 0).addBox(-4.0F, 0.4F, 5.0F, 8, 1, 3, 0.5F);

        cap_shades = new ModelRenderer(this);
        cap_shades.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap.addChild(cap_shades);
        this.cap_shades.setTextureOffset(0, 12).addBox(-4.0F, 0.4F, -4.0F, 8, 2, 8, 0.5F);

        //--- DINO ---//
        dino = new ModelRenderer(this);
        dino.setRotationPoint(0.0F, 23.99F - 24.0F, 0.0F);
        this.dino.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.dino.setTextureOffset(38, 41).addBox(-4.0F, -8.0F, -5.1F, 8, 8, 1, 0.499F);
        this.dino.setTextureOffset(31, 34).addBox(-4.0F, -5.0F, -5.075F, 8, 2, 2, 0.495F);
        this.dino.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.49F);
        this.dino.setTextureOffset(34, 19).addBox(-1.025F, -9.5F, -2.25F, 2, 1, 5, 0.0F);

        dino_back_r1 = new ModelRenderer(this);
        dino_back_r1.setRotationPoint(-1.025F, -4.5F, 4.5F);
        dino.addChild(dino_back_r1);
        setRotation(dino_back_r1, -1.5708F, 0.0F, 0.0F);
        this.dino_back_r1.setTextureOffset(34, 19).addBox(0.0F, -1.0F, -2.0F, 2, 1, 5, 0.0F);

        //--- FEZ ---//
        fez = new ModelRenderer(this);
        fez.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.fez.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
        this.fez.setTextureOffset(4, 10).addBox(0.0F, -6.0F, 0.0F, 4, 4, 0, 0.0F);

        //--- SANTA ---//
        santa = new ModelRenderer(this);
        santa.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.santa.setTextureOffset(0, 0).addBox(-5.0F, -2.05F, -5.0F, 10, 2, 10, 0.0F);

        santa_hat_bottom = new ModelRenderer(this);
        santa_hat_bottom.setRotationPoint(1.75F, -4.0F, 2.0F);
        santa.addChild(santa_hat_bottom);
        setRotation(santa_hat_bottom, -0.0524F, 0.0F, 0.0262F);
        this.santa_hat_bottom.setTextureOffset(0, 12).addBox(-4.8953F, -1.5069F, -4.7907F, 7, 4, 7, 0.0F);

        santa_hat_middle = new ModelRenderer(this);
        santa_hat_middle.setRotationPoint(0.0F, -3.0F, 0.0F);
        santa_hat_bottom.addChild(santa_hat_middle);
        setRotation(santa_hat_middle, -0.1047F, 0.0F, 0.0524F);
        this.santa_hat_middle.setTextureOffset(0, 23).addBox(-2.9365F, -1.5615F, -2.3756F, 4, 4, 4, 0.0F);

        santa_hat_top = new ModelRenderer(this);
        santa_hat_top.setRotationPoint(0.0F, -3.0F, 0.0F);
        santa_hat_middle.addChild(santa_hat_top);
        setRotation(santa_hat_top, -0.2094F, 0.0F, 0.1047F);
        this.santa_hat_top.setTextureOffset(0, 31).addBox(-1.7765F, -0.3305F, 0.4183F, 2, 2, 2, 0.25F);

        //--- FRUIT ---//
        fruit = new ModelRenderer(this);
        fruit.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);

        fruit_bowl = new ModelRenderer(this);
        fruit_bowl.setRotationPoint(7.0F, 8.0F, 0.0F);
        fruit.addChild(fruit_bowl);
        this.fruit_bowl.setTextureOffset(0, 11).addBox(-10.0F, -9.0F, -3.0F, 6, 1, 6, 0.0F);
        this.fruit_bowl.setTextureOffset(0, 0).addBox(-11.0F, -12.0F, -4.0F, 8, 3, 8, 0.0F);

        fruit_carrot = new ModelRenderer(this);
        fruit_carrot.setRotationPoint(1.0831F, -7.1393F, -0.62F);
        fruit.addChild(fruit_carrot);
        setRotation(fruit_carrot, 0.0F, -0.5585F, 0.0F);

        fruit_carrot_top_r1 = new ModelRenderer(this);
        fruit_carrot_top_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        fruit_carrot.addChild(fruit_carrot_top_r1);
        setRotation(fruit_carrot_top_r1, 0.6651F, -0.6875F, 0.5064F);
        this.fruit_carrot_top_r1.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.125F, 2, 0, 2, 0.0F);

        fruit_carrot_top_r2 = new ModelRenderer(this);
        fruit_carrot_top_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        fruit_carrot.addChild(fruit_carrot_top_r2);
        setRotation(fruit_carrot_top_r2, 0.8067F, 0.4972F, -0.6025F);
        this.fruit_carrot_top_r2.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.125F, 2, 0, 2, 0.0F);

        fruit_carrot_body_r1 = new ModelRenderer(this);
        fruit_carrot_body_r1.setRotationPoint(0.4169F, 2.3893F, -1.88F);
        fruit_carrot.addChild(fruit_carrot_body_r1);
        setRotation(fruit_carrot_body_r1, 0.9123F, -0.1117F, -0.0878F);
        this.fruit_carrot_body_r1.setTextureOffset(24, 0).addBox(-0.5F, -0.5F, -2.05F, 1, 1, 4, 0.0F);

        fruit_melon = new ModelRenderer(this);
        fruit_melon.setRotationPoint(-1.031F, -4.1464F, -1.2491F);
        fruit.addChild(fruit_melon);
        setRotation(fruit_melon, 0.0F, 0.4363F, 0.0F);

        fruit_melon_r1 = new ModelRenderer(this);
        fruit_melon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        fruit_melon.addChild(fruit_melon_r1);
        setRotation(fruit_melon_r1, -1.3264F, -0.7703F, -1.7427F);
        this.fruit_melon_r1.setTextureOffset(16, 18).addBox(-1.5F, -1.5F, -2.5F, 3, 3, 5, 0.0F);

        fruit_apple = new ModelRenderer(this);
        fruit_apple.setRotationPoint(1.75F, -4.5F, 1.0F);
        fruit.addChild(fruit_apple);

        fruit_apple_top_r1 = new ModelRenderer(this);
        fruit_apple_top_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        fruit_apple.addChild(fruit_apple_top_r1);
        setRotation(fruit_apple_top_r1, 0.0F, -0.7418F, 0.0F);
        this.fruit_apple_top_r1.setTextureOffset(0, 2).addBox(-1.5F, -3.5F, 0.0F, 3, 2, 0, 0.0F);
        this.fruit_apple_top_r1.setTextureOffset(18, 11).addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);

        fruit_pumpkin = new ModelRenderer(this);
        fruit_pumpkin.setRotationPoint(-1.25F, -5.0F, 1.5F);
        fruit.addChild(fruit_pumpkin);

        fruit_pumpkin_r1 = new ModelRenderer(this);
        fruit_pumpkin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        fruit_pumpkin.addChild(fruit_pumpkin_r1);
        setRotation(fruit_pumpkin_r1, 0.0F, 0.1745F, 0.0F);
        this.fruit_pumpkin_r1.setTextureOffset(0, 18).addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);

        //--- BAT ---//
        bat = new ModelRenderer(this);
        bat.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.bat.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.1F);
        this.bat.setTextureOffset(0, 16).addBox(-2.0F, -10.0F, -2.0F, 4, 2, 6, 0.0F);

        bat_tail_r1 = new ModelRenderer(this);
        bat_tail_r1.setRotationPoint(0.0F, -9.25F, 4.0F);
        bat.addChild(bat_tail_r1);
        setRotation(bat_tail_r1, -0.7854F, 0.0F, 0.0F);
        this.bat_tail_r1.setTextureOffset(10, 16).addBox(-2.0F, 0.5F, 0.0F, 4, 0, 4, 0.0F);

        bat_head = new ModelRenderer(this);
        bat_head.setRotationPoint(4.0F, -9.0F, -4.5F);
        bat.addChild(bat_head);

        bat_left_ear_r1 = new ModelRenderer(this);
        bat_left_ear_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bat_head.addChild(bat_left_ear_r1);
        setRotation(bat_left_ear_r1, 0.6109F, 0.0F, 0.0F);
        this.bat_left_ear_r1.setTextureOffset(0, 0).addBox(-7.0F, -4.0F, -1.0F, 2, 3, 1, 0.0F);
        this.bat_left_ear_r1.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -1.0F, 2, 3, 1, 0.0F);
        this.bat_left_ear_r1.setTextureOffset(16, 20).addBox(-6.0F, -2.0F, -2.0F, 4, 4, 4, 0.1F);

        //--- SPIDER ---//
        spider = new ModelRenderer(this);
        spider.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.spider.setTextureOffset(20, 22).addBox(-2.0F, -11.0F, -3.0F, 4, 4, 4, 0.0F);

        spider_body_r1 = new ModelRenderer(this);
        spider_body_r1.setRotationPoint(0.0F, -9.0F, 2.0F);
        spider.addChild(spider_body_r1);
        setRotation(spider_body_r1, -0.3927F, 0.0F, 0.0F);
        this.spider_body_r1.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -2.0F, 8, 6, 8, 0.1F);

        spider_head_r1 = new ModelRenderer(this);
        spider_head_r1.setRotationPoint(0.0F, -9.0F, -2.0F);
        spider.addChild(spider_head_r1);
        setRotation(spider_head_r1, 0.3927F, 0.0F, 0.0F);
        this.spider_head_r1.setTextureOffset(0, 14).addBox(-3.0F, -3.0F, -6.0F, 6, 6, 6, 0.0F);

        spider_legs_1 = new ModelRenderer(this);
        spider_legs_1.setRotationPoint(3.0F, -7.0F, -1.0F);
        spider.addChild(spider_legs_1);
        setRotation(spider_legs_1, 0.0F, 0.0F, 0.9599F);

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(1.0336F, -0.2385F, 1.0F);
        spider_legs_1.addChild(bone21);
        setRotation(bone21, 0.0F, -0.2618F, 0.0F);
        this.bone21.setTextureOffset(18, 14).addBox(-2.3952F, -1.0749F, -1.0F, 11, 2, 2, 0.0F);

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.7836F, -0.2385F, 2.0F);
        spider_legs_1.addChild(bone22);
        setRotation(bone22, -0.1091F, -0.691F, 0.1702F);
        this.bone22.setTextureOffset(18, 14).addBox(-2.3952F, -0.5749F, -0.5F, 11, 2, 2, 0.0F);

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(1.0336F, -0.2385F, -1.0F);
        spider_legs_1.addChild(bone23);
        setRotation(bone23, 0.0F, 0.2618F, 0.0F);
        this.bone23.setTextureOffset(18, 14).addBox(-2.3952F, -1.0749F, -1.0F, 11, 2, 2, 0.0F);

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(1.0336F, -0.2385F, -2.0F);
        spider_legs_1.addChild(bone24);
        setRotation(bone24, 0.1447F, 0.6855F, 0.2262F);
        this.bone24.setTextureOffset(18, 14).addBox(-2.3952F, -0.5749F, -1.0F, 11, 2, 2, 0.0F);

        spider_legs_2 = new ModelRenderer(this);
        spider_legs_2.setRotationPoint(-3.0F, -7.0F, -1.0F);
        spider.addChild(spider_legs_2);
        setRotation(spider_legs_2, 0.0F, 0.0F, -0.9599F);

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(-1.0336F, -0.2385F, 1.0F);
        spider_legs_2.addChild(bone16);
        setRotation(bone16, 0.0F, 0.2618F, 0.0F);
        this.bone16.setTextureOffset(18, 14).addBox(-8.6048F, -1.0749F, -1.0F, 11, 2, 2, 0.0F);

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-0.7836F, -0.2385F, 2.0F);
        spider_legs_2.addChild(bone17);
        setRotation(bone17, -0.1091F, 0.691F, -0.1702F);
        this.bone17.setTextureOffset(18, 14).addBox(-8.6048F, -0.5749F, -0.5F, 11, 2, 2, 0.0F);

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(-1.0336F, -0.2385F, -1.0F);
        spider_legs_2.addChild(bone18);
        setRotation(bone18, 0.0F, -0.2618F, 0.0F);
        this.bone18.setTextureOffset(18, 14).addBox(-8.6048F, -1.0749F, -1.0F, 11, 2, 2, 0.0F);

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(-1.0336F, -0.2385F, -2.0F);
        spider_legs_2.addChild(bone19);
        setRotation(bone19, 0.1447F, -0.6855F, -0.2262F);
        this.bone19.setTextureOffset(18, 14).addBox(-8.6048F, -0.5749F, -1.0F, 11, 2, 2, 0.0F);

        //--- ARROW ---//
        arrow = new ModelRenderer(this);
        arrow.setRotationPoint(0.0F, 24.0F - 24.0F, 0.0F);
        this.arrow.setTextureOffset(0, 5).addBox(-4.0F, -4.0F, -1.0F, 8, 8, 2, 0.05F);

        arrow_r1 = new ModelRenderer(this);
        arrow_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        arrow.addChild(arrow_r1);
        setRotation(arrow_r1, 2.3562F, 0.0F, 0.0F);
        this.arrow_r1.setTextureOffset(0, 0).addBox(-8.0F, -1.4393F, 1.0607F, 16, 5, 0, 0.0F);

        arrow_r2 = new ModelRenderer(this);
        arrow_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        arrow.addChild(arrow_r2);
        setRotation(arrow_r2, 0.7854F, 0.0F, 0.0F);
        this.arrow_r2.setTextureOffset(0, 0).addBox(-8.0F, -3.5607F, 1.0607F, 16, 5, 0, 0.0F);

        //--- PIRATE ---//
        pirate = new ModelRenderer(this);
        pirate.setRotationPoint(0.0F, -0.01F, 0.0F);

        pirate_hat = new ModelRenderer(this);
        pirate_hat.setRotationPoint(0.0F, 0.0F, 0.0F);
        pirate.addChild(pirate_hat);
        this.pirate_hat.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -4.0F, 8, 5, 8, 0.1F);
        this.pirate_hat.setTextureOffset(32, 0).addBox(-4.0F, -2.0F, -4.0F, 8, 8, 8, 0.1F);

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(3.0636F, -2.0F, 3.6438F);
        pirate_hat.addChild(bone28);
        setRotation(bone28, 0.0F, -2.0944F, 0.0F);
        this.bone28.setTextureOffset(0, 22).addBox(-3.6238F, -2.0F, -3.6F, 4, 4, 2, 0.0F);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(22.3762F, 14.0F, 46.0442F);
        bone28.addChild(cube_r1);
        setRotation(cube_r1, 0.0F, -1.0472F, 0.0F);
        this.cube_r1.setTextureOffset(0, 14).addBox(-54.0F, -16.0F, -5.75F, 12, 4, 4, 0.0F);

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(-4.6874F, -2.0F, 0.8313F);
        pirate_hat.addChild(bone27);
        setRotation(bone27, 0.0F, 2.0944F, 0.0F);
        this.bone27.setTextureOffset(0, 22).addBox(-3.6238F, -2.0F, -3.6F, 4, 4, 2, 0.0F);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(22.3762F, 14.0F, -37.0942F);
        bone27.addChild(cube_r2);
        setRotation(cube_r2, 0.0F, -1.0472F, 0.0F);
        this.cube_r2.setTextureOffset(0, 14).addBox(18.0F, -16.0F, 35.8192F, 12, 4, 4, 0.0F);

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(1.6238F, -2.0F, -4.475F);
        pirate_hat.addChild(bone26);
        this.bone26.setTextureOffset(0, 22).addBox(-3.6238F, -2.0F, -3.6F, 4, 4, 2, 0.0F);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-1.6238F, 2.0F, 4.475F);
        bone26.addChild(cube_r3);
        setRotation(cube_r3, 0.0F, -1.0472F, 0.0F);
        this.cube_r3.setTextureOffset(0, 14).addBox(-6.0F, -4.0F, -5.75F, 12, 4, 4, 0.0F);

        //---PARROT---//
        parrot = new ModelRenderer(this);
        parrot.setRotationPoint(-6.0F, -3.0F, 3.0F);
        pirate.addChild(parrot);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.25F, -1.7811F, -0.9821F);
        parrot.addChild(body);
        setRotation(body, 0.4363F, 0.0F, 0.0F);
        this.body.setTextureOffset(2, 40).addBox(-1.5F, -3.0F, -1.5F, 3, 6, 3, 0.0F);

        wing0 = new ModelRenderer(this);
        wing0.setRotationPoint(-46.5F, 8.2757F, -4.8714F);
        body.addChild(wing0);
        setRotation(wing0, 0.1745F, 0.0F, 0.0F);
        this.wing0.setTextureOffset(19, 40).addBox(47.5F, -9.8298F, 5.3829F, 1, 5, 3, 0.0F);

        wing1 = new ModelRenderer(this);
        wing1.setRotationPoint(-49.5F, 8.2757F, -4.8714F);
        body.addChild(wing1);
        setRotation(wing1, 0.1745F, 0.0F, 0.0F);
        this.wing1.setTextureOffset(19, 40).addBox(47.5F, -9.8298F, 5.3829F, 1, 5, 3, 0.0F);

        head3 = new ModelRenderer(this);
        head3.setRotationPoint(0.25F, -6.59F, -3.03F);
        parrot.addChild(head3);
        this.head3.setTextureOffset(2, 34).addBox(-1.0F, -0.21F, -0.02F, 2, 3, 2, 0.0F);
        this.head3.setTextureOffset(10, 32).addBox(-1.0F, -1.21F, -2.02F, 2, 1, 4, 0.0F);
        this.head3.setTextureOffset(11, 39).addBox(-0.5F, -0.21F, -0.92F, 1, 2, 1, 0.0F);
        this.head3.setTextureOffset(16, 39).addBox(-0.5F, -0.21F, -1.92F, 1, 1, 1, 0.0F);
        this.head3.setTextureOffset(2, 50).addBox(0.0F, -4.51F, -1.12F, 0, 5, 4, 0.0F);

        leg0 = new ModelRenderer(this);
        leg0.setRotationPoint(1.25F, 1.5F, -0.25F);
        parrot.addChild(leg0);
        this.leg0.setTextureOffset(14, 50).addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(-0.75F, 1.5F, -0.25F);
        parrot.addChild(leg1);
        this.leg1.setTextureOffset(14, 50).addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.25F, 1.1258F, 2.3947F);
        parrot.addChild(tail);
        setRotation(tail, 0.8727F, 0.0F, 0.0F);
        this.tail.setTextureOffset(22, 33).addBox(-1.5F, -2.0F, -0.5F, 3, 4, 1, 0.0F);

        //--- COWBOY ---//
        cowboy = new ModelRenderer(this);
        cowboy.setRotationPoint(0.0F, -0.0125F, 0.0F);
        this.cowboy.setTextureOffset(0, 18).addBox(-4.0F, -5.0F, -5.0F, 8, 5, 10, 0.005F);
        this.cowboy.setTextureOffset(0, 0).addBox(-6.0F, -4.0F, -7.0F, 12, 4, 14, 0.01F);

        //--- DEVIL ---//
        devil = new ModelRenderer(this);
        devil.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.devil.setTextureOffset(8, 7).addBox(-5.0F, -8.0F, 0.0F, 10, 6, 0, 0.0F);
        this.devil.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -0.5F, 8, 4, 1, 0.1F);

        //--- BANDANNA ---//
        bandanna = new ModelRenderer(this);
        bandanna.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bandanna.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -4.0F, 8, 6, 8, 0.1F);

        //--- CAT ---//
        cat = new ModelRenderer(this);
        cat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cat.setTextureOffset(0, 6).addBox(-4.0F, -4.0F, -0.5F, 8, 4, 1, 0.1F);

        cat_ears = new ModelRenderer(this);
        cat_ears.setRotationPoint(-19.0F, 12.0F, -2.0F);
        cat.addChild(cat_ears);
        this.cat_ears.setTextureOffset(9, 0).addBox(20.0F, -20.0F, 2.0F, 4, 6, 0, 0.01F);
        this.cat_ears.setTextureOffset(1, 0).addBox(14.0F, -20.0F, 2.0F, 4, 6, 0, 0.01F);

        //--- MUSHROOM_RED ---//
        mushroom_red = new ModelRenderer(this);
        mushroom_red.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mushroom_red.setTextureOffset(0, 0).addBox(-7.0F, -10.0F, -7.0F, 14, 10, 14, 0.0F);

        //--- MUSHROOM_BROWN ---//
        mushroom_brown = new ModelRenderer(this);
        mushroom_brown.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mushroom_brown.setTextureOffset(0, 0).addBox(-8.0F, -5.0F, -8.0F, 16, 5, 16, -0.01F);

    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    @Override
    public void render(Entity entity, float type, float skullShift, float f2, float rot, float f4, float f5) {
        this.setRotationAngles(type, skullShift, f2, rot, f4, f5, entity);

        this.renderHats((int)type, f5);
    }

    public void renderHats(int type, float f5)
    {
        switch (type) {
            default:
            case HatsUtil.FARMER:
                farmers.render(f5);
                break;
            case HatsUtil.WITCH:
                witch.render(f5);
                break;
            case HatsUtil.TOP:
                top.render(f5);
                break;
            case HatsUtil.CHEF:
                chef.render(f5);
                break;
            case HatsUtil.FLOWER:
                flower.render(f5);
                break;
            case HatsUtil.WOLF:
                wolf.render(f5);
                break;
            case HatsUtil.BEAST:
                direwolf.render(f5);
                break;
            case HatsUtil.BIG:
                big.render(f5);
                break;
            case HatsUtil.CROWN:
                crown.render(f5);
                break;
            case HatsUtil.SQUID:
                babysquid.render(f5);
                break;
            case HatsUtil.USHANKA:
                ushanka.render(f5);
                break;
            case HatsUtil.FROG:
                frog.render(f5);
                break;
            case HatsUtil.PUMPKIN:
                pumpkin.render(f5);
                break;
            case HatsUtil.CAP:
                cap.render(f5);
                break;
            case HatsUtil.DINO:
                dino.render(f5);
                break;
            case HatsUtil.FEZ:
                fez.render(f5);
                break;
            case HatsUtil.SANTA:
                santa.render(f5);
                break;
            case HatsUtil.FRUIT:
                fruit.render(f5);
                break;
            case HatsUtil.BAT:
                bat.render(f5);
                break;
            case HatsUtil.SPIDER:
                spider.render(f5);
                break;
            case HatsUtil.ARROW:
                arrow.render(f5);
                break;
            case HatsUtil.PIRATE:
                pirate.render(f5);
                break;
            case HatsUtil.COWBOY:
                cowboy.render(f5);
                break;
            case HatsUtil.DEVIL:
                devil.render(f5);
                break;
            case HatsUtil.BANDANNA:
                bandanna.render(f5);
                break;
            case HatsUtil.CAT:
                cat.render(f5);
                break;
            case HatsUtil.MUSHROOM_RED:
                mushroom_red.render(f5);
                break;
            case HatsUtil.MUSHROOM_BROWN:
                mushroom_brown.render(f5);
                break;
        }
    }

    /**
     * Sets the model's various rotation angles. For bipeds, f and f1 are used for animating the movement of arms
     * and legs, where f represents the time(so that arms and legs swing back and forth) and f1 represents how
     * "far" arms and legs can swing at most.
     */
    @Override
    public void setRotationAngles(float type, float skullShift, float f2, float rot, float f4, float f5, Entity entity) {
        this.farmers.rotateAngleY = rot / (180F / (float)Math.PI);
        this.farmers.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.witch.rotateAngleY = rot / (180F / (float)Math.PI);
        this.witch.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.top.rotateAngleY = rot / (180F / (float)Math.PI);
        this.top.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.chef.rotateAngleY = rot / (180F / (float)Math.PI);
        this.chef.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.flower.rotateAngleY = rot / (180F / (float)Math.PI);
        this.flower.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.wolf.rotateAngleY = rot / (180F / (float)Math.PI);
        this.wolf.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.direwolf.rotateAngleY = rot / (180F / (float)Math.PI);
        this.direwolf.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.big.rotateAngleY = rot / (180F / (float)Math.PI);
        this.big.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.crown.rotateAngleY = rot / (180F / (float)Math.PI);
        this.crown.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.babysquid.rotateAngleY = rot / (180F / (float)Math.PI);
        this.babysquid.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.ushanka.rotateAngleY = rot / (180F / (float)Math.PI);
        this.ushanka.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.frog.rotateAngleY = rot / (180F / (float)Math.PI);
        this.frog.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.pumpkin.rotateAngleY = rot / (180F / (float)Math.PI);
        this.pumpkin.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.cap.rotateAngleY = rot / (180F / (float)Math.PI);
        this.cap.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.dino.rotateAngleY = rot / (180F / (float)Math.PI);
        this.dino.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.fez.rotateAngleY = rot / (180F / (float)Math.PI);
        this.fez.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.santa.rotateAngleY = rot / (180F / (float)Math.PI);
        this.santa.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.fruit.rotateAngleY = rot / (180F / (float)Math.PI);
        this.fruit.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.bat.rotateAngleY = rot / (180F / (float)Math.PI);
        this.bat.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.spider.rotateAngleY = rot / (180F / (float)Math.PI);
        this.spider.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.arrow.rotateAngleY = rot / (180F / (float)Math.PI);
        this.arrow.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.pirate.rotateAngleY = rot / (180F / (float)Math.PI);
        this.pirate.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.cowboy.rotateAngleY = rot / (180F / (float)Math.PI);
        this.cowboy.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.devil.rotateAngleY = rot / (180F / (float)Math.PI);
        this.devil.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.bandanna.rotateAngleY = rot / (180F / (float)Math.PI);
        this.bandanna.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.cat.rotateAngleY = rot / (180F / (float)Math.PI);
        this.cat.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.mushroom_red.rotateAngleY = rot / (180F / (float)Math.PI);
        this.mushroom_red.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.mushroom_brown.rotateAngleY = rot / (180F / (float)Math.PI);
        this.mushroom_brown.rotateAngleX = f4 / (180F / (float)Math.PI);

    }

    /**
     *	Sets the rotation of a ModelRenderer. Only called if the ModelRenderer has a rotation
     */
    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}