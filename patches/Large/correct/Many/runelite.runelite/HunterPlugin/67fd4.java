diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/hunter/HunterPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/hunter/HunterPlugin.java
index 761e881..9ba95ad 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/hunter/HunterPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/hunter/HunterPlugin.java
@@ -128,7 +128,7 @@
 
 			case ObjectID.MONKEY_TRAP: // Maniacal monkey trap placed
 				// If player is right next to "object" trap assume that player placed the trap
-				if (localPlayer.getWorldLocation().distanceTo(trapLocation) <= 1)
+				if (localPlayer.getWorldLocation().distanceTo(trapLocation) <= 2)
 				{
 					log.debug("Trap placed by \"{}\" on {}", localPlayer.getName(), trapLocation);
 					traps.put(trapLocation, new HunterTrap(gameObject));
