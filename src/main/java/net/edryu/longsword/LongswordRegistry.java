package net.edryu.longsword;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LongswordRegistry {

	public static final int longswordDamage = 6;
	public static final float longswordSpeed = -3.0f;

    public static final LongswordItem WoodenLongswordItem = registerLongsword("wooden_longsword", new LongswordItem(ToolMaterials.WOOD, longswordDamage, longswordSpeed, new Item.Settings()));
    public static final LongswordItem StoneLongswordItem = registerLongsword("stone_longsword", new LongswordItem(ToolMaterials.STONE, longswordDamage, longswordSpeed, new Item.Settings()));
    public static final LongswordItem IronLongswordItem = registerLongsword("iron_longsword", new LongswordItem(ToolMaterials.IRON, longswordDamage, longswordSpeed, new Item.Settings()));
    public static final LongswordItem GoldenLongswordItem = registerLongsword("golden_longsword", new LongswordItem(ToolMaterials.GOLD, longswordDamage, longswordSpeed, new Item.Settings()));
    public static final LongswordItem DiamondLongswordItem = registerLongsword("diamond_longsword", new LongswordItem(ToolMaterials.DIAMOND, longswordDamage, longswordSpeed, new Item.Settings()));
    public static final LongswordItem NetheriteLongswordItem = registerLongsword("netherite_longsword", new LongswordItem(ToolMaterials.NETHERITE, longswordDamage, longswordSpeed, new Item.Settings()));

	public static LongswordItem registerLongsword(String name, LongswordItem item) {
		return Registry.register(Registries.ITEM, new Identifier("longsword", name), item);
	}

	public static void init() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.addAfter(Items.NETHERITE_AXE, WoodenLongswordItem);
			content.addAfter(WoodenLongswordItem, StoneLongswordItem);
			content.addAfter(StoneLongswordItem, IronLongswordItem);
			content.addAfter(IronLongswordItem, GoldenLongswordItem);
			content.addAfter(GoldenLongswordItem, DiamondLongswordItem);
			content.addAfter(DiamondLongswordItem, NetheriteLongswordItem);
		});
	}
}