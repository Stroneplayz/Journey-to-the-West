package net.stronegamez.str_thewest.item;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.stronegamez.str_thewest.ToTheWest;

public class CustomCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(ToTheWest.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static RegistrySupplier<CreativeModeTab> THEWEST_WEAPONS_TABS;

    public static void initTabs(){
        THEWEST_WEAPONS_TABS = TABS.register("thewest_weapons_tab", () -> CreativeTabRegistry
                .create(Component.translatable("category.thewest_tab_weapons"), () -> new ItemStack(ModItems.BO_STAFF)));

        TABS.register();
    }
}
