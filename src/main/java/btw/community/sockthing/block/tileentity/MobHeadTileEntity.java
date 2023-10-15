package btw.community.sockthing.block.tileentity;

import btw.block.tileentity.TileEntityDataPacketHandler;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet132TileEntityData;
import net.minecraft.src.TileEntity;

public class MobHeadTileEntity extends TileEntity implements TileEntityDataPacketHandler
{
    /** Entity type for this skull. */
    private int headType;

    /** The skull's rotation. */
    private int headRotation;
    private int fleeceColor;


    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound tag)
    {
        super.writeToNBT(tag);

        tag.setByte("SHHeadType", (byte)(this.headType & 255));
        tag.setByte("SHHeadRot", (byte)(this.headRotation & 255));
        tag.setInteger("SHHeadFleeceColor", this.fleeceColor);
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);

        if (tag.hasKey("SHHeadType"))
        {
            this.headType = tag.getByte("SHHeadType");
        }
        if (tag.hasKey("SHHeadRot"))
        {
            this.headRotation = tag.getByte("SHHeadRot");
        }
        if (tag.hasKey("SHHeadFleeceColor"))
        {
            this.fleeceColor = tag.getInteger("SHHeadFleeceColor");
        }
    }

    /**
     * Overriden in a sign to provide the text.
     */
    public Packet getDescriptionPacket()
    {
        NBTTagCompound tag = new NBTTagCompound();
        tag.setByte("SHHeadType", (byte)(this.headType & 255));
        tag.setByte("SHHeadRot", (byte)(this.headRotation & 255));
        tag.setInteger("SHHeadFleeceColor", this.fleeceColor);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, tag);
    }

    //------------- FCITileEntityDataPacketHandler ------------//

    @Override
    public void readNBTFromPacket( NBTTagCompound tag )
    {
        if (tag.hasKey("SHHeadType"))
        {
            this.headType = tag.getByte("SHHeadType");
        }
        if (tag.hasKey("SHHeadRot"))
        {
            this.headRotation = tag.getByte("SHHeadRot");
        }
        if (tag.hasKey("SHHeadFleeceColor"))
        {
            this.fleeceColor = tag.getInteger("SHHeadFleeceColor");
        }
    }

    public void setHeadType(int type)
    {
        this.headType = type;
    }

    public int getHeadType()
    {
        return this.headType;
    }

    public int getHeadRotation()
    {
        return this.headRotation;
    }

    public void setHeadRotation(int par1)
    {
        this.headRotation = par1;
    }

    public int getFleeceColor()
    {
        return this.fleeceColor;
    }

    public void setFleeceColor(int par1)
    {
        this.fleeceColor = par1;
    }

    // FCMOD: Code added
    public int GetSkullRotationServerSafe()
    {
        return this.headRotation;
    }
    // END FCMOD
}
