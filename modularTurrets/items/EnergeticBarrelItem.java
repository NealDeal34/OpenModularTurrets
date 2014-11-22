package modularTurrets.items;

import modularTurrets.ModInfo;
import modularTurrets.ModularTurrets;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EnergeticBarrelItem extends Item {

	public EnergeticBarrelItem(int par1) {
		super(par1);
		this.setUnlocalizedName(ItemNames.unlocalisedEnergeticBarrel);
		this.setCreativeTab(ModularTurrets.modularTurretsTab);
		
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":energeticBarrel");
	}

}