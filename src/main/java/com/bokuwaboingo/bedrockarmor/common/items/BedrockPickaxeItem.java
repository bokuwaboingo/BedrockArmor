package com.bokuwaboingo.bedrockarmor.common.items;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;
import com.bokuwaboingo.bedrockarmor.BedrockArmor.BedrockArmorItemGroup;
import com.bokuwaboingo.bedrockarmor.core.enums.BedrockItemTier;

import net.minecraft.item.*;
import net.minecraft.util.NonNullList;

public class BedrockPickaxeItem extends PickaxeItem
{
	public BedrockPickaxeItem() 
	{
		super(BedrockItemTier.BEDROCK, 1, -2.8f, new Item.Properties().group(BedrockArmorItemGroup.instance));
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
	{
		if (this.isInGroup(group))
		{
			ItemStack stack = new ItemStack(this);
			
			BedrockArmor.enchant("pickaxe", stack);
			
			items.add(stack);
		}
	}
}
