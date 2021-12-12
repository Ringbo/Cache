diff --git a/common/buildcraft/energy/TileEngineIron.java b/common/buildcraft/energy/TileEngineIron.java
index 2964f0e..cbc9805 100644
--- a/common/buildcraft/energy/TileEngineIron.java
+++ b/common/buildcraft/energy/TileEngineIron.java
@@ -43,7 +43,7 @@
 public class TileEngineIron extends TileEngine implements ITankContainer {
 
 	public static int MAX_LIQUID = LiquidContainerRegistry.BUCKET_VOLUME * 10;
-	public static float HEAT_PER_MJ = 0.01F;
+	public static float HEAT_PER_MJ = 0.0023F;
 	public static float COOLDOWN_RATE = 0.005F;
 	int burnTime = 0;
 	private LiquidTank fuelTank;
@@ -199,7 +199,7 @@
 			}
 		}
 
-		if (heat > 0 && (penaltyCooling > 0 || !isRedstonePowered)) {
+		if (heat > MIN_HEAT && (penaltyCooling > 0 || !isRedstonePowered)) {
 			heat -= COOLDOWN_RATE;
 
 		}
