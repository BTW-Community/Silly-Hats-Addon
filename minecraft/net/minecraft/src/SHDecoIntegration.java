package net.minecraft.src;

public class SHDecoIntegration {
	private static boolean isDecoInstalled = false;
	public static FCAddOn decoManager = null;
	
	public static final String DECOADDON = "Deco Addon";
	
	public static Item prismarineShard;
	
	public static void init() {
		try {
			if (FCAddOnHandler.isModInstalled(DECOADDON)) {
				decoManager = FCAddOnHandler.getModByName(DECOADDON);
			}
			
			if (decoManager != null) {
				isDecoInstalled = true;
				
				prismarineShard = (Item) getDecoField("prismarineShard");
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	private static Object getDecoField(String fieldName) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		if (isDecoInstalled) {
			return ((DecoManager) decoManager).decoDefs.getClass().getDeclaredField(fieldName).get(null);
		}
		
		return null;
	}
	
	public static boolean isDecoInstalled() {
		return isDecoInstalled;
	}
}