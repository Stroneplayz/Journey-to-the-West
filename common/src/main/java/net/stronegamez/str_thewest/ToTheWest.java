package net.stronegamez.str_thewest;


import net.stronegamez.str_thewest.item.CustomCreativeTabs;
import net.stronegamez.str_thewest.item.ModItems;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public final class ToTheWest {
    public static final String MOD_ID = "str_thewest";
    public static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        ModItems.initItems();
        CustomCreativeTabs.initTabs();
    }
}
