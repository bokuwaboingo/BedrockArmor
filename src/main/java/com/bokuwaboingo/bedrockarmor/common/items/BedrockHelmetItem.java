package com.bokuwaboingo.bedrockarmor.common.items;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;
import com.bokuwaboingo.bedrockarmor.BedrockArmor.BedrockArmorItemGroup;
import com.bokuwaboingo.bedrockarmor.core.enums.BedrockArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.NonNullList;

public class BedrockHelmetItem extends ArmorItem
{
	public BedrockHelmetItem()
	{
		super(BedrockArmorMaterial.BEDROCK, EquipmentSlotType.HEAD, new Item.Properties().group(BedrockArmorItemGroup.instance));
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
	{
		if (this.isInGroup(group))
		{
			ItemStack stack = new ItemStack(this);
			
			BedrockArmor.enchant("helmet", stack);
			
			BedrockArmor.attribute("helmet", stack);
			
			items.add(stack);
		}
	}
}
