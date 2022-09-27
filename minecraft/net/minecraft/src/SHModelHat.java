// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.5.2
// Paste this class into your mod and call render() in your Entity Render class
// Note: You may need to adjust the y values of the 'setRotationPoint's

package net.minecraft.src;

public class SHModelHat extends ModelBase {
	private final ModelRenderer farmers;
	private final ModelRenderer brim_r1;
	private final ModelRenderer witch;
	private final ModelRenderer hat3;
	private final ModelRenderer hat4;
	private final ModelRenderer hat5;
	private final ModelRenderer top;
	private final ModelRenderer chef;
	private final ModelRenderer flower;
	private final ModelRenderer direwolf;
	private final ModelRenderer bone2;
	private final ModelRenderer wolf;
	private final ModelRenderer bone8;
	private final ModelRenderer big;
	private final ModelRenderer brim_r2;
	private final ModelRenderer bone4;
	private final ModelRenderer helmet_r1;
	private final ModelRenderer helmet_r2;
	private final ModelRenderer crown;
	private final ModelRenderer squid;
	private final ModelRenderer bone7;
	private final ModelRenderer helmet_r3;
	private final ModelRenderer helmet_r4;
	private final ModelRenderer helmet_r5;
	private final ModelRenderer helmet_r6;
	private final ModelRenderer helmet_r7;
	private final ModelRenderer helmet_r8;
	private final ModelRenderer helmet_r9;
	private final ModelRenderer ushanka;
	private final ModelRenderer babyhat;
	private final ModelRenderer legs;
	private final ModelRenderer helmet_r10;
	private final ModelRenderer helmet_r11;
	private final ModelRenderer helmet_r12;
	private final ModelRenderer helmet_r13;
	private final ModelRenderer helmet_r14;
	private final ModelRenderer helmet_r15;
	private final ModelRenderer helmet_r16;
	private final ModelRenderer helmet_r17;
	private final ModelRenderer frog;
	private final ModelRenderer body;
	private final ModelRenderer head2;
	private final ModelRenderer eyes;
	private final ModelRenderer right_eye;
	private final ModelRenderer left_eye;
	private final ModelRenderer croaking_body;
	private final ModelRenderer tongue;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public SHModelHat() {
		textureWidth = 64;
		textureHeight = 64;
		
		farmers = new ModelRenderer(this);
		farmers.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.farmers.setTextureOffset(32, 0).addBox(-4.0F, -5.5F, -4.0F, 8, 4, 8, 0.5F);

		brim_r1 = new ModelRenderer(this);
		brim_r1.setRotationPoint(0.0F, 4.5F, -5.5F);
		farmers.addChild(brim_r1);
		setRotation(brim_r1, -1.5708F, 0.0F, 0.0F);
		this.brim_r1.setTextureOffset(30, 47).addBox(-8.0F, -13.5F, -5.5F, 16, 16, 1, 0.0F);

		witch = new ModelRenderer(this);
		witch.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.witch.setTextureOffset(0, 0).addBox(-5.0F, -2.05F, -5.0F, 10, 2, 10, 0.0F);

		hat3 = new ModelRenderer(this);
		hat3.setRotationPoint(1.75F, -4.0F, 2.0F);
		witch.addChild(hat3);
		setRotation(hat3, -0.0524F, 0.0F, 0.0262F);
		this.hat3.setTextureOffset(0, 12).addBox(-4.8953F, -1.5069F, -4.7907F, 7, 4, 7, 0.0F);

		hat4 = new ModelRenderer(this);
		hat4.setRotationPoint(0.0F, -3.0F, 0.0F);
		hat3.addChild(hat4);
		setRotation(hat4, -0.1047F, 0.0F, 0.0524F);
		this.hat4.setTextureOffset(0, 23).addBox(-2.9365F, -1.5615F, -2.3756F, 4, 4, 4, 0.0F);

		hat5 = new ModelRenderer(this);
		hat5.setRotationPoint(0.0F, -3.0F, 0.0F);
		hat4.addChild(hat5);
		setRotation(hat5, -0.2094F, 0.0F, 0.1047F);
		this.hat5.setTextureOffset(0, 31).addBox(-0.7765F, -0.3305F, 0.4183F, 1, 2, 1, 0.25F);

		top = new ModelRenderer(this);
		top.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.top.setTextureOffset(32, 0).addBox(-4.0F, -9.0F, -4.0F, 8, 8, 8, 0.5F);
		this.top.setTextureOffset(16, 16).addBox(-6.0F, -2.05F, -6.0F, 12, 2, 12, 0.0F);

		chef = new ModelRenderer(this);
		chef.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chef.setTextureOffset(32, 0).addBox(-4.0F, -10.5F, -4.0F, 8, 10, 8, 0.5F);

		flower = new ModelRenderer(this);
		flower.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.flower.setTextureOffset(32, 0).addBox(-4.0F, -3.5F, -4.0F, 8, 3, 8, 0.5F);

		direwolf = new ModelRenderer(this);
		direwolf.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.direwolf.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 10, 8, 0.5F);
		this.direwolf.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 10, 8, 0.5F);
		this.direwolf.setTextureOffset(21, 0).addBox(-4.0F, -11.0F, 0.5F, 2, 2, 1, 0.5F);
		this.direwolf.setTextureOffset(21, 0).addBox(2.0F, -11.0F, 0.5F, 2, 2, 1, 0.5F);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-16.0F, 26.25F, 0.0F);
		direwolf.addChild(bone2);
		this.bone2.setTextureOffset(0, 0).addBox(14.5F, -29.5F, -8.0F, 3, 2, 3, 0.5F);
		this.bone2.setTextureOffset(17, 4).addBox(14.5F, -27.5F, -8.0F, 3, 1, 3, 0.49F);

		wolf = new ModelRenderer(this);
		wolf.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.wolf.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 10, 8, 0.5F);
		this.wolf.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 10, 8, 0.5F);
		this.wolf.setTextureOffset(21, 0).addBox(-4.0F, -11.0F, 0.5F, 2, 2, 1, 0.5F);
		this.wolf.setTextureOffset(21, 0).addBox(2.0F, -11.0F, 0.5F, 2, 2, 1, 0.5F);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-16.0F, 26.25F, 0.0F);
		wolf.addChild(bone8);
		this.bone8.setTextureOffset(0, 0).addBox(14.5F, -29.5F, -8.0F, 3, 2, 3, 0.5F);
		this.bone8.setTextureOffset(17, 4).addBox(14.5F, -27.5F, -8.0F, 3, 1, 3, 0.49F);

		big = new ModelRenderer(this);
		big.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.big.setTextureOffset(32, 0).addBox(-4.0F, -5.5F, -4.0F, 8, 4, 8, 0.5F);

		brim_r2 = new ModelRenderer(this);
		brim_r2.setRotationPoint(0.0F, 4.5F, -5.5F);
		big.addChild(brim_r2);
		setRotation(brim_r2, -1.5708F, 0.0F, 0.0F);
		this.brim_r2.setTextureOffset(17, 23).addBox(-10.0F, -15.5F, -5.5F, 20, 20, 1, 0.0F);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(4.5833F, -7.75F, 2.6667F);
		big.addChild(bone4);
		setRotation(bone4, 0.829F, 0.0F, 0.0F);
		this.bone4.setTextureOffset(18, 0).addBox(-0.0833F, 1.2024F, -3.6158F, 1, 3, 1, 0.0F);

		helmet_r1 = new ModelRenderer(this);
		helmet_r1.setRotationPoint(-0.0833F, 0.0F, -1.1667F);
		bone4.addChild(helmet_r1);
		setRotation(helmet_r1, 0.0F, -0.3927F, 0.0F);
		this.helmet_r1.setTextureOffset(0, 0).addBox(-1.1666F, 1.2024F, -5.416F, 1, 3, 4, 0.0F);

		helmet_r2 = new ModelRenderer(this);
		helmet_r2.setRotationPoint(-0.0833F, 0.0F, 1.3333F);
		bone4.addChild(helmet_r2);
		setRotation(helmet_r2, 0.0F, 0.3927F, 0.0F);
		this.helmet_r2.setTextureOffset(0, 9).addBox(1.0905F, 1.2024F, -4.0333F, 1, 3, 4, 0.0F);

		crown = new ModelRenderer(this);
		crown.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.crown.setTextureOffset(0, 0).addBox(-4.0F, -1.5F, -4.0F, 8, 3, 8, 0.49F);
		this.crown.setTextureOffset(0, 12).addBox(-4.0F, -4.5F, -4.0F, 8, 4, 8, 0.5F);

		squid = new ModelRenderer(this);
		squid.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.squid.setTextureOffset(32, 0).addBox(-4.0F, -10.5F, -4.0F, 8, 10, 8, 0.5F);
		this.squid.setTextureOffset(32, 19).addBox(-4.0F, -0.5F, -4.0F, 8, 0, 8, 0.49F);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -4.5F, 0.0F);
		squid.addChild(bone7);
		

		helmet_r3 = new ModelRenderer(this);
		helmet_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(helmet_r3);
		setRotation(helmet_r3, 0.0F, 0.0F, 0.2618F);
		this.helmet_r3.setTextureOffset(31, 43).addBox(-2.9647F, 4.8637F, -0.5F, 1, 10, 1, 0.5F);

		helmet_r4 = new ModelRenderer(this);
		helmet_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(helmet_r4);
		setRotation(helmet_r4, 0.0F, 0.0F, -0.2618F);
		this.helmet_r4.setTextureOffset(31, 43).addBox(1.9647F, 4.8637F, -0.5F, 1, 10, 1, 0.5F);

		helmet_r5 = new ModelRenderer(this);
		helmet_r5.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone7.addChild(helmet_r5);
		setRotation(helmet_r5, -0.2533F, 0.067F, 0.2533F);
		this.helmet_r5.setTextureOffset(31, 43).addBox(-3.0F, 4.7321F, -2.9647F, 1, 10, 1, 0.5F);

		helmet_r6 = new ModelRenderer(this);
		helmet_r6.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone7.addChild(helmet_r6);
		setRotation(helmet_r6, 0.2533F, -0.067F, 0.2533F);
		this.helmet_r6.setTextureOffset(31, 43).addBox(-3.0F, 4.7321F, 1.9647F, 1, 10, 1, 0.5F);

		helmet_r7 = new ModelRenderer(this);
		helmet_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(helmet_r7);
		setRotation(helmet_r7, 0.2618F, 0.0F, 0.0F);
		this.helmet_r7.setTextureOffset(31, 43).addBox(-0.5F, 4.8637F, 1.9647F, 1, 10, 1, 0.5F);

		helmet_r8 = new ModelRenderer(this);
		helmet_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone7.addChild(helmet_r8);
		setRotation(helmet_r8, 0.2533F, 0.067F, -0.2533F);
		this.helmet_r8.setTextureOffset(31, 43).addBox(2.0F, 4.7321F, 1.9647F, 1, 10, 1, 0.5F);

		helmet_r9 = new ModelRenderer(this);
		helmet_r9.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone7.addChild(helmet_r9);
		setRotation(helmet_r9, -0.2533F, -0.067F, -0.2533F);
		this.helmet_r9.setTextureOffset(31, 43).addBox(2.0F, 4.7321F, -2.9647F, 1, 10, 1, 0.5F);

		ushanka = new ModelRenderer(this);
		ushanka.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ushanka.setTextureOffset(10, 40).addBox(-4.0F, -6.0F, -4.0F, 8, 11, 8, 0.5F);
		this.ushanka.setTextureOffset(7, 1).addBox(-4.0F, -4.5F, -5.0F, 8, 3, 0, 0.5F);

		babyhat = new ModelRenderer(this);
		babyhat.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotation(babyhat, 0.0F, 0.0F, 0.0F);
		this.babyhat.setTextureOffset(20, 21).addBox(-2.0F, -7.0F, -2.0F, 4, 6, 4, 0.5F);

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, -1.0F, 0.0F);
		babyhat.addChild(legs);
		

		helmet_r10 = new ModelRenderer(this);
		helmet_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(helmet_r10);
		setRotation(helmet_r10, 0.0F, 0.0F, 0.6109F);
		this.helmet_r10.setTextureOffset(33, 45).addBox(-1.75F, 0.75F, 0.0F, 0, 4, 0, 0.5F);

		helmet_r11 = new ModelRenderer(this);
		helmet_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(helmet_r11);
		setRotation(helmet_r11, 0.0F, 0.0F, -0.5672F);
		this.helmet_r11.setTextureOffset(33, 45).addBox(1.75F, 0.75F, 0.0F, 0, 4, 0, 0.5F);

		helmet_r12 = new ModelRenderer(this);
		helmet_r12.setRotationPoint(0.0F, 0.5F, 0.0F);
		legs.addChild(helmet_r12);
		setRotation(helmet_r12, -0.5715F, 0.2126F, 0.4732F);
		this.helmet_r12.setTextureOffset(33, 45).addBox(-1.75F, 0.75F, -1.75F, 0, 4, 0, 0.5F);

		helmet_r13 = new ModelRenderer(this);
		helmet_r13.setRotationPoint(0.0F, 0.5F, 0.0F);
		legs.addChild(helmet_r13);
		setRotation(helmet_r13, 0.2533F, -0.067F, 0.2533F);
		this.helmet_r13.setTextureOffset(33, 45).addBox(-1.75F, 0.75F, 1.75F, 0, 4, 0, 0.5F);

		helmet_r14 = new ModelRenderer(this);
		helmet_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(helmet_r14);
		setRotation(helmet_r14, -0.6981F, 0.0F, 0.0F);
		this.helmet_r14.setTextureOffset(33, 45).addBox(0.0F, 0.75F, -1.75F, 0, 4, 0, 0.5F);

		helmet_r15 = new ModelRenderer(this);
		helmet_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(helmet_r15);
		setRotation(helmet_r15, 0.5672F, 0.0F, 0.0F);
		this.helmet_r15.setTextureOffset(33, 45).addBox(0.0F, 0.75F, 1.75F, 0, 4, 0, 0.5F);

		helmet_r16 = new ModelRenderer(this);
		helmet_r16.setRotationPoint(0.0F, 0.5F, 0.0F);
		legs.addChild(helmet_r16);
		setRotation(helmet_r16, 0.2533F, 0.067F, -0.2533F);
		this.helmet_r16.setTextureOffset(33, 45).addBox(1.75F, 0.75F, 1.75F, 0, 4, 0, 0.5F);

		helmet_r17 = new ModelRenderer(this);
		helmet_r17.setRotationPoint(0.0F, 0.5F, 0.0F);
		legs.addChild(helmet_r17);
		setRotation(helmet_r17, -0.5789F, -0.1889F, -0.4359F);
		this.helmet_r17.setTextureOffset(33, 45).addBox(1.75F, 0.75F, -1.75F, 0, 4, 0, 0.5F);

		frog = new ModelRenderer(this);
		frog.setRotationPoint(0.0F, 0.0F, -0.5F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -2.0F, 4.0F);
		frog.addChild(body);
		this.body.setTextureOffset(0, 12).addBox(-3.5F, -2.0F, -8.0F, 7, 3, 9, 0.0F);
		this.body.setTextureOffset(14, 12).addBox(-3.5F, -1.0F, -8.0F, 7, 0, 9, 0.0F);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -2.0F, -1.0F);
		body.addChild(head2);
		this.head2.setTextureOffset(7, 0).addBox(-3.5F, -1.0F, -7.0F, 7, 0, 9, 0.0F);
		this.head2.setTextureOffset(0, 0).addBox(-3.5F, -2.0F, -7.0F, 7, 3, 9, 0.0F);

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(-0.5F, 0.0F, 2.0F);
		head2.addChild(eyes);
		

		right_eye = new ModelRenderer(this);
		right_eye.setRotationPoint(-1.5F, -3.0F, -6.5F);
		eyes.addChild(right_eye);
		this.right_eye.setTextureOffset(9, 39).addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);

		left_eye = new ModelRenderer(this);
		left_eye.setRotationPoint(2.5F, -3.0F, -6.5F);
		eyes.addChild(left_eye);
		this.left_eye.setTextureOffset(0, 37).addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);

		croaking_body = new ModelRenderer(this);
		croaking_body.setRotationPoint(0.0F, -1.0F, -5.0F);
		body.addChild(croaking_body);
		this.croaking_body.setTextureOffset(0, 32).addBox(-3.5F, -0.1F, -2.9F, 7, 2, 3, -0.1F);

		tongue = new ModelRenderer(this);
		tongue.setRotationPoint(0.0F, -1.1F, 1.0F);
		body.addChild(tongue);
		this.tongue.setTextureOffset(30, 16).addBox(-2.0F, 0.0F, -7.1F, 4, 0, 7, 0.0F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, -1.0F, -6.5F);
		body.addChild(left_arm);
		this.left_arm.setTextureOffset(31, 39).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 3, 0.0F);
		this.left_arm.setTextureOffset(29, 8).addBox(-4.0F, 3.01F, -5.0F, 8, 0, 8, 0.0F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -1.0F, -6.5F);
		body.addChild(right_arm);
		this.right_arm.setTextureOffset(21, 39).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 3, 0.0F);
		this.right_arm.setTextureOffset(29, 0).addBox(-4.0F, 3.01F, -5.0F, 8, 0, 8, 0.0F);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.5F, -3.0F, 4.0F);
		frog.addChild(left_leg);
		this.left_leg.setTextureOffset(34, 32).addBox(-1.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
		this.left_leg.setTextureOffset(16, 24).addBox(-2.0F, 3.01F, -4.0F, 8, 0, 8, 0.0F);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.5F, -3.0F, 4.0F);
		frog.addChild(right_leg);
		this.right_leg.setTextureOffset(20, 32).addBox(-2.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
		this.right_leg.setTextureOffset(0, 24).addBox(-6.0F, 3.01F, -4.0F, 8, 0, 8, 0.0F);
	}

	/**
	* Sets the models various rotation angles then renders the model.
	*/
	@Override
	public void render(Entity entity, float type, float f1, float f2, float rot, float f4, float f5) {
		this.setRotationAngles(type, f1, f2, rot, f4, f5, entity);
		
		farmers.render(f5);
		witch.render(f5);
		top.render(f5);
		chef.render(f5);
		flower.render(f5);
		direwolf.render(f5);
		wolf.render(f5);
		big.render(f5);
		crown.render(f5);
		squid.render(f5);
		ushanka.render(f5);
		babyhat.render(f5);
		frog.render(f5);
		
		//this.renderHats((int)type, f5);
	}
	
	public void renderHats(int type, float f5)
	{	
		switch (type) {
		default:
		case 0:
			farmers.render(f5);
			break;
		case 1:
			witch.render(f5);
			break;
		case 2:
			top.render(f5);
			break;
		case 3:
			chef.render(f5);
			break;
		case 4:
			flower.render(f5);
			break;
		case 5:
			wolf.render(f5);
			break;
		case 6:
			direwolf.render(f5);
			break;
		case 7:
			big.render(f5);
			break;
		case 8:
			crown.render(f5);
			break;
		case 9:
			babyhat.render(f5);
			break;
		case 10:
			ushanka.render(f5);
			break;
		case 11:
			frog.render(f5);
			break;
		}
	}

	/**
	* Sets the model's various rotation angles. For bipeds, f and f1 are used for animating the movement of arms
	* and legs, where f represents the time(so that arms and legs swing back and forth) and f1 represents how
	* "far" arms and legs can swing at most.
	*/
	@Override
    public void setRotationAngles(float type, float f1, float f2, float rot, float f4, float f5, Entity entity) {
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
        
        this.babyhat.rotateAngleY = rot / (180F / (float)Math.PI);
        this.babyhat.rotateAngleX = f4 / (180F / (float)Math.PI);
        
        this.ushanka.rotateAngleY = rot / (180F / (float)Math.PI);
        this.ushanka.rotateAngleX = f4 / (180F / (float)Math.PI);
        
        this.frog.rotateAngleY = rot / (180F / (float)Math.PI);
        this.frog.rotateAngleX = f4 / (180F / (float)Math.PI);
        
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


//// Made with Blockbench 4.3.1
//// Exported for Minecraft version 1.5.2
//// Paste this class into your mod and call render() in your Entity Render class
//// Note: You may need to adjust the y values of the 'setRotationPoint's
//
//package net.minecraft.src;
//
//public class SHModelHat extends ModelBase {
//	private final ModelRenderer farmers;
//	private final ModelRenderer brim_r1;
//	private final ModelRenderer witch;
//	private final ModelRenderer hat3;
//	private final ModelRenderer hat4;
//	private final ModelRenderer hat5;
//	private final ModelRenderer top;
//	private final ModelRenderer chef;
//	private final ModelRenderer flower;
//	private final ModelRenderer wolf;
//	private final ModelRenderer bone8;
//	private final ModelRenderer big;
//	private final ModelRenderer brim_r2;
//	private final ModelRenderer bone4;
//	private final ModelRenderer helmet_r1;
//	private final ModelRenderer helmet_r2;
//	private final ModelRenderer crown;
//	private final ModelRenderer squid;
//	private final ModelRenderer bone7;
//	private final ModelRenderer helmet_r3;
//	private final ModelRenderer helmet_r4;
//	private final ModelRenderer helmet_r5;
//	private final ModelRenderer helmet_r6;
//	private final ModelRenderer helmet_r7;
//	private final ModelRenderer helmet_r8;
//	private final ModelRenderer helmet_r9;
//	private final ModelRenderer ushanka;
//
//	public SHModelHat() {
//		textureWidth = 64;
//		textureHeight = 64;
//		
//		float shift = -24F;
//		
//		farmers = new ModelRenderer(this);
//		farmers.setRotationPoint(32.0F, 24.0F + shift, 0.0F);
//		this.farmers.setTextureOffset(32, 0).addBox(-36.0F, -10.0F, -4.0F, 8, 4, 8, 0.5F);
//
//		brim_r1 = new ModelRenderer(this);
//		brim_r1.setRotationPoint(-32.0F, 0.0F, -5.5F);
//		farmers.addChild(brim_r1);
//		setRotation(brim_r1, -1.5708F, 0.0F, 0.0F);
//		this.brim_r1.setTextureOffset(30, 47).addBox(-8.0F, -14.0F, -5.5F, 16, 16, 1, 0.0F);
//
//		witch = new ModelRenderer(this);
//		witch.setRotationPoint(0.0F, 24.0F + shift, 0.0F);
//		this.witch.setTextureOffset(0, 0).addBox(-5.0F, -8.05F, -5.0F, 10, 2, 10, 0.0F);
//
//		hat3 = new ModelRenderer(this);
//		hat3.setRotationPoint(1.75F, -6.0F, 2.0F);
//		witch.addChild(hat3);
//		setRotation(hat3, -0.0524F, 0.0F, 0.0262F);
//		this.hat3.setTextureOffset(0, 12).addBox(-5.0F, -5.5F, -5.0F, 7, 4, 7, 0.0F);
//
//		hat4 = new ModelRenderer(this);
//		hat4.setRotationPoint(0.0F, -3.0F, 0.0F);
//		hat3.addChild(hat4);
//		setRotation(hat4, -0.1047F, 0.0F, 0.0524F);
//		this.hat4.setTextureOffset(0, 23).addBox(-3.25F, -5.5F, -3.0F, 4, 4, 4, 0.0F);
//
//		hat5 = new ModelRenderer(this);
//		hat5.setRotationPoint(0.0F, -3.0F, 0.0F);
//		hat4.addChild(hat5);
//		setRotation(hat5, -0.2094F, 0.0F, 0.1047F);
//		this.hat5.setTextureOffset(0, 31).addBox(-1.5F, -4.0F, -1.0F, 1, 2, 1, 0.25F);
//
//		top = new ModelRenderer(this);
//		top.setRotationPoint(32.0F, 24.0F + shift, 0.0F);
//		this.top.setTextureOffset(32, 0).addBox(-36.0F, -15.0F, -4.0F, 8, 8, 8, 0.5F);
//		this.top.setTextureOffset(16, 16).addBox(-38.0F, -8.05F, -6.0F, 12, 2, 12, 0.0F);
//
//		chef = new ModelRenderer(this);
//		chef.setRotationPoint(-16.0F, 24.0F + shift, 0.0F);
//		this.chef.setTextureOffset(32, 0).addBox(12.0F, -17.0F, -4.0F, 8, 10, 8, 0.5F);
//
//		flower = new ModelRenderer(this);
//		flower.setRotationPoint(-16.0F, 24.0F + shift, 0.0F);
//		this.flower.setTextureOffset(32, 0).addBox(12.0F, -8.0F, -4.0F, 8, 3, 8, 0.5F);
//
//		wolf = new ModelRenderer(this);
//		wolf.setRotationPoint(0.0F, 24.0F + shift, 0.0F);
//		this.wolf.setTextureOffset(32, 0).addBox(-4.0F, -12.0F, -4.0F, 8, 10, 8, 0.5F);
//		this.wolf.setTextureOffset(32, 0).addBox(-4.0F, -12.0F, -4.0F, 8, 10, 8, 0.5F);
//		this.wolf.setTextureOffset(21, 0).addBox(-4.5F, -14.5F, 0.0F, 2, 2, 1, 0.0F);
//		this.wolf.setTextureOffset(21, 0).addBox(2.5F, -14.5F, 0.0F, 2, 2, 1, 0.0F);
//
//		bone8 = new ModelRenderer(this);
//		bone8.setRotationPoint(-16.0F, 26.25F, 0.0F);
//		wolf.addChild(bone8);
//		this.bone8.setTextureOffset(0, 0).addBox(14.5F, -33.5F, -8.0F, 3, 2, 3, 0.5F);
//		this.bone8.setTextureOffset(17, 4).addBox(14.5F, -31.5F, -8.0F, 3, 1, 3, 0.49F);
//
//		big = new ModelRenderer(this);
//		big.setRotationPoint(32.0F, 24.0F + shift, 0.0F);
//		this.big.setTextureOffset(32, 0).addBox(-36.0F, -10.0F, -4.0F, 8, 4, 8, 0.5F);
//
//		brim_r2 = new ModelRenderer(this);
//		brim_r2.setRotationPoint(-32.0F, 0.0F, -5.5F);
//		big.addChild(brim_r2);
//		setRotation(brim_r2, -1.5708F, 0.0F, 0.0F);
//		this.brim_r2.setTextureOffset(17, 23).addBox(-10.0F, -16.0F, -5.5F, 20, 20, 1, 0.0F);
//
//		bone4 = new ModelRenderer(this);
//		bone4.setRotationPoint(-27.4167F, -8.25F, 2.6667F);
//		big.addChild(bone4);
//		setRotation(bone4, 0.829F, 0.0F, 0.0F);
//		this.bone4.setTextureOffset(18, 0).addBox(-0.0833F, -1.5F, -0.6667F, 1, 3, 1, 0.0F);
//
//		helmet_r1 = new ModelRenderer(this);
//		helmet_r1.setRotationPoint(-0.0833F, 0.0F, -1.1667F);
//		bone4.addChild(helmet_r1);
//		setRotation(helmet_r1, 0.0F, -0.3927F, 0.0F);
//		this.helmet_r1.setTextureOffset(0, 0).addBox(-0.0381F, -1.5F, -2.6913F, 1, 3, 4, 0.0F);
//
//		helmet_r2 = new ModelRenderer(this);
//		helmet_r2.setRotationPoint(-0.0833F, 0.0F, 1.3333F);
//		bone4.addChild(helmet_r2);
//		setRotation(helmet_r2, 0.0F, 0.3927F, 0.0F);
//		this.helmet_r2.setTextureOffset(0, 9).addBox(-0.0381F, -1.5F, -1.3087F, 1, 3, 4, 0.0F);
//
//		crown = new ModelRenderer(this);
//		crown.setRotationPoint(-16.0F, 24.0F + shift, 0.0F);
//		this.crown.setTextureOffset(0, 0).addBox(12.0F, -8.0F, -4.0F, 8, 3, 8, 0.49F);
//		this.crown.setTextureOffset(0, 12).addBox(12.0F, -11.0F, -4.0F, 8, 4, 8, 0.5F);
//
//		squid = new ModelRenderer(this);
//		squid.setRotationPoint(0.0F, 24.0F + shift, 0.0F);
//		this.squid.setTextureOffset(32, 0).addBox(-4.0F, -14.0F, -4.0F, 8, 10, 8, 0.5F);
//		this.squid.setTextureOffset(32, 19).addBox(-4.0F, -4.0F, -4.0F, 8, 0, 8, 0.49F);
//
//		bone7 = new ModelRenderer(this);
//		bone7.setRotationPoint(0.0F, -4.0F, 0.0F);
//		squid.addChild(bone7);
//		
//
//		helmet_r3 = new ModelRenderer(this);
//		helmet_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		bone7.addChild(helmet_r3);
//		setRotation(helmet_r3, 0.0F, 0.0F, 0.2618F);
//		this.helmet_r3.setTextureOffset(31, 43).addBox(-4.0F, 1.0F, -0.5F, 1, 10, 1, 0.5F);
//
//		helmet_r4 = new ModelRenderer(this);
//		helmet_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
//		bone7.addChild(helmet_r4);
//		setRotation(helmet_r4, 0.0F, 0.0F, -0.2618F);
//		this.helmet_r4.setTextureOffset(31, 43).addBox(3.0F, 1.0F, -0.5F, 1, 10, 1, 0.5F);
//
//		helmet_r5 = new ModelRenderer(this);
//		helmet_r5.setRotationPoint(0.0F, 1.0F, 0.0F);
//		bone7.addChild(helmet_r5);
//		setRotation(helmet_r5, -0.2533F, 0.067F, 0.2533F);
//		this.helmet_r5.setTextureOffset(31, 43).addBox(-4.0F, 1.0F, -4.0F, 1, 10, 1, 0.5F);
//
//		helmet_r6 = new ModelRenderer(this);
//		helmet_r6.setRotationPoint(0.0F, 1.0F, 0.0F);
//		bone7.addChild(helmet_r6);
//		setRotation(helmet_r6, 0.2533F, -0.067F, 0.2533F);
//		this.helmet_r6.setTextureOffset(31, 43).addBox(-4.0F, 1.0F, 3.0F, 1, 10, 1, 0.5F);
//
//		helmet_r7 = new ModelRenderer(this);
//		helmet_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
//		bone7.addChild(helmet_r7);
//		setRotation(helmet_r7, 0.2618F, 0.0F, 0.0F);
//		this.helmet_r7.setTextureOffset(31, 43).addBox(-0.5F, 1.0F, 3.0F, 1, 10, 1, 0.5F);
//
//		helmet_r8 = new ModelRenderer(this);
//		helmet_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
//		bone7.addChild(helmet_r8);
//		setRotation(helmet_r8, 0.2533F, 0.067F, -0.2533F);
//		this.helmet_r8.setTextureOffset(31, 43).addBox(3.0F, 1.0F, 3.0F, 1, 10, 1, 0.5F);
//
//		helmet_r9 = new ModelRenderer(this);
//		helmet_r9.setRotationPoint(0.0F, 1.0F, 0.0F);
//		bone7.addChild(helmet_r9);
//		setRotation(helmet_r9, -0.2533F, -0.067F, -0.2533F);
//		this.helmet_r9.setTextureOffset(31, 43).addBox(3.0F, 1.0F, -4.0F, 1, 10, 1, 0.5F);
//
//		ushanka = new ModelRenderer(this);
//		ushanka.setRotationPoint(0.0F, 24.0F + shift, 0.0F);
//		this.ushanka.setTextureOffset(10, 40).addBox(-4.0F, -11.0F, -4.0F, 8, 11, 8, 0.5F);
//		this.ushanka.setTextureOffset(7, 1).addBox(-4.0F, -9.5F, -5.0F, 8, 3, 0, 0.5F);
//	}
//
//	/**
//	* Sets the models various rotation angles then renders the model.
//	*/
//	@Override
//	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//		
//		this.renderHats((int)f, f5);
//	}
//	
//	public void renderHats(int type, float f5)
//	{	
//		switch (type) {
//		default:
//		case 0:
//			farmers.render(f5);
//			break;
//		case 1:
//			witch.render(f5);
//			break;
//		case 2:
//			top.render(f5);
//			break;
//		case 3:
//			chef.render(f5);
//			break;
//		case 4:
//			flower.render(f5);
//			break;
//		case 5:
//			wolf.render(f5);
//			break;
//		case 6:
//			big.render(f5);
//			break;
//		case 7:
//			crown.render(f5);
//			break;
//		case 8:
//			squid.render(f5);
//			break;
//		case 9:
//			ushanka.render(f5);
//			break;
//		}
//	}
//
//	/**
//	* Sets the model's various rotation angles. For bipeds, f and f1 are used for animating the movement of arms
//	* and legs, where f represents the time(so that arms and legs swing back and forth) and f1 represents how
//	* "far" arms and legs can swing at most.
//	*/
//	@Override
//    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
//        //super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//        this.farmers.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.farmers.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.witch.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.witch.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.top.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.top.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.chef.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.chef.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.flower.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.flower.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.wolf.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.wolf.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.big.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.big.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.crown.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.crown.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.squid.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.squid.rotateAngleX = f3 / (180F / (float)Math.PI);
//        
//        this.ushanka.rotateAngleY = f3 / (180F / (float)Math.PI);
//        this.ushanka.rotateAngleX = f3 / (180F / (float)Math.PI);
//    }
//	
//	/**
//	*	Sets the rotation of a ModelRenderer. Only called if the ModelRenderer has a rotation
//	*/
//    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
//		modelRenderer.rotateAngleX = x;
//		modelRenderer.rotateAngleY = y;
//		modelRenderer.rotateAngleZ = z;
//	}
//}