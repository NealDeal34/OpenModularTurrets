package modularTurrets.gui.customSlot;

import modularTurrets.items.AddonItem;
import modularTurrets.items.UpgradeItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class AddonSlot extends Slot {

	public AddonSlot(IInventory par1iInventory, int par2, int par3, int par4) {
		super(par1iInventory, par2, par3, par4);
	}
	
	@Override
	public boolean isItemValid(ItemStack par1ItemStack) {
		if(par1ItemStack.getItem() instanceof AddonItem)
		{
			return true;
		}
		return false;
	}

}