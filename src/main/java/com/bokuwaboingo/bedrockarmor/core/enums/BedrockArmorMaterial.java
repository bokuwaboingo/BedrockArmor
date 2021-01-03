package com.bokuwaboingo.bedrockarmor.core.enums;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.*;
import net.minecraftforge.api.distmarker.*;

public enum BedrockArmorMaterial implements IArmorMaterial
{
	BEDROCK(BedrockArmor.MOD_ID + ":bedrock", 100, new int[] { 3, 6, 8, 3 }, 30, SoundEvents.BLOCK_STONE_PLACE, 3.0f, 0.1f, () -> {
		return Ingredient.fromItems(Items.BEDROCK);
	});
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 50, 50, 50, 50 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyValue<Ingredient> repairMaterial;

	private BedrockArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial)
	{
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn)
	{
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn)
	{
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability()
	{
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent()
	{
		return this.soundEvent;
	}
	
	@Override
	public float getToughness()
	{
		return this.toughness;
	}
	
	@Override
	public float getKnockbackResistance()
	{
		return this.knockbackResistance;
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		return this.repairMaterial.getValue();
	}
}
