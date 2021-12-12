diff --git a/Essentials/src/com/earth2me/essentials/Essentials.java b/Essentials/src/com/earth2me/essentials/Essentials.java
index f480d9e..24ac0ad 100644
--- a/Essentials/src/com/earth2me/essentials/Essentials.java
+++ b/Essentials/src/com/earth2me/essentials/Essentials.java
@@ -129,10 +129,10 @@
 				LOGGER.log(Level.WARNING, _("versionMismatch", plugin.getDescription().getName()));
 			}
 		}
-		final Matcher versionMatch = Pattern.compile("git-Bukkit-([0-9]+).([0-9]+).([0-9]+)-R[0-9]+-(?:[0-9]+-g[0-9a-f]+-)?b([0-9]+)jnks.*").matcher(getServer().getVersion());
+		final Matcher versionMatch = Pattern.compile("git-Bukkit-(?:(?:[0-9]+)\\.)+[0-9]+-R[0-9]+-(?:[0-9]+-g[0-9a-f]+-)?b([0-9]+)jnks.*").matcher(getServer().getVersion());
 		if (versionMatch.matches())
 		{
-			final int versionNumber = Integer.parseInt(versionMatch.group(4));
+			final int versionNumber = Integer.parseInt(versionMatch.group(1));
 			if (versionNumber < BUKKIT_VERSION)
 			{
 				LOGGER.log(Level.SEVERE, _("notRecommendedBukkit"));
