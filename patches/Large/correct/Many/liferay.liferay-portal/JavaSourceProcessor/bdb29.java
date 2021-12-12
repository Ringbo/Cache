diff --git a/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java b/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java
index 65d8a45..67e108e 100644
--- a/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java
+++ b/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java
@@ -3138,7 +3138,9 @@
 		for (int i = 1; i < exceptions.length; i++) {
 			String exception = exceptions[i];
 
-			if (exception.equals(StringPool.OPEN_CURLY_BRACE)) {
+			if (exception.equals(StringPool.OPEN_CURLY_BRACE) ||
+				exception.equals(StringPool.SEMICOLON)) {
+
 				break;
 			}
 
