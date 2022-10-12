package net.anchit.tutorialmod.item;

import net.anchit.tutorialmod.TutorialMod;
import net.anchit.tutorialmod.item.custom.EightBallItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> MIDNIGHT_EMERALD = ITEMS.register("midnight_emerald",
            ()->new Item(new Item.Properties().tab((ModCreativeModeTab.CUSTOM_TAB))));
    public static final RegistryObject<Item> MIDNIGHT_ESSENCE = ITEMS.register("midnight_essence",
            ()->new Item(new Item.Properties().tab((ModCreativeModeTab.CUSTOM_TAB))));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            ()->new EightBallItem(new Item.Properties().tab((ModCreativeModeTab.CUSTOM_TAB))));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
