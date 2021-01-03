package com.bokuwaboingo.bedrockarmor;

import com.bokuwaboingo.bedrockarmor.core.init.*;

import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bedrockarmor")
public class BedrockArmor
{
	public static final String MOD_ID = "bedrockarmor";
	
	public BedrockArmor()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public static class BedrockArmorItemGroup extends ItemGroup
	{
		public static final BedrockArmorItemGroup instance = new BedrockArmorItemGroup();
		
		public BedrockArmorItemGroup()
		{
			super("bedrockarmor");
		}

		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(Blocks.BEDROCK);
		}
	}
	
	public static void enchant(String type, ItemStack stack)
	{
		switch (type.toLowerCase())
		{
			case "sword":
				stack.addEnchantment(Enchantments.SHARPNESS, 5);
				stack.addEnchantment(Enchantments.KNOCKBACK, 2);
				stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
				stack.addEnchantment(Enchantments.LOOTING, 3);
				stack.addEnchantment(Enchantments.SWEEPING, 3);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "pickaxe":
				stack.addEnchantment(Enchantments.EFFICIENCY, 5);
				stack.addEnchantment(Enchantments.FORTUNE, 3);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "axe":
				stack.addEnchantment(Enchantments.EFFICIENCY, 5);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "shovel":
				stack.addEnchantment(Enchantments.EFFICIENCY, 5);
				stack.addEnchantment(Enchantments.SILK_TOUCH, 1);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "hoe":
				stack.addEnchantment(Enchantments.EFFICIENCY, 5);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "helmet":
				stack.addEnchantment(Enchantments.AQUA_AFFINITY, 1);
				stack.addEnchantment(Enchantments.PROTECTION, 4);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.RESPIRATION, 3);
				stack.addEnchantment(Enchantments.THORNS, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "chestplate":
				stack.addEnchantment(Enchantments.PROTECTION, 4);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.THORNS, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "leggings":
				stack.addEnchantment(Enchantments.PROTECTION, 4);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.THORNS, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
			case "boots":
				stack.addEnchantment(Enchantments.PROTECTION, 4);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.FEATHER_FALLING, 4);
				stack.addEnchantment(Enchantments.THORNS, 3);
				stack.addEnchantment(Enchantments.DEPTH_STRIDER, 3);
				stack.addEnchantment(Enchantments.MENDING, 1);
				break;
		}
	}
	
	public static void attribute(String type, ItemStack stack)
	{
		switch (type.toLowerCase())
		{
			case "helmet":
				stack.addAttributeModifier(Attributes.MAX_HEALTH, new AttributeModifier("generic.maxHealth", 10, AttributeModifier.Operation.ADDITION), EquipmentSlotType.HEAD);
	            stack.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 5, AttributeModifier.Operation.ADDITION), EquipmentSlotType.HEAD);
				break;
			case "chestplate":
				stack.addAttributeModifier(Attributes.MAX_HEALTH, new AttributeModifier("generic.maxHealth", 10, AttributeModifier.Operation.ADDITION), EquipmentSlotType.CHEST);
	            stack.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 5, AttributeModifier.Operation.ADDITION), EquipmentSlotType.CHEST);
				break;
			case "leggings":
				stack.addAttributeModifier(Attributes.MAX_HEALTH, new AttributeModifier("generic.maxHealth", 10, AttributeModifier.Operation.ADDITION), EquipmentSlotType.LEGS);
	            stack.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 5, AttributeModifier.Operation.ADDITION), EquipmentSlotType.LEGS);
				break;
			case "boots":
				stack.addAttributeModifier(Attributes.MAX_HEALTH, new AttributeModifier("generic.maxHealth", 10, AttributeModifier.Operation.ADDITION), EquipmentSlotType.FEET);
	            stack.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 5, AttributeModifier.Operation.ADDITION), EquipmentSlotType.FEET);
				break;
		}
	}
}
