diff --git a/Essentials/src/com/earth2me/essentials/NetherPortal.java b/Essentials/src/com/earth2me/essentials/NetherPortal.java
index 25ebe5e..76d75dd 100644
--- a/Essentials/src/com/earth2me/essentials/NetherPortal.java
+++ b/Essentials/src/com/earth2me/essentials/NetherPortal.java
@@ -41,12 +41,12 @@
 		{
 		// portal is in X direction
 			return new Location(block.getWorld(), block.getX() + 1,
-								block.getY(), block.getZ() + 1.5 - 2 * Math.round(Math.random()));
+								block.getY(), block.getZ() + 1 - 2 * Math.round(Math.random()));
 		}
 		else
 		{
 		// portal is in Z direction
-			return new Location(block.getWorld(), block.getX() + 1.5 - 2 * Math.round(Math.random()),
+			return new Location(block.getWorld(), block.getX() + 1 - 2 * Math.round(Math.random()),
 								block.getY(), block.getZ() + 1);
 		}
 	}
