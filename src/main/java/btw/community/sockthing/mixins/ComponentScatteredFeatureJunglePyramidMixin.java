package btw.community.sockthing.mixins;

import btw.block.BTWBlocks;
import btw.block.blocks.AestheticOpaqueBlock;
import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.block.tileentity.HatTileEntity;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.item.BTWItems;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(ComponentScatteredFeatureJunglePyramid.class)
public abstract class ComponentScatteredFeatureJunglePyramidMixin extends ComponentScatteredFeature {
    protected ComponentScatteredFeatureJunglePyramidMixin(Random par1Random, int par2, int par3, int par4, int par5, int par6, int par7) {
        super(par1Random, par2, par3, par4, par5, par6, par7);
    }

    @Inject(method = "addComponentParts",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/src/ComponentScatteredFeatureJunglePyramid;generateStructureChestContents(Lnet/minecraft/src/World;Lnet/minecraft/src/StructureBoundingBox;Ljava/util/Random;III[Lnet/minecraft/src/WeightedRandomChestContent;I)Z",
                    ordinal = 0,
                    shift = At.Shift.AFTER
            ))
    public void genDinoHat(World world, Random generatorRand, StructureBoundingBox boundingBox, CallbackInfoReturnable<Boolean> cir) {
        if (generatorRand.nextFloat() <= 0.2F)
        {
            int rot = generatorRand.nextInt(16);
            generateStructureChestContents( world, boundingBox, Block.skull, 1, rot,
                    generatorRand, 7, -3, 4);
            generateStructureChestContents( world, boundingBox, SHBlocks.hat, 1, rot,
                    generatorRand, 7, -2, 4);
        }
    }

    protected boolean generateStructureChestContents(World par1World, StructureBoundingBox par2StructureBoundingBox, Block block, int meta, int rot, Random rand, int par4, int par5, int par6)
    {
        int var9 = this.getXWithOffset(par4, par6);
        int var10 = this.getYWithOffset(par5);
        int var11 = this.getZWithOffset(par4, par6);

        if (par2StructureBoundingBox.isVecInside(var9, var10, var11) &&
                par1World.getBlockId(var9, var10, var11) != block.blockID)
        {
            par1World.setBlock(var9, var10, var11, block.blockID, meta, 2);
            TileEntity te = par1World.getBlockTileEntity(var9, var10, var11);

            if (te != null )
            {

                if (block.blockID == Block.skull.blockID)
                {
                    TileEntitySkull skull = (TileEntitySkull) te;
                    skull.setSkullType(0,"");
//                    skull.setSkullType(3,"icynewyear");
                    skull.setSkullRotation(rot);
                }
                else if (block.blockID == SHBlocks.hat.blockID)
                {
                    HatTileEntity hat = (HatTileEntity) te;
                    hat.setHatType(HatsUtil.DINO);
                    hat.setYShift(-15/16F);
                    hat.setHatRotation(rot);
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }
}
