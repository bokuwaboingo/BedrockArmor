package com.bokuwaboingo.bedrockarmor.common.items;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;
import com.bokuwaboingo.bedrockarmor.BedrockArmor.BedrockArmorItemGroup;
import com.bokuwaboingo.bedrockarmor.core.enums.BedrockArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.NonNullList;

public class BedrockLeggingsItem extends ArmorItem
{
	public BedrockLeggingsItem()
	{
		super(BedrockArmorMaterial.BEDROCK, EquipmentSlotType.LEGS, new Item.Properties().group(BedrockArmorItemGroup.instance));
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
	{
		if (this.isInGroup(group))
		{
			ItemStack stack = new ItemStack(this);
			
			BedrockArmor.enchant("leggings", stack);
			
			BedrockArmor.attribute("leggings", stack);
			
			items.add(stack);
		}
	}
}
