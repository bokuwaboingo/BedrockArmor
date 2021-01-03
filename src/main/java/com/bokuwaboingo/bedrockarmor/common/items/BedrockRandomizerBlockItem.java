package com.bokuwaboingo.bedrockarmor.common.items;

import com.bokuwaboingo.bedrockarmor.BedrockArmor.BedrockArmorItemGroup;

import net.minecraft.block.Block;
import net.minecraft.item.*;

public class BedrockRandomizerBlockItem extends BlockItem
{
	public BedrockRandomizerBlockItem(Block blockIn)
	{
		super(blockIn, new Item.Properties().group(BedrockArmorItemGroup.instance));
	}
}
