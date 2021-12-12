diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/hiscore/HiscorePanel.java b/runelite-client/src/main/java/net/runelite/client/plugins/hiscore/HiscorePanel.java
index 88d6654..3d4f758 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/hiscore/HiscorePanel.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/hiscore/HiscorePanel.java
@@ -436,7 +436,7 @@
 		For some reason, the fetch results would sometimes return a not null object
 		with all null attributes, to check for that, i'll just null check one of the attributes.
 		 */
-		if (result.getAttack() == null)
+		if (result == null || result.getAttack() == null)
 		{
 			input.setIcon(ERROR_ICON);
 			input.setEditable(true);
