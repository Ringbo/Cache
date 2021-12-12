diff --git a/Essentials/src/com/earth2me/essentials/Settings.java b/Essentials/src/com/earth2me/essentials/Settings.java
index 1ac58d8..8dd6e6f 100644
--- a/Essentials/src/com/earth2me/essentials/Settings.java
+++ b/Essentials/src/com/earth2me/essentials/Settings.java
@@ -243,7 +243,7 @@
 	{
 		Set<String> socialspyCommands = new HashSet<String>();
 
-		if (config.isConfigurationSection("socialspy-commands"))
+		if (config.isList("socialspy-commands"))
 		{
 			for (String c : config.getStringList("socialspy-commands"))
 			{
