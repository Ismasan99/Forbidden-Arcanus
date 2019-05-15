package com.stal111.forbidden_arcanus.item.tool;

import com.stal111.forbidden_arcanus.Main;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ToolSword extends ItemSword {

	public ToolSword(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn) {
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(Main.FORBIDDEN_ARCANUS));
		this.setRegistryName(new ResourceLocation(Main.MODID, name));
	}

}
