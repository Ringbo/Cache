diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaComponentAnnotationsCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaComponentAnnotationsCheck.java
index c4135b9..2b58bac 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaComponentAnnotationsCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaComponentAnnotationsCheck.java
@@ -85,7 +85,7 @@
 		Matcher matcher = _attributePattern.matcher(annotation);
 
 		while (matcher.find()) {
-			if (!ToolsUtil.isInsideQuotes(annotation, matcher.end()) &&
+			if (!ToolsUtil.isInsideQuotes(annotation, matcher.end(1)) &&
 				(getLevel(annotation.substring(0, matcher.end()), "{", "}") ==
 					0)) {
 
