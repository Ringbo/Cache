diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
index fb0d303..63765fb 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/BaseSourceProcessor.java
@@ -859,7 +859,7 @@
 		List<String> exclusions, String fileName, int lineCount,
 		String javaTermName) {
 
-		if (exclusions.isEmpty()) {
+		if (ListUtil.isEmpty(exclusions)) {
 			return false;
 		}
 
