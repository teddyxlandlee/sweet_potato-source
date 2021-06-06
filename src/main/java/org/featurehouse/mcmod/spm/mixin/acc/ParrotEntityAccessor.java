package org.featurehouse.mcmod.spm.mixin.acc;

import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Set;

@Mixin(ParrotEntity.class)
public interface ParrotEntityAccessor {
    @Accessor("TAMING_INGREDIENTS")
    @Mutable
    static Set<Item> getTamingIngredients() {
        throw new AssertionError("Mixin");
    }
}
