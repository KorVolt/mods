package net.mcreator.kormod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.kormod.world.inventory.TestMenu;
import net.mcreator.kormod.network.TestButtonMessage;
import net.mcreator.kormod.KormodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TestScreen extends AbstractContainerScreen<TestMenu> {
	private final static HashMap<String, Object> guistate = TestMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_quoicoubeh;
	Button button_feur;
	Button button_ouifi;
	Button button_ta_gueule;

	public TestScreen(TestMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("kormod:textures/screens/test.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.kormod.test.label_choisi_mec"), 60, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_quoicoubeh = Button.builder(Component.translatable("gui.kormod.test.button_quoicoubeh"), e -> {
			if (true) {
				KormodMod.PACKET_HANDLER.sendToServer(new TestButtonMessage(0, x, y, z));
				TestButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 25, 77, 20).build();
		guistate.put("button:button_quoicoubeh", button_quoicoubeh);
		this.addRenderableWidget(button_quoicoubeh);
		button_feur = Button.builder(Component.translatable("gui.kormod.test.button_feur"), e -> {
			if (true) {
				KormodMod.PACKET_HANDLER.sendToServer(new TestButtonMessage(1, x, y, z));
				TestButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 25, 46, 20).build();
		guistate.put("button:button_feur", button_feur);
		this.addRenderableWidget(button_feur);
		button_ouifi = Button.builder(Component.translatable("gui.kormod.test.button_ouifi"), e -> {
			if (true) {
				KormodMod.PACKET_HANDLER.sendToServer(new TestButtonMessage(2, x, y, z));
				TestButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 52, 51, 20).build();
		guistate.put("button:button_ouifi", button_ouifi);
		this.addRenderableWidget(button_ouifi);
		button_ta_gueule = Button.builder(Component.translatable("gui.kormod.test.button_ta_gueule"), e -> {
			if (true) {
				KormodMod.PACKET_HANDLER.sendToServer(new TestButtonMessage(3, x, y, z));
				TestButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 52, 72, 20).build();
		guistate.put("button:button_ta_gueule", button_ta_gueule);
		this.addRenderableWidget(button_ta_gueule);
	}
}
