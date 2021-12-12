diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JSPSourceProcessor.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JSPSourceProcessor.java
index d8f5983..3d7d3a4 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JSPSourceProcessor.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JSPSourceProcessor.java
@@ -836,7 +836,7 @@
 
 				// LPS-55341
 
-				if (!javaSource) {
+				if (javaSource) {
 					line = StringUtil.replace(
 						line, "LanguageUtil.get(locale,",
 						"LanguageUtil.get(request,");
