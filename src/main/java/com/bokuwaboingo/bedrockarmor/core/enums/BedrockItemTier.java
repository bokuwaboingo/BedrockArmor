package com.bokuwaboingo.bedrockarmor.core.enums;

import java.util.function.Supplier;

import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum BedrockItemTier implements IItemTier
{
	BEDROCK(4, 5000, 9f, 4f, 30, () -> {
		return Ingredient.fromItems(Items.BEDROCK);
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;

	private BedrockItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() 
	{
		return this.maxUses;
	}

	@Override
	public float getEfficiency()
	{
		return this.efficiency;
	}

	@Override
	public float getAttackDamage()
	{
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability()
	{
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		return this.repairMaterial.getValue();
	}
}
