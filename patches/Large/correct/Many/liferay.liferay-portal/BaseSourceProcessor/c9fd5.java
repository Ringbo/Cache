diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
index 7641801..9c1197d 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
@@ -292,7 +292,9 @@
 	protected void checkInefficientStringMethods(
 		String line, String fileName, String absolutePath, int lineCount) {
 
-		if (isRunsOutsidePortal(absolutePath)) {
+		if (isRunsOutsidePortal(absolutePath) ||
+			fileName.endsWith("GetterUtil.java")) {
+
 			return;
 		}
 
