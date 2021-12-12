diff --git a/Essentials/src/com/earth2me/essentials/AlternativeCommandsHandler.java b/Essentials/src/com/earth2me/essentials/AlternativeCommandsHandler.java
index 257d9a1..583401a 100644
--- a/Essentials/src/com/earth2me/essentials/AlternativeCommandsHandler.java
+++ b/Essentials/src/com/earth2me/essentials/AlternativeCommandsHandler.java
@@ -78,7 +78,7 @@
 			while (pcIterator.hasNext())
 			{
 				final PluginCommand pc = pcIterator.next();
-				if (pc.getPlugin().equals(plugin))
+				if (pc.getPlugin() == null || pc.getPlugin().equals(plugin))
 				{
 					pcIterator.remove();
 				}
