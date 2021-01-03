package com.bokuwaboingo.bedrockarmor.core.init;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;
import com.bokuwaboingo.bedrockarmor.common.items.*;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.*;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BedrockArmor.MOD_ID);
	
	public static final RegistryObject<Item> BEDROCK_SWORD = ITEMS.register("bedrock_sword", () -> new BedrockSwordItem());
	public static final RegistryObject<Item> BEDROCK_PICKAXE = ITEMS.register("bedrock_pickaxe", () -> new BedrockPickaxeItem());
	public static final RegistryObject<Item> BEDROCK_AXE = ITEMS.register("bedrock_axe", () -> new BedrockAxeItem());
	public static final RegistryObject<Item> BEDROCK_SHOVEL = ITEMS.register("bedrock_shovel", () -> new BedrockShovelItem());
	public static final RegistryObject<Item> BEDROCK_HOE = ITEMS.register("bedrock_hoe", () -> new BedrockHoeItem());
	public static final RegistryObject<Item> BEDROCK_HELMET = ITEMS.register("bedrock_helmet", () -> new BedrockHelmetItem());
	public static final RegistryObject<Item> BEDROCK_CHESTPLATE = ITEMS.register("bedrock_chestplate", () -> new BedrockChestplateItem());
	public static final RegistryObject<Item> BEDROCK_LEGGINGS = ITEMS.register("bedrock_leggings", () -> new BedrockLeggingsItem());
	public static final RegistryObject<Item> BEDROCK_BOOTS = ITEMS.register("bedrock_boots", () -> new BedrockBootsItem());
	
	public static final RegistryObject<BlockItem> BEDROCK_RANDOMIZER_BLOCK = ITEMS.register("bedrock_randomizer_block", () -> new BedrockRandomizerBlockItem(BlockInit.BEDROCK_RANDOMIZER_BLOCK.get()));
}
