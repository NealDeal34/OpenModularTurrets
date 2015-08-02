package openmodularturrets.client.render.renderers.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import openmodularturrets.client.render.models.ModelExpander;
import openmodularturrets.client.render.renderers.blockitem.ExpanderInvTierFourRenderer;
import openmodularturrets.tileentity.expander.ExpanderInvTierFourTileEntity;
import org.lwjgl.opengl.GL11;

public class ExpanderInvTierFourItemRenderer implements IItemRenderer {
    private final ExpanderInvTierFourRenderer expanderInvTierFourRenderer;
    private final ExpanderInvTierFourTileEntity expanderInvTierFourTileEntity;
    private final ModelExpander model;

    public ExpanderInvTierFourItemRenderer(ExpanderInvTierFourRenderer expanderInvTierFourRenderer, ExpanderInvTierFourTileEntity expanderInvTierFourTileEntity) {
        this.expanderInvTierFourRenderer = expanderInvTierFourRenderer;
        this.expanderInvTierFourTileEntity = expanderInvTierFourTileEntity;
        this.model = new ModelExpander();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        GL11.glTranslated(-0.5, -0.5, -0.5);
        this.expanderInvTierFourRenderer.renderTileEntityAt(this.expanderInvTierFourTileEntity, 00.1D, 0.1D, -0.2D,
                                                            0.0F);
        GL11.glPopMatrix();
    }
}