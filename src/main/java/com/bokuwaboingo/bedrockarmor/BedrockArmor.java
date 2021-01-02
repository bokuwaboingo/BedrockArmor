package com.bokuwaboingo.bedrockarmor;

import com.bokuwaboingo.bedrockarmor.core.init.*;

import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
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
			super(ItemGroup.GROUPS.length, "bedrockarmor");
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
                stack.addEnchantment(Enchantments.MENDING, 1);
                stack.addEnchantment(Enchantments.SWEEPING, 3);
                stack.addEnchantment(Enchantments.UNBREAKING, 3);
    			break;
    	}
    }
}
