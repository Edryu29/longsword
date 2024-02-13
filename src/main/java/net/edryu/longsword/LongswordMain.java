package net.edryu.longsword;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LongswordMain implements ModInitializer {

	public static final int longswordDamage = 6;
	public static final float dlongswordSpeed = -3.0f;

    public static final LongswordItem WoodenLongswordItem = registerLongsword("wooden_longsword", new LongswordItem(ToolMaterials.WOOD, 6, -3.0F, new Item.Settings()));
    public static final LongswordItem StoneLongswordItem = registerLongsword("stone_longsword", new LongswordItem(ToolMaterials.WOOD, 6, -3.0F, new Item.Settings()));
    public static final LongswordItem IronLongswordItem = registerLongsword("iron_longsword", new LongswordItem(ToolMaterials.WOOD, 6, -3.0F, new Item.Settings()));
    public static final LongswordItem GoldenLongswordItem = registerLongsword("golden_longsword", new LongswordItem(ToolMaterials.WOOD, 6, -3.0F, new Item.Settings()));
    public static final LongswordItem DiamondLongswordItem = registerLongsword("diamond_longsword", new LongswordItem(ToolMaterials.WOOD, 6, -3.0F, new Item.Settings()));
    public static final LongswordItem NetheriteLongswordItem = registerLongsword("netherite_longsword", new LongswordItem(ToolMaterials.WOOD, 6, -3.0F, new Item.Settings()));

	public static LongswordItem registerLongsword(String name, LongswordItem item) {
		return Registry.register(Registries.ITEM, new Identifier("longsword", name), item);
	}

	@Override
	public void onInitialize() {}
}