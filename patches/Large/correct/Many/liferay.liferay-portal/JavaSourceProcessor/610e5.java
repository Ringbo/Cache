diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JavaSourceProcessor.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JavaSourceProcessor.java
index 2ff00b8..e991524 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JavaSourceProcessor.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/JavaSourceProcessor.java
@@ -1336,9 +1336,9 @@
 				strippedQuotesLine, StringPool.OPEN_PARENTHESIS);
 
 			if ((previousLineLength > 0) &&
-				(line.endsWith("||") || line.endsWith("&&") ||
+				(line.endsWith("|") || line.endsWith("&&") ||
 				 line.endsWith(") {")) &&
-				(previousLine.endsWith("||") || previousLine.endsWith("&&")) &&
+				(previousLine.endsWith("|") || previousLine.endsWith("&&")) &&
 				(previousLineLength + trimmedLine.length() <
 					_MAX_LINE_LENGTH) &&
 				(openParenthesesCount <= closeParenthesesCount) &&
@@ -1498,7 +1498,7 @@
 
 					if (line.contains(StringPool.TAB + StringPool.SPACE) &&
 						!previousLine.endsWith("&&") &&
-						!previousLine.endsWith("||") &&
+						!previousLine.endsWith("|") &&
 						!previousLine.contains(StringPool.TAB + "((") &&
 						!previousLine.contains(
 							StringPool.TAB + StringPool.LESS_THAN) &&
@@ -1914,7 +1914,8 @@
 						fileName, "{:" + fileName + " " + lineCount);
 				}
 
-				if (trimmedLine.startsWith("if (") ||
+				if (trimmedLine.startsWith("catch (") ||
+					trimmedLine.startsWith("if (") ||
 					trimmedLine.startsWith("else if (") ||
 					trimmedLine.startsWith("while (") ||
 					Validator.isNotNull(ifClause)) {
