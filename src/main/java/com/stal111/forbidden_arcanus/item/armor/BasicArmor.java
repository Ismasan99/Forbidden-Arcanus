package com.stal111.forbidden_arcanus.item.armor;

import com.stal111.forbidden_arcanus.Main;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class BasicArmor extends ItemArmor {

	public BasicArmor(String name, IArmorMaterial materialIn, EntityEquipmentSlot slots) {
		super(materialIn, slots, new Item.Properties().group(Main.FORBIDDEN_ARCANUS));
		this.setRegistryName(new ResourceLocation(Main.MODID, name));
	}
	
	

}
