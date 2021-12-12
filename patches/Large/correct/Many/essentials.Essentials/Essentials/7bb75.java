diff --git a/Essentials/src/com/earth2me/essentials/Essentials.java b/Essentials/src/com/earth2me/essentials/Essentials.java
index 24ac0ad..d7f749e 100644
--- a/Essentials/src/com/earth2me/essentials/Essentials.java
+++ b/Essentials/src/com/earth2me/essentials/Essentials.java
@@ -133,7 +133,7 @@
 		if (versionMatch.matches())
 		{
 			final int versionNumber = Integer.parseInt(versionMatch.group(1));
-			if (versionNumber < BUKKIT_VERSION)
+			if (versionNumber < BUKKIT_VERSION && versionNumber > 100)
 			{
 				LOGGER.log(Level.SEVERE, _("notRecommendedBukkit"));
 				LOGGER.log(Level.SEVERE, _("requiredBukkit", Integer.toString(BUKKIT_VERSION)));
