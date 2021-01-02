package com.bokuwaboingo.bedrockarmor.common.items;

import com.bokuwaboingo.bedrockarmor.BedrockArmor.BedrockArmorItemGroup;
import com.bokuwaboingo.bedrockarmor.core.enums.BedrockItemTier;
import com.bokuwaboingo.bedrockarmor.BedrockArmor;

import net.minecraft.item.*;
import net.minecraft.util.NonNullList;

public class BedrockSwordItem extends SwordItem
{
	public BedrockSwordItem()
	{
		super(BedrockItemTier.BEDROCK, 3, -2.4f, new Item.Properties().group(BedrockArmorItemGroup.instance));
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
	{
		ItemStack stack = new ItemStack(this);
		
		BedrockArmor.enchant("sword", stack);
		
		items.add(stack);
	}
}
