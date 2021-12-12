diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
index 5451cdc..d83100b 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
@@ -337,7 +337,7 @@
 			File file, String fileName, String content, String newContent)
 		throws IOException {
 
-		if (content.equals(newContent)) {
+		if ((newContent == null) || content.equals(newContent)) {
 			return;
 		}
 
