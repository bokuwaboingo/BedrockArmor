package com.bokuwaboingo.bedrockarmor.common.items;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;
import com.bokuwaboingo.bedrockarmor.BedrockArmor.BedrockArmorItemGroup;
import com.bokuwaboingo.bedrockarmor.core.enums.BedrockArmorMaterial;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;

import net.minecraft.entity.ai.attributes.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.NonNullList;

public class BedrockChestplateItem extends ArmorItem
{
	public BedrockChestplateItem()
	{
		super(BedrockArmorMaterial.BEDROCK, EquipmentSlotType.CHEST, new Item.Properties().group(BedrockArmorItemGroup.instance).isImmuneToFire());
		
		Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.put(Attributes.ARMOR, new AttributeModifier("Armor", 8, AttributeModifier.Operation.ADDITION));
		builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier("Armor Toughness", 3, AttributeModifier.Operation.ADDITION));
		builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier("Knockback Resistance", 0.1, AttributeModifier.Operation.ADDITION));
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
	{
		if (this.isInGroup(group))
		{
			ItemStack stack = new ItemStack(this);
			
			BedrockArmor.enchant("chestplate", stack);
			
			BedrockArmor.attribute("chestplate", stack);
			
			items.add(stack);
		}
	}
}
