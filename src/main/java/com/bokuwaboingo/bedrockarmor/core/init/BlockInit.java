package com.bokuwaboingo.bedrockarmor.core.init;

import com.bokuwaboingo.bedrockarmor.BedrockArmor;
import com.bokuwaboingo.bedrockarmor.common.blocks.BedrockRandomizerBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.*;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BedrockArmor.MOD_ID);
	
	public static final RegistryObject<Block> BEDROCK_RANDOMIZER_BLOCK = BLOCKS.register("bedrock_randomizer_block", () -> new BedrockRandomizerBlock());
}
