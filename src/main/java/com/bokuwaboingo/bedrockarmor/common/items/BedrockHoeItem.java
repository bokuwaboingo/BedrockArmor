package com.bokuwaboingo.bedrockarmor.common.items;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;
import com.bokuwaboingo.bedrockarmor.BedrockArmor.BedrockArmorItemGroup;
import com.bokuwaboingo.bedrockarmor.core.enums.BedrockItemTier;

import net.minecraft.item.*;
import net.minecraft.util.NonNullList;

public class BedrockHoeItem extends HoeItem
{
	public BedrockHoeItem()
	{
		super(BedrockItemTier.BEDROCK, -4, 0f, new Item.Properties().group(BedrockArmorItemGroup.instance));
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
	{
		if (this.isInGroup(group))
		{
			ItemStack stack = new ItemStack(this);
			
			BedrockArmor.enchant("hoe", stack);
			
			items.add(stack);
		}
	}
}
