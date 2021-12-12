diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandnear.java b/Essentials/src/com/earth2me/essentials/commands/Commandnear.java
index cfb8d67..95d3ce8 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandnear.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandnear.java
@@ -49,13 +49,13 @@
 				if (playerLoc.getWorld() != world) { continue; }
 				
 				final double delta = playerLoc.distanceSquared(loc);				
-				if (delta > radius)
+				if (delta < radius)
 				{
 					if (output.length() > 0)
 					{
 						output.append(", ");
 					}
-					output.append(user.getDisplayName()).append("&f(&4").append(delta).append("m&f)");
+					output.append(player.getDisplayName()).append("&f(&4").append(delta).append("m&f)");
 				}
 			}
 		}
