diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/SpecialCounter.java b/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/SpecialCounter.java
index 8d853c3..083ef5b 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/SpecialCounter.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/SpecialCounter.java
@@ -27,19 +27,19 @@
 import java.awt.image.BufferedImage;
 import net.runelite.client.ui.overlay.infobox.Counter;
 
-public class SpecialCounter extends Counter
+class SpecialCounter extends Counter
 {
 	private int hitValue;
 	private SpecialWeapon weapon;
 
-	public SpecialCounter(BufferedImage image, SpecialCounterPlugin plugin, int hitValue, SpecialWeapon weapon)
+	SpecialCounter(BufferedImage image, SpecialCounterPlugin plugin, int hitValue, SpecialWeapon weapon)
 	{
 		super(image, plugin, null);
 		this.weapon = weapon;
 		this.hitValue = hitValue;
 	}
 
-	public void addHits(double hit)
+	void addHits(double hit)
 	{
 		this.hitValue += hit;
 	}
