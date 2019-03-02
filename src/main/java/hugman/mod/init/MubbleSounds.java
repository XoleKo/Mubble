package hugman.mod.init;

import hugman.mod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class MubbleSounds 
{
	public static SoundEvent
	BLOCK_EMPTY_BLOCK_HIT,
	BLOCK_NOTE_BLOCK_JUMP_HIGH,
	BLOCK_NOTE_BLOCK_JUMP_LOW,
	BLOCK_QUESTION_BLOCK_LOOT_POWER_UP,
	BLOCK_QUESTION_BLOCK_LOOT_COIN;
	
	public static void registerSounds()
	{
		BLOCK_EMPTY_BLOCK_HIT = register("block.empty_block.hit");
		BLOCK_NOTE_BLOCK_JUMP_HIGH = register("block.note_block.jump.high");
		BLOCK_NOTE_BLOCK_JUMP_LOW = register("block.note_block.jump.low");
		BLOCK_QUESTION_BLOCK_LOOT_POWER_UP = register("block.question_block.loot.power_up");
		BLOCK_QUESTION_BLOCK_LOOT_COIN = register("block.question_block.loot.coin");
	}
	
	private static SoundEvent register(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}