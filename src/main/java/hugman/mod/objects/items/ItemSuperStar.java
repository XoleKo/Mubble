package hugman.mod.objects.items;

import hugman.mod.Main;
import hugman.mod.init.ItemInit;
import hugman.mod.util.handlers.SoundHandler;
import hugman.mod.util.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSuperStar extends ItemFood implements IHasModel
{
	/**
	 * Static class - can only be initialized once.
	 */
	public ItemSuperStar()
	{
		super(3, 2.4f, false);
		setTranslationKey("super_star");
		setRegistryName("super_star");
		setCreativeTab(Main.MUBBLE_ITEMS);
		setAlwaysEdible();
		ItemInit.ITEMS.add(this);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 600, 1));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 600, 1));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 600, 2));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 600, 1));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 600, 0));
		playerIn.playSound(SoundHandler.ITEM_SUPER_STAR_THEME, 60000000, 1);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
