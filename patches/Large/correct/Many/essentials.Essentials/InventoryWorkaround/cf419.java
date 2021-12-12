diff --git a/Essentials/src/com/earth2me/essentials/InventoryWorkaround.java b/Essentials/src/com/earth2me/essentials/InventoryWorkaround.java
index 3cbcd1b..e163cfb 100644
--- a/Essentials/src/com/earth2me/essentials/InventoryWorkaround.java
+++ b/Essentials/src/com/earth2me/essentials/InventoryWorkaround.java
@@ -100,9 +100,9 @@
 		}
 
 
-		for (int i = 0; i < items.length; i++)
+		for (int i = 0; i < combined.length; i++)
 		{
-			final ItemStack item = items[i];
+			final ItemStack item = combined[i];
 			while (true)
 			{
 				// Do we already have a stack of it?
