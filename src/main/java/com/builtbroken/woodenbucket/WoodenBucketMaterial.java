package com.builtbroken.woodenbucket;

import com.builtbroken.mc.fluids.bucket.BucketMaterial;
import net.minecraft.item.ItemStack;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 3/3/2017.
 */
public class WoodenBucketMaterial extends BucketMaterial
{
    public WoodenBucketMaterial(String localization, String textureName)
    {
        super(localization, textureName);
    }

    @Override
    public BucketMaterial getDamagedBucket(ItemStack stack)
    {
        return BucketTypes.CHARRED.material;
    }
}
