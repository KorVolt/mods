
package net.mcreator.kormod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GemmeItem extends Item {
	public GemmeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
