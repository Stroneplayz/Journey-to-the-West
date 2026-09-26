package net.stronegamez.str_thewest;

import net.stronegamez.str_thewest.item.CustomCreativeTabs;
import net.stronegamez.str_thewest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class ToTheWest {
    public static final String MOD_ID = "str_thewest";
    public static final Logger LOGGER =LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        ModItems.initItems();
        CustomCreativeTabs.initTabs();
    }
}
