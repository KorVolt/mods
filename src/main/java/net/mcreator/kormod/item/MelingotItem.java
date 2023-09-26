
package net.mcreator.kormod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MelingotItem extends Item {
	public MelingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
