package btw.community.sockthing.block.tileentity;

import btw.block.tileentity.TileEntityDataPacketHandler;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet132TileEntityData;
import net.minecraft.src.TileEntity;

public class HatTileEntity extends TileEntity implements TileEntityDataPacketHandler {
    /** Entity type for this skull. */
    private int skullType;

    /** The skull's rotation. */
    private int skullRotation;
    private float yShift;
    private float xShift;
    private float zShift;


    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound tag)
    {
        super.writeToNBT(tag);

        tag.setByte("SkullType", (byte)(this.skullType & 255));
        tag.setByte("Rot", (byte)(this.skullRotation & 255));
        tag.setFloat("XShift", this.xShift);
        tag.setFloat("YShift", this.yShift);
        tag.setFloat("ZShift", this.zShift);
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);

        if (tag.hasKey("SkullType"))
        {
            this.skullType = tag.getByte("SkullType");
        }
        if (tag.hasKey("Rot"))
        {
            this.skullRotation = tag.getByte("Rot");
        }
        if (tag.hasKey("XShift"))
        {
            this.xShift = tag.getFloat("XShift");
        }
        if (tag.hasKey("YShift"))
        {
            this.yShift = tag.getFloat("YShift");
        }
        if (tag.hasKey("ZShift"))
        {
            this.zShift = tag.getFloat("ZShift");
        }
    }

    /**
     * Overriden in a sign to provide the text.
     */
    public Packet getDescriptionPacket()
    {
        NBTTagCompound tag = new NBTTagCompound();
        tag.setByte("SkullType", (byte)(this.skullType & 255));
        tag.setByte("Rot", (byte)(this.skullRotation & 255));
        tag.setFloat("XShift", this.xShift);
        tag.setFloat("YShift", this.yShift);
        tag.setFloat("ZShift", this.zShift);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, tag);
    }

    //------------- FCITileEntityDataPacketHandler ------------//

    @Override
    public void readNBTFromPacket( NBTTagCompound tag )
    {
        if (tag.hasKey("SkullType"))
        {
            this.skullType = tag.getByte("SkullType");
        }
        if (tag.hasKey("Rot"))
        {
            this.skullRotation = tag.getByte("Rot");
        }
        if (tag.hasKey("XShift"))
        {
            this.xShift = tag.getFloat("XShift");
        }
        if (tag.hasKey("YShift"))
        {
            this.yShift = tag.getFloat("YShift");
        }
        if (tag.hasKey("ZShift"))
        {
            this.zShift = tag.getFloat("ZShift");
        }
    }

    /**
     * Set the entity type for the skull
     */
    public void setHatType(int par1)
    {
        this.skullType = par1;
    }

    /**
     * Get the entity type for the skull
     */
    public int getHatType()
    {
        return this.skullType;
    }

    public int getHatRotation()
    {
        return this.skullRotation;
    }

    /**
     * Set the skull's rotation
     */
    public void setHatRotation(int par1)
    {
        this.skullRotation = par1;
    }


    public float getXShift() {
        return this.xShift;
    }

    public void setXShift(float xShift) {
        this.xShift = xShift;
    }

    public float getYShift() {
        return this.yShift;
    }

    public void setYShift(float yShift) {
        this.yShift = yShift;
    }

    public float getZShift() {
        return this.zShift;
    }

    public void setZShift(float zShift) {
        this.zShift = zShift;
    }

    // FCMOD: Code added
    public int GetSkullRotationServerSafe()
    {
        return this.skullRotation;
    }
    // END FCMOD
}
