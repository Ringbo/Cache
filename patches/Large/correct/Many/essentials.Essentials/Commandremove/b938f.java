diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandremove.java b/Essentials/src/com/earth2me/essentials/commands/Commandremove.java
index 87f4729..1f1dfef 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandremove.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandremove.java
@@ -173,7 +173,7 @@
 				}
 				else if (toRemove == ToRemove.ITEMFRAMES)
 				{
-					if (e instanceof Painting)
+					if (e instanceof ItemFrame)
 					{
 						e.remove();
 						removed++;
