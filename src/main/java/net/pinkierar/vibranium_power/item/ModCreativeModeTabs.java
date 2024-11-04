package net.pinkierar.vibranium_power.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pinkierar.vibranium_power.VibraniumPowerMod;
import net.pinkierar.vibranium_power.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VibraniumPowerMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VIBRANIUM_POWER_TAB =
            CREATIVE_MODE_TABS.register("vibranium_power_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.VIBRANIUM_INGOT.get()))
                            .title(Component.translatable("creative_tab.vibranium_power_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.VIBRANIUM_INGOT.get());
                                output.accept(ModItems.RAW_VIBRANIUM.get());

                                output.accept(ModBlocks.VIBRANIUM_BLOCK.get());
                            })
                            .build());

    public static void register(final IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
