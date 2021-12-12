diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
index 60cd61e..fd45d8e 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
@@ -1665,7 +1665,8 @@
 						fileName, "line break: " + fileName + " " + lineCount);
 				}
 
-				if (trimmedLine.startsWith(StringPool.CLOSE_CURLY_BRACE) &&
+				if (!trimmedLine.equals("}) {") &&
+					trimmedLine.startsWith(StringPool.CLOSE_CURLY_BRACE) &&
 					line.endsWith(StringPool.OPEN_CURLY_BRACE)) {
 
 					processErrorMessage(
