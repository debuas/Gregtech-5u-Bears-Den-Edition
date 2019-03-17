package gregtech.loaders.misc;

import cpw.mods.fml.common.Loader;
import gregtech.GT5_Mod;
import gregtech.common.items.ItemComb;

public class GT_Bees {

    public static ItemComb combs;

    public GT_Bees() {
        if (Loader.isModLoaded("Forestry") && GT5_Mod.gregtechproxy.mGTBees) {
            combs = new ItemComb();
            combs.initCombsRecipes();
            GT_BeeDefinition.initBees();            
        }
    }
}
