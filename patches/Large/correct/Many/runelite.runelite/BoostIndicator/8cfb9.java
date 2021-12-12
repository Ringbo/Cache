diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/boosts/BoostIndicator.java b/runelite-client/src/main/java/net/runelite/client/plugins/boosts/BoostIndicator.java
index 0d3a689..cc4b97a 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/boosts/BoostIndicator.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/boosts/BoostIndicator.java
@@ -81,7 +81,7 @@
 			return new Color(238, 51, 51);
 		}
 
-		return boosted - base < config.boostThreshold() ? Color.YELLOW : Color.GREEN;
+		return boosted - base <= config.boostThreshold() ? Color.YELLOW : Color.GREEN;
 	}
 
 	@Override
