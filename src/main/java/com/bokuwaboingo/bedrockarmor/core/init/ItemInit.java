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
}
