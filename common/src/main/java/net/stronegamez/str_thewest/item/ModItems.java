package net.stronegamez.str_thewest.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.stronegamez.str_thewest.ToTheWest;

import java.util.function.Supplier;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ToTheWest.MOD_ID, Registries.ITEM);

    public static RegistrySupplier<Item> BO_STAFF;

    public static void initItems() {
        BO_STAFF = registerItem("bo_staff", () -> new Item(baseProperties("bo_staff").arch$tab(CustomCreativeTabs.THEWEST_TABS)));

        ITEMS.register();
    }

    public static RegistrySupplier<Item> registerItem(String name, Supplier<Item> item){
        return ITEMS.register(ResourceLocation.fromNamespaceAndPath(ToTheWest.MOD_ID, name), item);
    }

    public static Item.Properties baseProperties(String name){
        return new Item.Properties();
    }
}
