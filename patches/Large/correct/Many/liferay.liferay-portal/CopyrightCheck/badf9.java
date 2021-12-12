diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/CopyrightCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/CopyrightCheck.java
index 0533206..471beae 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/CopyrightCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/CopyrightCheck.java
@@ -62,7 +62,7 @@
 		String customCopyright = _getCustomCopyright(absolutePath);
 
 		if (!content.contains(_copyright) &&
-			((customCopyright == null) || !content.contains(_copyright))) {
+			((customCopyright == null) || !content.contains(customCopyright))) {
 
 			addMessage(sourceFormatterMessages, fileName, "Missing copyright");
 		}
