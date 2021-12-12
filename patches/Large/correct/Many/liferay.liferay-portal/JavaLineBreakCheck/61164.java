diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java
index dde22bc..3735792 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java
@@ -266,7 +266,7 @@
 		if (line.endsWith(" throws") ||
 			((previousLine.endsWith(StringPool.COMMA) ||
 			  previousLine.endsWith(StringPool.OPEN_PARENTHESIS)) &&
-			 line.contains(" throws ") &&
+			 strippedQuotesLine.contains(" throws ") &&
 			 (line.endsWith(StringPool.OPEN_CURLY_BRACE) ||
 			  line.endsWith(StringPool.SEMICOLON)))) {
 
@@ -276,7 +276,7 @@
 		}
 
 		if (line.endsWith(StringPool.PERIOD) &&
-			line.contains(StringPool.EQUAL)) {
+			strippedQuotesLine.contains(StringPool.EQUAL)) {
 
 			addMessage(
 				fileName, "There should be a line break after '='", lineNumber);
