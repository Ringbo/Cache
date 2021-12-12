diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java
index b03c128b..39c9c1b 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java
@@ -922,7 +922,8 @@
 						x = x + pos + 1;
 					}
 				}
-				else if ((trimmedLine.length() + previousLineLength) <
+				else if (!trimmedPreviousLine.startsWith(").") &&
+						 (trimmedLine.length() + previousLineLength) <
 							getMaxLineLength()) {
 
 					if ((getLevel(line, "{", "}") == 0) &&
