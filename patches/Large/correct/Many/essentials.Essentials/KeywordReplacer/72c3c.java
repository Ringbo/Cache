diff --git a/Essentials/src/com/earth2me/essentials/textreader/KeywordReplacer.java b/Essentials/src/com/earth2me/essentials/textreader/KeywordReplacer.java
index 182dba9..782798b 100644
--- a/Essentials/src/com/earth2me/essentials/textreader/KeywordReplacer.java
+++ b/Essentials/src/com/earth2me/essentials/textreader/KeywordReplacer.java
@@ -41,7 +41,7 @@
 			world = user.getLocation().getWorld().getName();
 			worldTime12 = DescParseTickFormat.format12(user.getWorld().getTime());
 			worldTime24 = DescParseTickFormat.format24(user.getWorld().getTime());
-			worldDate = DateFormat.getDateInstance(DateFormat.MEDIUM, ess.getI18n().getCurrentLocale()).format(DescParseTickFormat.ticksToDate(user.getWorld().getTime()));
+			worldDate = DateFormat.getDateInstance(DateFormat.MEDIUM, ess.getI18n().getCurrentLocale()).format(DescParseTickFormat.ticksToDate(user.getWorld().getFullTime()));
 		}
 		else
 		{
