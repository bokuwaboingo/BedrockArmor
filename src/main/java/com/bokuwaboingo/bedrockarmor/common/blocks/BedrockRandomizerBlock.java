package com.bokuwaboingo.bedrockarmor.common.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class BedrockRandomizerBlock extends Block
{
	public BedrockRandomizerBlock()
	{
		super(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(0.2F, 6000000.0F).sound(SoundType.STONE));
	}
}
