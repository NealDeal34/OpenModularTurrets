package openmodularturrets.items.ammo;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import openmodularturrets.ModularTurrets;
import openmodularturrets.reference.ModInfo;
import openmodularturrets.reference.Names;

public class FerroSlugItem extends Item {

    public FerroSlugItem() {
        super();

        this.setUnlocalizedName(Names.Items.unlocalisedFerroSlug);
        this.setCreativeTab(ModularTurrets.modularTurretsTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":ferroSlug");
    }
}
