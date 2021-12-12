diff --git a/Essentials/src/com/earth2me/essentials/Kit.java b/Essentials/src/com/earth2me/essentials/Kit.java
index ef67599..4f0957f 100644
--- a/Essentials/src/com/earth2me/essentials/Kit.java
+++ b/Essentials/src/com/earth2me/essentials/Kit.java
@@ -114,7 +114,7 @@
 					continue;
 				}
 
-				final String[] parts = d.split(" ", 3);
+				final String[] parts = d.split(" ");
 				final ItemStack stack = ess.getItemDb().get(parts[0], parts.length > 1 ? Integer.parseInt(parts[1]) : 1);
 
 				if (parts.length > 2)
